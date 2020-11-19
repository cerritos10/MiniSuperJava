/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.exceptions.IllegalOrphanException;
import Controller.exceptions.NonexistentEntityException;
import Controller.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidad.Productos;
import Entidad.TipoProducto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author cerri
 */
public class TipoProductoJpaController1 implements Serializable {

    public TipoProductoJpaController1(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoProducto tipoProducto) throws PreexistingEntityException, Exception {
        if (tipoProducto.getProductosList() == null) {
            tipoProducto.setProductosList(new ArrayList<Productos>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Productos> attachedProductosList = new ArrayList<Productos>();
            for (Productos productosListProductosToAttach : tipoProducto.getProductosList()) {
                productosListProductosToAttach = em.getReference(productosListProductosToAttach.getClass(), productosListProductosToAttach.getIdProducto());
                attachedProductosList.add(productosListProductosToAttach);
            }
            tipoProducto.setProductosList(attachedProductosList);
            em.persist(tipoProducto);
            for (Productos productosListProductos : tipoProducto.getProductosList()) {
                TipoProducto oldIdTipoProductoOfProductosListProductos = productosListProductos.getIdTipoProducto();
                productosListProductos.setIdTipoProducto(tipoProducto);
                productosListProductos = em.merge(productosListProductos);
                if (oldIdTipoProductoOfProductosListProductos != null) {
                    oldIdTipoProductoOfProductosListProductos.getProductosList().remove(productosListProductos);
                    oldIdTipoProductoOfProductosListProductos = em.merge(oldIdTipoProductoOfProductosListProductos);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTipoProducto(tipoProducto.getIdTipoProducto()) != null) {
                throw new PreexistingEntityException("TipoProducto " + tipoProducto + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoProducto tipoProducto) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoProducto persistentTipoProducto = em.find(TipoProducto.class, tipoProducto.getIdTipoProducto());
            List<Productos> productosListOld = persistentTipoProducto.getProductosList();
            List<Productos> productosListNew = tipoProducto.getProductosList();
            List<String> illegalOrphanMessages = null;
            for (Productos productosListOldProductos : productosListOld) {
                if (!productosListNew.contains(productosListOldProductos)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Productos " + productosListOldProductos + " since its idTipoProducto field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Productos> attachedProductosListNew = new ArrayList<Productos>();
            for (Productos productosListNewProductosToAttach : productosListNew) {
                productosListNewProductosToAttach = em.getReference(productosListNewProductosToAttach.getClass(), productosListNewProductosToAttach.getIdProducto());
                attachedProductosListNew.add(productosListNewProductosToAttach);
            }
            productosListNew = attachedProductosListNew;
            tipoProducto.setProductosList(productosListNew);
            tipoProducto = em.merge(tipoProducto);
            for (Productos productosListNewProductos : productosListNew) {
                if (!productosListOld.contains(productosListNewProductos)) {
                    TipoProducto oldIdTipoProductoOfProductosListNewProductos = productosListNewProductos.getIdTipoProducto();
                    productosListNewProductos.setIdTipoProducto(tipoProducto);
                    productosListNewProductos = em.merge(productosListNewProductos);
                    if (oldIdTipoProductoOfProductosListNewProductos != null && !oldIdTipoProductoOfProductosListNewProductos.equals(tipoProducto)) {
                        oldIdTipoProductoOfProductosListNewProductos.getProductosList().remove(productosListNewProductos);
                        oldIdTipoProductoOfProductosListNewProductos = em.merge(oldIdTipoProductoOfProductosListNewProductos);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = tipoProducto.getIdTipoProducto();
                if (findTipoProducto(id) == null) {
                    throw new NonexistentEntityException("The tipoProducto with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoProducto tipoProducto;
            try {
                tipoProducto = em.getReference(TipoProducto.class, id);
                tipoProducto.getIdTipoProducto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoProducto with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Productos> productosListOrphanCheck = tipoProducto.getProductosList();
            for (Productos productosListOrphanCheckProductos : productosListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This TipoProducto (" + tipoProducto + ") cannot be destroyed since the Productos " + productosListOrphanCheckProductos + " in its productosList field has a non-nullable idTipoProducto field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(tipoProducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoProducto> findTipoProductoEntities() {
        return findTipoProductoEntities(true, -1, -1);
    }

    public List<TipoProducto> findTipoProductoEntities(int maxResults, int firstResult) {
        return findTipoProductoEntities(false, maxResults, firstResult);
    }

    private List<TipoProducto> findTipoProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoProducto.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TipoProducto findTipoProducto(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoProducto.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoProducto> rt = cq.from(TipoProducto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

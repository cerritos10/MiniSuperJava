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
import Entidad.TipoProducto;
import Entidad.DetalleVentas;
import java.util.ArrayList;
import java.util.List;
import Entidad.Compra;
import Entidad.Productos;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author cerri
 */
public class ProductosJpaController implements Serializable {

    public ProductosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SuperPU");

    public ProductosJpaController() {
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Productos productos) throws PreexistingEntityException, Exception {
//        if (productos.getDetalleVentasList() == null) {
//            productos.setDetalleVentasList(new ArrayList<DetalleVentas>());
//        }
//        if (productos.getCompraList() == null) {
//            productos.setCompraList(new ArrayList<Compra>());
//        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
//            TipoProducto idTipoProducto = productos.getIdTipoProducto();
//            if (idTipoProducto != null) {
//                idTipoProducto = em.getReference(idTipoProducto.getClass(), idTipoProducto.getIdTipoProducto());
//                productos.setIdTipoProducto(idTipoProducto);
//            }
//            List<DetalleVentas> attachedDetalleVentasList = new ArrayList<DetalleVentas>();
//            for (DetalleVentas detalleVentasListDetalleVentasToAttach : productos.getDetalleVentasList()) {
//                detalleVentasListDetalleVentasToAttach = em.getReference(detalleVentasListDetalleVentasToAttach.getClass(), detalleVentasListDetalleVentasToAttach.getIdDetalle());
//                attachedDetalleVentasList.add(detalleVentasListDetalleVentasToAttach);
//            }
//            productos.setDetalleVentasList(attachedDetalleVentasList);
//            List<Compra> attachedCompraList = new ArrayList<Compra>();
//            for (Compra compraListCompraToAttach : productos.getCompraList()) {
//                compraListCompraToAttach = em.getReference(compraListCompraToAttach.getClass(), compraListCompraToAttach.getIdCompra());
//                attachedCompraList.add(compraListCompraToAttach);
//            }
//            productos.setCompraList(attachedCompraList);
            em.persist(productos);
//            if (idTipoProducto != null) {
//                idTipoProducto.getProductosList().add(productos);
//                idTipoProducto = em.merge(idTipoProducto);
//            }
//            for (DetalleVentas detalleVentasListDetalleVentas : productos.getDetalleVentasList()) {
//                Productos oldIdProductoOfDetalleVentasListDetalleVentas = detalleVentasListDetalleVentas.getIdProducto();
//                detalleVentasListDetalleVentas.setIdProducto(productos);
//                detalleVentasListDetalleVentas = em.merge(detalleVentasListDetalleVentas);
//                if (oldIdProductoOfDetalleVentasListDetalleVentas != null) {
//                    oldIdProductoOfDetalleVentasListDetalleVentas.getDetalleVentasList().remove(detalleVentasListDetalleVentas);
//                    oldIdProductoOfDetalleVentasListDetalleVentas = em.merge(oldIdProductoOfDetalleVentasListDetalleVentas);
//                }
//            }
//            for (Compra compraListCompra : productos.getCompraList()) {
//                Productos oldIdProductoOfCompraListCompra = compraListCompra.getIdProducto();
//                compraListCompra.setIdProducto(productos);
//                compraListCompra = em.merge(compraListCompra);
//                if (oldIdProductoOfCompraListCompra != null) {
//                    oldIdProductoOfCompraListCompra.getCompraList().remove(compraListCompra);
//                    oldIdProductoOfCompraListCompra = em.merge(oldIdProductoOfCompraListCompra);
//                }
//            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findProductos(productos.getIdProducto()) != null) {
                throw new PreexistingEntityException("Productos " + productos + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Productos productos) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
//            Productos persistentProductos = em.find(Productos.class, productos.getIdProducto());
//            TipoProducto idTipoProductoOld = persistentProductos.getIdTipoProducto();
//            TipoProducto idTipoProductoNew = productos.getIdTipoProducto();
//            List<DetalleVentas> detalleVentasListOld = persistentProductos.getDetalleVentasList();
//            List<DetalleVentas> detalleVentasListNew = productos.getDetalleVentasList();
//            List<Compra> compraListOld = persistentProductos.getCompraList();
//            List<Compra> compraListNew = productos.getCompraList();
//            List<String> illegalOrphanMessages = null;
//            for (DetalleVentas detalleVentasListOldDetalleVentas : detalleVentasListOld) {
//                if (!detalleVentasListNew.contains(detalleVentasListOldDetalleVentas)) {
//                    if (illegalOrphanMessages == null) {
//                        illegalOrphanMessages = new ArrayList<String>();
//                    }
//                    illegalOrphanMessages.add("You must retain DetalleVentas " + detalleVentasListOldDetalleVentas + " since its idProducto field is not nullable.");
//                }
//            }
//            for (Compra compraListOldCompra : compraListOld) {
//                if (!compraListNew.contains(compraListOldCompra)) {
//                    if (illegalOrphanMessages == null) {
//                        illegalOrphanMessages = new ArrayList<String>();
//                    }
//                    illegalOrphanMessages.add("You must retain Compra " + compraListOldCompra + " since its idProducto field is not nullable.");
//                }
//            }
//            if (illegalOrphanMessages != null) {
//                throw new IllegalOrphanException(illegalOrphanMessages);
//            }
//            if (idTipoProductoNew != null) {
//                idTipoProductoNew = em.getReference(idTipoProductoNew.getClass(), idTipoProductoNew.getIdTipoProducto());
//                productos.setIdTipoProducto(idTipoProductoNew);
//            }
//            List<DetalleVentas> attachedDetalleVentasListNew = new ArrayList<DetalleVentas>();
//            for (DetalleVentas detalleVentasListNewDetalleVentasToAttach : detalleVentasListNew) {
//                detalleVentasListNewDetalleVentasToAttach = em.getReference(detalleVentasListNewDetalleVentasToAttach.getClass(), detalleVentasListNewDetalleVentasToAttach.getIdDetalle());
//                attachedDetalleVentasListNew.add(detalleVentasListNewDetalleVentasToAttach);
//            }
//            detalleVentasListNew = attachedDetalleVentasListNew;
//            productos.setDetalleVentasList(detalleVentasListNew);
//            List<Compra> attachedCompraListNew = new ArrayList<Compra>();
//            for (Compra compraListNewCompraToAttach : compraListNew) {
//                compraListNewCompraToAttach = em.getReference(compraListNewCompraToAttach.getClass(), compraListNewCompraToAttach.getIdCompra());
//                attachedCompraListNew.add(compraListNewCompraToAttach);
//            }
//            compraListNew = attachedCompraListNew;
//            productos.setCompraList(compraListNew);
            productos = em.merge(productos);
//            if (idTipoProductoOld != null && !idTipoProductoOld.equals(idTipoProductoNew)) {
//                idTipoProductoOld.getProductosList().remove(productos);
//                idTipoProductoOld = em.merge(idTipoProductoOld);
//            }
//            if (idTipoProductoNew != null && !idTipoProductoNew.equals(idTipoProductoOld)) {
//                idTipoProductoNew.getProductosList().add(productos);
//                idTipoProductoNew = em.merge(idTipoProductoNew);
//            }
//            for (DetalleVentas detalleVentasListNewDetalleVentas : detalleVentasListNew) {
//                if (!detalleVentasListOld.contains(detalleVentasListNewDetalleVentas)) {
//                    Productos oldIdProductoOfDetalleVentasListNewDetalleVentas = detalleVentasListNewDetalleVentas.getIdProducto();
//                    detalleVentasListNewDetalleVentas.setIdProducto(productos);
//                    detalleVentasListNewDetalleVentas = em.merge(detalleVentasListNewDetalleVentas);
//                    if (oldIdProductoOfDetalleVentasListNewDetalleVentas != null && !oldIdProductoOfDetalleVentasListNewDetalleVentas.equals(productos)) {
//                        oldIdProductoOfDetalleVentasListNewDetalleVentas.getDetalleVentasList().remove(detalleVentasListNewDetalleVentas);
//                        oldIdProductoOfDetalleVentasListNewDetalleVentas = em.merge(oldIdProductoOfDetalleVentasListNewDetalleVentas);
//                    }
//                }
//            }
//            for (Compra compraListNewCompra : compraListNew) {
//                if (!compraListOld.contains(compraListNewCompra)) {
//                    Productos oldIdProductoOfCompraListNewCompra = compraListNewCompra.getIdProducto();
//                    compraListNewCompra.setIdProducto(productos);
//                    compraListNewCompra = em.merge(compraListNewCompra);
//                    if (oldIdProductoOfCompraListNewCompra != null && !oldIdProductoOfCompraListNewCompra.equals(productos)) {
//                        oldIdProductoOfCompraListNewCompra.getCompraList().remove(compraListNewCompra);
//                        oldIdProductoOfCompraListNewCompra = em.merge(oldIdProductoOfCompraListNewCompra);
//                    }
//                }
//            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = productos.getIdProducto();
                if (findProductos(id) == null) {
                    throw new NonexistentEntityException("The productos with id " + id + " no longer exists.");
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
            Productos productos;
            try {
                productos = em.getReference(Productos.class, id);
                productos.getIdProducto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The productos with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<DetalleVentas> detalleVentasListOrphanCheck = productos.getDetalleVentasList();
            for (DetalleVentas detalleVentasListOrphanCheckDetalleVentas : detalleVentasListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Productos (" + productos + ") cannot be destroyed since the DetalleVentas " + detalleVentasListOrphanCheckDetalleVentas + " in its detalleVentasList field has a non-nullable idProducto field.");
            }
            List<Compra> compraListOrphanCheck = productos.getCompraList();
            for (Compra compraListOrphanCheckCompra : compraListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Productos (" + productos + ") cannot be destroyed since the Compra " + compraListOrphanCheckCompra + " in its compraList field has a non-nullable idProducto field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            TipoProducto idTipoProducto = productos.getIdTipoProducto();
            if (idTipoProducto != null) {
                idTipoProducto.getProductosList().remove(productos);
                idTipoProducto = em.merge(idTipoProducto);
            }
            em.remove(productos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Productos> findProductosEntities() {
        return findProductosEntities(true, -1, -1);
    }

    public List<Productos> findProductosEntities(int maxResults, int firstResult) {
        return findProductosEntities(false, maxResults, firstResult);
    }

    private List<Productos> findProductosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Productos.class));
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

    public Productos findProductos(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Productos.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Productos> rt = cq.from(Productos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

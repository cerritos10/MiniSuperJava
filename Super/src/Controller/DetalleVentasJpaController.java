/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.exceptions.NonexistentEntityException;
import Controller.exceptions.PreexistingEntityException;
import Entidad.DetalleVentas;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidad.Productos;
import Entidad.Ventas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author cerri
 */
public class DetalleVentasJpaController implements Serializable {

    public DetalleVentasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SuperPU");

    public DetalleVentasJpaController() {
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalleVentas detalleVentas) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Productos idProducto = detalleVentas.getIdProducto();
            if (idProducto != null) {
                idProducto = em.getReference(idProducto.getClass(), idProducto.getIdProducto());
                detalleVentas.setIdProducto(idProducto);
            }
            Ventas idVentas = detalleVentas.getIdVentas();
            if (idVentas != null) {
                idVentas = em.getReference(idVentas.getClass(), idVentas.getIdVentas());
                detalleVentas.setIdVentas(idVentas);
            }
            em.persist(detalleVentas);
            if (idProducto != null) {
                idProducto.getDetalleVentasList().add(detalleVentas);
                idProducto = em.merge(idProducto);
            }
            if (idVentas != null) {
                idVentas.getDetalleVentasList().add(detalleVentas);
                idVentas = em.merge(idVentas);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDetalleVentas(detalleVentas.getIdDetalle()) != null) {
                throw new PreexistingEntityException("DetalleVentas " + detalleVentas + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalleVentas detalleVentas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            DetalleVentas persistentDetalleVentas = em.find(DetalleVentas.class, detalleVentas.getIdDetalle());
            Productos idProductoOld = persistentDetalleVentas.getIdProducto();
            Productos idProductoNew = detalleVentas.getIdProducto();
            Ventas idVentasOld = persistentDetalleVentas.getIdVentas();
            Ventas idVentasNew = detalleVentas.getIdVentas();
            if (idProductoNew != null) {
                idProductoNew = em.getReference(idProductoNew.getClass(), idProductoNew.getIdProducto());
                detalleVentas.setIdProducto(idProductoNew);
            }
            if (idVentasNew != null) {
                idVentasNew = em.getReference(idVentasNew.getClass(), idVentasNew.getIdVentas());
                detalleVentas.setIdVentas(idVentasNew);
            }
            detalleVentas = em.merge(detalleVentas);
            if (idProductoOld != null && !idProductoOld.equals(idProductoNew)) {
                idProductoOld.getDetalleVentasList().remove(detalleVentas);
                idProductoOld = em.merge(idProductoOld);
            }
            if (idProductoNew != null && !idProductoNew.equals(idProductoOld)) {
                idProductoNew.getDetalleVentasList().add(detalleVentas);
                idProductoNew = em.merge(idProductoNew);
            }
            if (idVentasOld != null && !idVentasOld.equals(idVentasNew)) {
                idVentasOld.getDetalleVentasList().remove(detalleVentas);
                idVentasOld = em.merge(idVentasOld);
            }
            if (idVentasNew != null && !idVentasNew.equals(idVentasOld)) {
                idVentasNew.getDetalleVentasList().add(detalleVentas);
                idVentasNew = em.merge(idVentasNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalleVentas.getIdDetalle();
                if (findDetalleVentas(id) == null) {
                    throw new NonexistentEntityException("The detalleVentas with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            DetalleVentas detalleVentas;
            try {
                detalleVentas = em.getReference(DetalleVentas.class, id);
                detalleVentas.getIdDetalle();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalleVentas with id " + id + " no longer exists.", enfe);
            }
            Productos idProducto = detalleVentas.getIdProducto();
            if (idProducto != null) {
                idProducto.getDetalleVentasList().remove(detalleVentas);
                idProducto = em.merge(idProducto);
            }
            Ventas idVentas = detalleVentas.getIdVentas();
            if (idVentas != null) {
                idVentas.getDetalleVentasList().remove(detalleVentas);
                idVentas = em.merge(idVentas);
            }
            em.remove(detalleVentas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalleVentas> findDetalleVentasEntities() {
        return findDetalleVentasEntities(true, -1, -1);
    }

    public List<DetalleVentas> findDetalleVentasEntities(int maxResults, int firstResult) {
        return findDetalleVentasEntities(false, maxResults, firstResult);
    }

    private List<DetalleVentas> findDetalleVentasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalleVentas.class));
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

    public DetalleVentas findDetalleVentas(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalleVentas.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalleVentasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalleVentas> rt = cq.from(DetalleVentas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

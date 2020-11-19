/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.exceptions.NonexistentEntityException;
import Controller.exceptions.PreexistingEntityException;
import Entidad.VistaProducto;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author cerri
 */
public class VistaProductoJpaController implements Serializable {

    public VistaProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SuperPU");;

    public VistaProductoJpaController() {
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(VistaProducto vistaProducto) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(vistaProducto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findVistaProducto(vistaProducto.getIdProducto()) != null) {
                throw new PreexistingEntityException("VistaProducto " + vistaProducto + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(VistaProducto vistaProducto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            vistaProducto = em.merge(vistaProducto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = vistaProducto.getIdProducto();
                if (findVistaProducto(id) == null) {
                    throw new NonexistentEntityException("The vistaProducto with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            VistaProducto vistaProducto;
            try {
                vistaProducto = em.getReference(VistaProducto.class, id);
                vistaProducto.getIdProducto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The vistaProducto with id " + id + " no longer exists.", enfe);
            }
            em.remove(vistaProducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<VistaProducto> findVistaProductoEntities() {
        return findVistaProductoEntities(true, -1, -1);
    }

    public List<VistaProducto> findVistaProductoEntities(int maxResults, int firstResult) {
        return findVistaProductoEntities(false, maxResults, firstResult);
    }

    private List<VistaProducto> findVistaProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(VistaProducto.class));
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

    public VistaProducto findVistaProducto(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(VistaProducto.class, id);
        } finally {
            em.close();
        }
    }

    public int getVistaProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<VistaProducto> rt = cq.from(VistaProducto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

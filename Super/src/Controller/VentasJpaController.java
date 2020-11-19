/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controllers.exceptions.IllegalOrphanException;
import Controllers.exceptions.NonexistentEntityException;
import Controllers.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidad.Clientes;
import Entidad.Usuarios;
import Entidad.DetalleVentas;
import Entidad.Ventas;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author cerri
 */
public class VentasJpaController implements Serializable {

    public VentasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SuperPU");

    public VentasJpaController() {
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ventas ventas) throws PreexistingEntityException, Exception {
        if (ventas.getDetalleVentasList() == null) {
            ventas.setDetalleVentasList(new ArrayList<DetalleVentas>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Clientes idCliente = ventas.getIdCliente();
            if (idCliente != null) {
                idCliente = em.getReference(idCliente.getClass(), idCliente.getIdCliente());
                ventas.setIdCliente(idCliente);
            }
            Usuarios idUsuario = ventas.getIdUsuario();
            if (idUsuario != null) {
                idUsuario = em.getReference(idUsuario.getClass(), idUsuario.getIdUsuario());
                ventas.setIdUsuario(idUsuario);
            }
            List<DetalleVentas> attachedDetalleVentasList = new ArrayList<DetalleVentas>();
            for (DetalleVentas detalleVentasListDetalleVentasToAttach : ventas.getDetalleVentasList()) {
                detalleVentasListDetalleVentasToAttach = em.getReference(detalleVentasListDetalleVentasToAttach.getClass(), detalleVentasListDetalleVentasToAttach.getIdDetalle());
                attachedDetalleVentasList.add(detalleVentasListDetalleVentasToAttach);
            }
            ventas.setDetalleVentasList(attachedDetalleVentasList);
            em.persist(ventas);
            if (idCliente != null) {
                idCliente.getVentasList().add(ventas);
                idCliente = em.merge(idCliente);
            }
            if (idUsuario != null) {
                idUsuario.getVentasList().add(ventas);
                idUsuario = em.merge(idUsuario);
            }
            for (DetalleVentas detalleVentasListDetalleVentas : ventas.getDetalleVentasList()) {
                Ventas oldIdVentasOfDetalleVentasListDetalleVentas = detalleVentasListDetalleVentas.getIdVentas();
                detalleVentasListDetalleVentas.setIdVentas(ventas);
                detalleVentasListDetalleVentas = em.merge(detalleVentasListDetalleVentas);
                if (oldIdVentasOfDetalleVentasListDetalleVentas != null) {
                    oldIdVentasOfDetalleVentasListDetalleVentas.getDetalleVentasList().remove(detalleVentasListDetalleVentas);
                    oldIdVentasOfDetalleVentasListDetalleVentas = em.merge(oldIdVentasOfDetalleVentasListDetalleVentas);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findVentas(ventas.getIdVentas()) != null) {
                throw new PreexistingEntityException("Ventas " + ventas + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Ventas ventas) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ventas persistentVentas = em.find(Ventas.class, ventas.getIdVentas());
            Clientes idClienteOld = persistentVentas.getIdCliente();
            Clientes idClienteNew = ventas.getIdCliente();
            Usuarios idUsuarioOld = persistentVentas.getIdUsuario();
            Usuarios idUsuarioNew = ventas.getIdUsuario();
            List<DetalleVentas> detalleVentasListOld = persistentVentas.getDetalleVentasList();
            List<DetalleVentas> detalleVentasListNew = ventas.getDetalleVentasList();
            List<String> illegalOrphanMessages = null;
            for (DetalleVentas detalleVentasListOldDetalleVentas : detalleVentasListOld) {
                if (!detalleVentasListNew.contains(detalleVentasListOldDetalleVentas)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain DetalleVentas " + detalleVentasListOldDetalleVentas + " since its idVentas field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (idClienteNew != null) {
                idClienteNew = em.getReference(idClienteNew.getClass(), idClienteNew.getIdCliente());
                ventas.setIdCliente(idClienteNew);
            }
            if (idUsuarioNew != null) {
                idUsuarioNew = em.getReference(idUsuarioNew.getClass(), idUsuarioNew.getIdUsuario());
                ventas.setIdUsuario(idUsuarioNew);
            }
            List<DetalleVentas> attachedDetalleVentasListNew = new ArrayList<DetalleVentas>();
            for (DetalleVentas detalleVentasListNewDetalleVentasToAttach : detalleVentasListNew) {
                detalleVentasListNewDetalleVentasToAttach = em.getReference(detalleVentasListNewDetalleVentasToAttach.getClass(), detalleVentasListNewDetalleVentasToAttach.getIdDetalle());
                attachedDetalleVentasListNew.add(detalleVentasListNewDetalleVentasToAttach);
            }
            detalleVentasListNew = attachedDetalleVentasListNew;
            ventas.setDetalleVentasList(detalleVentasListNew);
            ventas = em.merge(ventas);
            if (idClienteOld != null && !idClienteOld.equals(idClienteNew)) {
                idClienteOld.getVentasList().remove(ventas);
                idClienteOld = em.merge(idClienteOld);
            }
            if (idClienteNew != null && !idClienteNew.equals(idClienteOld)) {
                idClienteNew.getVentasList().add(ventas);
                idClienteNew = em.merge(idClienteNew);
            }
            if (idUsuarioOld != null && !idUsuarioOld.equals(idUsuarioNew)) {
                idUsuarioOld.getVentasList().remove(ventas);
                idUsuarioOld = em.merge(idUsuarioOld);
            }
            if (idUsuarioNew != null && !idUsuarioNew.equals(idUsuarioOld)) {
                idUsuarioNew.getVentasList().add(ventas);
                idUsuarioNew = em.merge(idUsuarioNew);
            }
            for (DetalleVentas detalleVentasListNewDetalleVentas : detalleVentasListNew) {
                if (!detalleVentasListOld.contains(detalleVentasListNewDetalleVentas)) {
                    Ventas oldIdVentasOfDetalleVentasListNewDetalleVentas = detalleVentasListNewDetalleVentas.getIdVentas();
                    detalleVentasListNewDetalleVentas.setIdVentas(ventas);
                    detalleVentasListNewDetalleVentas = em.merge(detalleVentasListNewDetalleVentas);
                    if (oldIdVentasOfDetalleVentasListNewDetalleVentas != null && !oldIdVentasOfDetalleVentasListNewDetalleVentas.equals(ventas)) {
                        oldIdVentasOfDetalleVentasListNewDetalleVentas.getDetalleVentasList().remove(detalleVentasListNewDetalleVentas);
                        oldIdVentasOfDetalleVentasListNewDetalleVentas = em.merge(oldIdVentasOfDetalleVentasListNewDetalleVentas);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = ventas.getIdVentas();
                if (findVentas(id) == null) {
                    throw new NonexistentEntityException("The ventas with id " + id + " no longer exists.");
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
            Ventas ventas;
            try {
                ventas = em.getReference(Ventas.class, id);
                ventas.getIdVentas();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ventas with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<DetalleVentas> detalleVentasListOrphanCheck = ventas.getDetalleVentasList();
            for (DetalleVentas detalleVentasListOrphanCheckDetalleVentas : detalleVentasListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Ventas (" + ventas + ") cannot be destroyed since the DetalleVentas " + detalleVentasListOrphanCheckDetalleVentas + " in its detalleVentasList field has a non-nullable idVentas field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Clientes idCliente = ventas.getIdCliente();
            if (idCliente != null) {
                idCliente.getVentasList().remove(ventas);
                idCliente = em.merge(idCliente);
            }
            Usuarios idUsuario = ventas.getIdUsuario();
            if (idUsuario != null) {
                idUsuario.getVentasList().remove(ventas);
                idUsuario = em.merge(idUsuario);
            }
            em.remove(ventas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Ventas> findVentasEntities() {
        return findVentasEntities(true, -1, -1);
    }

    public List<Ventas> findVentasEntities(int maxResults, int firstResult) {
        return findVentasEntities(false, maxResults, firstResult);
    }

    private List<Ventas> findVentasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ventas.class));
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

    public Ventas findVentas(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ventas.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Ventas> rt = cq.from(Ventas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

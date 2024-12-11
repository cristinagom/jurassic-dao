package model.dao;

import model.entity.Dinosaur;


import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import java.util.List;

public class DinosaurDAO implements InterfaceDAO<Dinosaur> {

    private EntityManagerFactory emf;
    private EntityManager manager;


    private void initHibernate() {
        emf = Persistence.createEntityManagerFactory("default");
        manager=emf.createEntityManager();
    }

    public DinosaurDAO() {
        initHibernate();
    }

    @Override
    public void create(Dinosaur d) {
        manager.getTransaction().begin();
        manager.persist(d);
        manager.getTransaction().commit();
    }

    @Override
    public List<Dinosaur> findAll() {
        Query query = manager.createQuery("select d from Dinosaur d");
        return query.getResultList();
    }

    @Override
    public void update(Dinosaur d) {
        manager.getTransaction().begin();
        manager.merge(d);
        manager.getTransaction().commit();
    }

    @Override
    public void delete(Dinosaur d) {
        manager.getTransaction().begin();
        Dinosaur dDrop = manager.find(Dinosaur.class, d.getId());
        manager.remove(dDrop);
        manager.getTransaction().commit();
    }
}
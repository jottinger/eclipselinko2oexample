package com.autumncode.jpa;

import com.autumncode.domain.Agency;
import com.autumncode.domain.Backlog;
import org.testng.annotations.Test;

import javax.persistence.*;

public class TestData {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");

    EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    @Test
    public void buildStructure() {
        EntityManager manager = getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Agency agency = new Agency();
        agency.setName("foo");
        Backlog backlog = new Backlog();
        backlog.setData("bar");
        agency.setBacklog(backlog);
        manager.persist(agency);
        tx.commit();

        tx = manager.getTransaction();
        tx.begin();
        Query q = manager.createQuery("select a from Agency a");
        for (Object o : q.getResultList()) {
            System.err.println(o);
            manager.remove(o);
        }
        manager.close();
    }
}

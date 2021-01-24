package db;

import db.models.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Connector {
    EntityManager em = Persistence.createEntityManagerFactory("mariadb-localhost").createEntityManager();

    public boolean registerUser(User u) {
        if(em.contains(u))
            return false;
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        em.close();
        return true;
    }
}

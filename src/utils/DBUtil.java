package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final String PERSISTENSE_UNIT_NAME = "tasklist";
    private static EntityManagerFactory emf;

    public static EntityManager createEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENSE_UNIT_NAME);
        }
        return emf;
    }
}
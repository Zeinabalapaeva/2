package java12.daoImple;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java12.daoHybernate.UserDetails;
import java12.entities.UserProfile;
import java12.konfig.ConfigHybernate;

import java.time.LocalDate;

public class userDimple implements UserDetails {
    EntityManagerFactory entityManagerFactory = ConfigHybernate.getEntitiesManagerFactory();

    @Override
    public Boolean createUserProfile(UserProfile userProfile) {
        EntityManager entityManager1 = entityManagerFactory.createEntityManager();
        try {
            entityManager1.getTransaction().begin();
            entityManager1.persist(new UserProfile());

            entityManager1.getTransaction().commit();
            entityManager1.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Boolean createUserProfile() {
        return null;
    }


    @Override
    public String getUserProfilebyId(Long id) {
        EntityManager entityManager1 = entityManagerFactory.createEntityManager();
        entityManager1.getTransaction().begin();
        entityManager1.find(UserProfile.class,id);
        entityManager1.getTransaction().commit();
        entityManager1.close();

        return null;
    }

    @Override
    public void updateUserProfileEmail(String email) {
        EntityManager entityManager1 = entityManagerFactory.createEntityManager();
        entityManager1.getTransaction().begin();

        entityManager1.find(UserProfile.class,email);

    entityManager1.getTransaction().commit();
    entityManager1.close();
    }

    @Override
    public void delateUserP(Long id) {
        EntityManager entityManager1= entityManagerFactory.createEntityManager();
        entityManager1.getTransaction().begin();
        entityManager1.find(UserProfile.class,id);
        entityManager1.getTransaction().commit();
        entityManager1.close();

    }

    @Override
    public void getUserRegisterafterdate(LocalDate date) {
        EntityManager entityManager1 = entityManagerFactory.createEntityManager();
        entityManager1.getTransaction().begin();
        entityManager1.find(UserProfile.class,date);
        entityManager1.getTransaction().commit();
        entityManager1.close();

    }
}

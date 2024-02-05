package java12.daoImple;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java12.daoHybernate.UserProfileDetails;
import java12.entities.UserProfile;
import java12.entities.Userdetails;
import java12.konfig.ConfigHybernate;

import java.util.List;

public class UserPImple implements UserProfileDetails {

    EntityManagerFactory entityManagerFactory = ConfigHybernate.getEntitiesManagerFactory();

    @Override
    public Boolean createUserD(UserProfile userProfile) {
        EntityManager entityManager1 = entityManagerFactory.createEntityManager();
        entityManager1.getTransaction().begin();

        entityManager1.persist(new UserProfile());

        entityManager1.getTransaction().commit();
        entityManager1.close();
        return null;
    }

    @Override
    public void getUserById(Long id) {
        EntityManager entityManager1 = entityManagerFactory.createEntityManager();
        entityManager1.getTransaction().begin();
        entityManager1.find(UserProfile.class, id);

        entityManager1.getTransaction().commit();
        entityManager1.close();
    }

    @Override
    public void UpdateUserDetailsaddres(String Oldaddress, String NewUseraddress) {
        EntityManager entityManager1 = entityManagerFactory.createEntityManager();
        entityManager1.getTransaction().begin();
        entityManager1.find(UserProfile.class, Oldaddress);

        entityManager1.getTransaction().commit();
        entityManager1.close();

    }

    @Override
    public void UpdateUserDetailsaddres(Userdetails NewUserd) {

    }


    @Override
    public void delateUserD(Long id) {
        EntityManager entityManager1 = entityManagerFactory.createEntityManager();
        entityManager1.getTransaction().begin();
        entityManager1.find(UserProfile.class, id);
           entityManager1.remove(UserProfile.class);
        entityManager1.getTransaction().commit();
        entityManager1.close();
    }



    @Override
    public void sortUserByDate() {
        EntityManager entityManager1 = entityManagerFactory.createEntityManager();
        entityManager1.getTransaction().begin();

        List<UserProfile> userList = entityManager1.createQuery(
                        "SELECT u FROM UserProfile u ORDER BY u.date_of_birth", UserProfile.class)
                .getResultList();



        entityManager1.getTransaction().commit();
        entityManager1.close();


    }
}

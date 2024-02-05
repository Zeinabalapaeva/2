package java12.daoHybernate;

import java12.entities.UserProfile;

import java.time.LocalDate;

public interface UserDetails {

   Boolean  createUserProfile(UserProfile userProfile);

    Boolean createUserProfile();

    String getUserProfilebyId(Long id);

    void updateUserProfileEmail (String email);

    void delateUserP(Long id);

   void  getUserRegisterafterdate(LocalDate date);
}

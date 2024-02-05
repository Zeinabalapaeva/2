package java12.daoHybernate;

import java12.entities.UserProfile;
import java12.entities.Userdetails;

public interface UserProfileDetails {
    Boolean createUserD(UserProfile userProfile);
    void getUserById(Long id);
    void UpdateUserDetailsaddres(String Oldaddress ,String NewUseraddress);

    void UpdateUserDetailsaddres(Userdetails NewUserd);

    void delateUserD(Long id);



  void  sortUserByDate();
}

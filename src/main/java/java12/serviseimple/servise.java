package java12.serviseimple;

import java12.model.User;

import java.sql.SQLException;

public interface servise {
    boolean createUser() throws SQLException;

    long getUserById(Long Id) throws SQLException;


    void updateUser(User newUser) throws SQLException;

    void   delateUserById(Long id) throws SQLException;

    void changeRoleByUserNameAndPassword(User name,User password ) throws SQLException;

    void getUserRole(Long id) throws SQLException;
}

package java12.serviseimple;

import java12.dao.UserDao;
import java12.daoImple.UserDaoImple;
import java12.model.User;

import java.sql.SQLException;

public class imple implements servise {
    UserDao userDao = new UserDaoImple();

    @Override
    public boolean createUser() throws SQLException {
        return userDao.createUser();
    }

    @Override
    public long getUserById(Long id) throws SQLException {
        return userDao.getUserById( id);
    }

    @Override
    public void updateUser(User newUser) throws SQLException {
        userDao.updateUser( newUser);

    }

    @Override
    public void delateUserById(Long id) throws SQLException {
        userDao.delateUserById(id);

    }

    @Override
    public void changeRoleByUserNameAndPassword(User name, User password) throws SQLException {
        userDao.changeRoleByUserNameAndPassword("zyu","111");

    }

    @Override
    public void getUserRole(Long id) throws SQLException {
        userDao.getUserRole(id);

    }
}

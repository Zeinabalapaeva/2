package java12.daoImple;

import java12.dao.UserDao;
import java12.konfig.Configjdbs;
import java12.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDaoImple implements UserDao {

    Connection connection = Configjdbs.getConnection();
    @Override
    public boolean createUser() throws SQLException {
        String query = """
                create table if not exists User(
                id  serial primary key,
                name varchar,
                password varchar ,
                role varchar
                
                
                """;

        Statement statement = connection.createStatement();
        statement.executeUpdate(query);

        return true;
    }

    @Override
    public long getUserById(Long id) throws SQLException {
        String query= "select from user where id =?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setLong(1,getUserById (id));


        return 0;
    }

    @Override
    public void updateUser(User newUser) throws SQLException {
       String query= " update user"+
               "id = ?,"+
               " name = ?,"+
               "password =?,"+
               "email = ?,"+
               "role = ?,";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(2, newUser.getUsername());
        preparedStatement.setString(3, newUser.getPassword());
        preparedStatement.setString(4,newUser.getRole());

    }

    @Override
    public void delateUserById(Long id) throws SQLException {
        String query = "delate from user where id =?";

    PreparedStatement preparedStatement = connection.prepareStatement(query);
    preparedStatement.setLong(1,id);


    }

    @Override
    public void changeRoleByUserNameAndPassword(User name, User password) throws SQLException {
        String query  = "Select role  from user";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
         preparedStatement.executeQuery();


    }

    @Override
    public void getUserRole(Long id) throws SQLException {
        String query = "select role from user where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
    }

    @Override
    public void changeRoleByUserNameAndPassword(String name, String password) throws SQLException {
        String query  = "Select role  from user";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.executeQuery();

    }
}

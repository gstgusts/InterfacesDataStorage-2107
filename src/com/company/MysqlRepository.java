package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlRepository implements DataStorageRepository {

    private static final String connectionString = "jdbc:mysql://localhost:3306/dogs?serverTimezone=UTC";
    private static final String user = "dogs";
    private static final String password = "dogs123";

    @Override
    public List<Dog> load() {
        List<Dog> dogs = new ArrayList<>();

        try {
            PreparedStatement ps = getConnection().prepareStatement("select * from dogs.dog");
            var rs = ps.executeQuery();

            while (rs.next()) {
                dogs.add(Dog.create(rs));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return dogs;
    }

    @Override
    public void save(List<Dog> dogs) {
        try {

            Statement st = getConnection().createStatement();
            st.execute("delete from dogs.dog");

            for (var dog :
                    dogs) {

                var ps = getConnection()
                        .prepareStatement("insert into dogs.dog (dog_nickname, dog_age, dog_chip_number) values (?,?,?)");

                ps.setString(1, dog.getNickname());
                ps.setDouble(2, dog.getAge());
                ps.setString(3, dog.getChipNumber());
                ps.executeUpdate();

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionString, user, password);
    }
}

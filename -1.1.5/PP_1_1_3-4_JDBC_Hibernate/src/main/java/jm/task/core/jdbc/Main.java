package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();

        userDao.saveUser("Maksatai", "Karimova", (byte)23);
        System.out.println("User c именем - Maksatai добавлен в базу данных");

        userDao.saveUser("Ain", "Akylbek", (byte)24);
        System.out.println("User c именем - Ain добавлен в базу данных");

        userDao.saveUser("Anton", "Ilienko", (byte)20);
        System.out.println("User c именем - Anton добавлен в базу данных");

        userDao.saveUser("Vadim", "Gerasko", (byte)23);
        System.out.println("User c именем - Vadim добавлен в базу данных");
        System.out.println(userDao.getAllUsers());

        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}

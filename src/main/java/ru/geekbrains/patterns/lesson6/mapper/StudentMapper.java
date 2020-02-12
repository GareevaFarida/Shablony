package ru.geekbrains.patterns.lesson6.mapper;

import ru.geekbrains.patterns.lesson6.model.Student;
import ru.geekbrains.patterns.lesson6.model.StudentEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper {

    private Connection connection;

    public StudentMapper(Connection connection) {
        this.connection = connection;
    }

    public void insert(Student student) {
        PreparedStatement insertStudent = null;
        try {
            insertStudent = connection.prepareStatement("INSERT INTO students (firstname, lastname) VALUES (?, ?)");
            insertStudent.setString(1, student.getFirstName());
            insertStudent.setString(2, student.getLastName());
            if (insertStudent.executeUpdate() == 1) {
                System.out.println("В БД добавлен новый студент : " + student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Student student) {
        PreparedStatement updateStatement = null;
        try {
            updateStatement = connection.prepareStatement("UPDATE students  SET firstname = ?, lastname = ? WHERE id = ? ");
            updateStatement.setString(1, student.getFirstName());
            updateStatement.setString(2, student.getLastName());
            updateStatement.setInt(3, student.getId());
            updateStatement.executeUpdate();
            System.out.println("В БД обновлены данные " + student);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Student student) {

        PreparedStatement deleteStatement = null;
        try {
            deleteStatement = connection.prepareStatement("DElETE FROM students WHERE id = ?");
            deleteStatement.setInt(1, student.getId());

            deleteStatement.execute();
            System.out.println("Удален из БД объект " + student);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Integer getIdFromDB(Student student) {
        return getIdFromDB(student.getFirstName(), student.getLastName());
    }

    public Integer getIdFromDB(String firstname, String lastname) {
        PreparedStatement findStatement = null;
        try {
            findStatement = connection.prepareStatement("SELECT id FROM students WHERE firstname = ? and lastname = ? ORDER BY id DESC LIMIT 1");
            findStatement.setString(1, firstname);
            findStatement.setString(2, lastname);
            ResultSet resultSet = findStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    public StudentEntity findById(Integer id) {
        PreparedStatement findStatement = null;
        try {
            findStatement = connection.prepareStatement("SELECT * FROM students WHERE id = ?");
            findStatement.setInt(1, id);
            ResultSet resultSet = findStatement.executeQuery();
            if (resultSet.next()) {

                return new StudentEntity(resultSet.getInt("id")
                        , resultSet.getString("firstname")
                        , resultSet.getString("lastname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}

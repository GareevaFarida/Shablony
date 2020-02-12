package ru.geekbrains.patterns.lesson6;

import ru.geekbrains.patterns.lesson6.identityMap.StudentIdentityMap;
import ru.geekbrains.patterns.lesson6.mapper.StudentMapper;
import ru.geekbrains.patterns.lesson6.model.Student;

public class Main {
    public static void main(String[] args) {
        JdbcClass jdbc = JdbcClass.getInstance();
        StudentMapper mapper = new StudentMapper(jdbc.getConnection());
        StudentIdentityMap map = StudentIdentityMap.getInstance();

        Student student1 = new Student("Ivan","Ivanov");
        mapper.insert(student1);
        student1.setId(mapper.getIdFromDB(student1));
        map.addStudent(student1);

        Student student2 = new Student("Petr","Petrov");
        mapper.insert(student2);
        student2.setId(mapper.getIdFromDB(student2));
        map.addStudent(student2);

        Student student3 = new Student("Stepan","Stepanov");
        mapper.insert(student3);
        student3.setId(mapper.getIdFromDB(student3));
        map.addStudent(student3);

        Student student4 = new Student("Nikolay","Nikolaev");
        mapper.insert(student4);
        student4.setId(mapper.getIdFromDB(student4));
      //  map.addStudent(student4);

        Student student5 = new Student("Oleg","Olegov");
        mapper.insert(student5);
        student5.setId(mapper.getIdFromDB(student5));
        map.addStudent(student5);



        Integer id4  = mapper.getIdFromDB(student4);
        System.out.printf("id студента %s %s: %d\n",student4.getFirstName(),student4.getLastName(),id4);

        Student student4_ = map.getStudent(id4);
        System.out.println("Студенты 4 и 4' идентичны: "+student4.equals(student4_));

        student3.setFirstName("Vlad");
        student3.setLastName("Volkov");
        mapper.update(student3);

        mapper.delete(student1);
        
    }
}

package ru.geekbrains.patterns.lesson6.identityMap;

import ru.geekbrains.patterns.lesson6.JdbcClass;
import ru.geekbrains.patterns.lesson6.mapper.StudentMapper;
import ru.geekbrains.patterns.lesson6.model.Student;
import ru.geekbrains.patterns.lesson6.model.StudentEntity;

import java.util.HashMap;
import java.util.Map;

public class StudentIdentityMap {
    private static volatile StudentIdentityMap INSTANCE;
    private Map<Integer, Student> mapStudents;
    private StudentMapper mapper;

    private StudentIdentityMap(StudentMapper mapper) {
        this.mapStudents = new HashMap<>();
        this.mapper = mapper;
    }

    public static StudentIdentityMap getInstance() {
        StudentIdentityMap localInstance = INSTANCE;
        if (localInstance == null)
            synchronized (StudentIdentityMap.class) {
                if (INSTANCE == null) {
                    JdbcClass jdbc = JdbcClass.getInstance();
                    StudentMapper localMapper = new StudentMapper(jdbc.getConnection());
                    INSTANCE = new StudentIdentityMap(localMapper);
                }
            }
        return INSTANCE;
    }

    public void addStudent(Student student) {
        if(student==null || student.getId()==null){
            return;
        }
        mapStudents.put(student.getId(),student);
    }

    public Student getStudent(Integer id) {
        if (mapStudents.containsKey(id)) {
            return mapStudents.get(id);
        }

        StudentEntity entity = mapper.findById(id);
        if(entity==null) {
            return null;
        }

        Student student = new Student(entity.getId(), entity.getFirstName(),entity.getLastName());
        mapStudents.put(student.getId(),student);

        return student;
    }
}

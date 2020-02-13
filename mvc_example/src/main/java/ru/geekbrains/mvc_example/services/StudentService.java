package ru.geekbrains.mvc_example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.mvc_example.persistence.models.Student;
import ru.geekbrains.mvc_example.persistence.repositories.StudentRepository;

import java.util.List;

@Service
@Transactional
public class StudentService {

    private StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }


}

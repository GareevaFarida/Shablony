package ru.geekbrains.mvc_example.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.mvc_example.persistence.models.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}

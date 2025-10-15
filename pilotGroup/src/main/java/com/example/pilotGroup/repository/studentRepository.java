package com.example.pilotGroup.repository;

import com.example.pilotGroup.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student, Long> {
}

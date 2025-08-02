package com.mernvids.sb.studentmanagement.Repository;

import com.mernvids.sb.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Custom finder method
    Optional<Student> findByEmail(String email);
}

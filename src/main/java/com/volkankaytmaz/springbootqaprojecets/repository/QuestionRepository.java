package com.volkankaytmaz.springbootqaprojecets.repository;

import com.volkankaytmaz.springbootqaprojecets.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}

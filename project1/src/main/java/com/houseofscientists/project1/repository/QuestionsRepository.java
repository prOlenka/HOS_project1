package com.houseofscientists.project1.repository;

import com.houseofscientists.project1.models.Questions;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Long> {
//        Page<Questions> findAll(Pageable pageable);
//        Questions findByNameAndStateAllIgnoringCase(String answer1, String answer2);
}
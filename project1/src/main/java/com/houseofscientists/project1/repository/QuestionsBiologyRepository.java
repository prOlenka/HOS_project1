package com.houseofscientists.project1.repository;

import com.houseofscientists.project1.models.QuestionsBiology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsBiologyRepository extends JpaRepository<QuestionsBiology, Long> {
        @Modifying
        @Query("SELECT u FROM QuestionsBiology u WHERE u.id= ?1")
        List<QuestionsBiology> findById(@Param("main") int main);

//        public static Questions getRandomQuestion(){
//        Questions q = new Questions();
//        q.getQuestion();
//        return q;
//        }
}


//        Questions findByNameAndStateAllIgnoringCase(String answer1, String answer2);

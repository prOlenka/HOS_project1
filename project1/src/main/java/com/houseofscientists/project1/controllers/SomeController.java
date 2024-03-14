package com.houseofscientists.project1.controllers;

import com.houseofscientists.project1.repository.QuestionsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class SomeController {
    private final QuestionsRepository questionsRepository;

    public SomeController(QuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;
    }


    @RequestMapping("/")
    public String sayHello(Model page){
        Long i = 1L;//(long) (int) (Math.random() * 6);
//        Iterable<Questions> q = questionsRepository.findAll();
//        Optional<Questions> posts = questionsRepository.findById(i);
//        ArrayList<Questions> q = new ArrayList<>();
//        posts.ifPresent(q::add);

        page.addAttribute("prods", questionsRepository.findAllByQuestion("Почему небо голубое?"));
//        page.addAttribute("button1", q);
//        page.addAttribute("button2", );
        return "question_start";
    }

    @RequestMapping("/right_answer")
    public String rightAnswer(Model page){
        return "sliderpage";
    }
}

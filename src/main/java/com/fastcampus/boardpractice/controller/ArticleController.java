package com.fastcampus.boardpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ArticleController {

    @GetMapping("/articles")
    public ModelAndView articles() {
        Map<String, Object> map = new HashMap<>();
        map.put("articles", List.of("article")); // TODO: 게시글 목록 넣어주기

        return new ModelAndView("articles/index", map);
    }

}

package com.fastcampus.boardpractice.controller;

import com.fastcampus.boardpractice.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RequestMapping("/articles")
@Controller
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping
    public ModelAndView articles() {
        Map<String, Object> map = new HashMap<>();
        map.put("articles", articleService.getArticles());

        return new ModelAndView("articles/index", map);
    }

}

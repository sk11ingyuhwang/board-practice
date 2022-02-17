package com.fastcampus.boardpractice.controller;

import com.fastcampus.boardpractice.domain.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/articles")
@Controller
public class ArticleController {

    @GetMapping
    public ModelAndView articles() {
        Map<String, Object> map = new HashMap<>();
        map.put("articles", mockArticles()); // TODO: 게시글 목록 넣어주기

        return new ModelAndView("articles/index", map);
    }


    private List<Article> mockArticles() {
        return List.of(
                Article.of("첫 글", "test", 0, 0, "#자바", "uno"),
                Article.of("2 글", "test", 1, 0, "#자바", "uno"),
                Article.of("3 글", "test", 2, 1, "#자바", "uno"),
                Article.of("4 글", "test", 3, 0, "#자바", "uno"),
                Article.of("5 글", "test", 4, 0, "#자바", "uno")
        );
    }

}

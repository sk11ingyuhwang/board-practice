package com.fastcampus.boardpractice.service;

import com.fastcampus.boardpractice.domain.Article;
import com.fastcampus.boardpractice.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public List<Article> getArticles() {
        return articleRepository.findMockArticles();
    }

}

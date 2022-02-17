package com.fastcampus.boardpractice.service;

import com.fastcampus.boardpractice.domain.Article;
import com.fastcampus.boardpractice.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks private ArticleService sut;
    @Mock private ArticleRepository articleRepository;


    @DisplayName("게시글 목록을 요청하면, 게시글 목록을 반환한다")
    @Test
    void givenNothing_whenGetting_thenReturnArticleList() {
        // Given
        given(articleRepository.findMockArticles()).willReturn(
                List.of(
                        Article.of("첫 글", "test", 0, 0, "#자바", "uno"),
                        Article.of("2 글", "test", 1, 0, "#자바", "uno"),
                        Article.of("3 글", "test", 2, 1, "#자바", "uno"),
                        Article.of("4 글", "test", 3, 0, "#자바", "uno"),
                        Article.of("5 글", "test", 4, 0, "#자바", "uno")
                )
        );

        // When
        List<Article> actual = sut.getArticles();

        // Then
        assertThat(actual).hasSize(5);
        then(articleRepository).should().findMockArticles();
    }

}

package com.fastcampus.boardpractice.repository;

import com.fastcampus.boardpractice.domain.Article;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@Disabled("아직 JPA 진도가 안 나갔다. 그 떄 하자")
class ArticleRepositoryTest {

    private ArticleRepository sut;


    @Test
    void given_when_then() {
        // Given

        // When
        List<Article> actual = sut.findMockArticles();

        // Then
        assertThat(actual).hasSize(5);
    }

}
package com.fastcampus.boardpractice.repository;

import com.fastcampus.boardpractice.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {

    // TODO: 이 코드는 추후 삭제해야 함
    default List<Article> findMockArticles() {
        return List.of(
                Article.of("첫 글", "test", 0, 0, "#자바", "uno"),
                Article.of("2 글", "test", 1, 0, "#자바", "uno"),
                Article.of("3 글", "test", 2, 1, "#자바", "uno"),
                Article.of("4 글", "test", 3, 0, "#자바", "uno"),
                Article.of("5 글", "test", 4, 0, "#자바", "uno")
        );
    }

}

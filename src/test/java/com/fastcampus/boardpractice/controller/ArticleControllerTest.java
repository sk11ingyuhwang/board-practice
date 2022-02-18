package com.fastcampus.boardpractice.controller;

import com.fastcampus.boardpractice.service.ArticleService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(ArticleController.class)
class ArticleControllerTest {

    private final MockMvc mvc;
    @MockBean private ArticleService articleService;

    public ArticleControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }


    @DisplayName("[GET] /articles - 검색어가 없으면, 페이징 목록을 조회한다")
    @Test
    void givenNoParameter_whenReadingArticles_thenReturnsArticlePages() throws Exception {
        // Given
        given(articleService.getArticles()).willReturn(List.of());

        // When & Then
        mvc.perform(
                get("/articles")
        )
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andExpect(view().name("articles/index"))
                .andExpect(model().attributeExists("articles"));
        then(articleService).should().getArticles();
    }

}
package com.fastcampus.boardpractice.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class ArticleComment {

    private Long id;

    @Setter private Long articleId;
    @Setter private String content;

    private LocalDateTime createdAt;
    @Setter private String createdBy;
    private LocalDateTime modifiedAt;
    @Setter private String modifiedBy;

    public ArticleComment(Long articleId, String content, String createdBy) {
        this.articleId = articleId;
        this.content = content;
        this.createdBy = createdBy;
        this.modifiedBy = createdBy;
    }

}

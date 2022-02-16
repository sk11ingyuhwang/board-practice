package com.fastcampus.boardpractice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@ToString
@Entity
public class ArticleComment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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

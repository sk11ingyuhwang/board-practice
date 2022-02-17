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
public class Article {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter private String title;
    @Setter private String content;
    @Setter private Integer viewCount;
    @Setter private Integer likeCount;
    @Setter private String hashtag;

    private LocalDateTime createdAt;
    @Setter private String createdBy;
    private LocalDateTime modifiedAt;
    @Setter private String modifiedBy;


    public Article(String title, String content, Integer viewCount, Integer likeCount, String hashtag, String createdBy) {
        this.title = title;
        this.content = content;
        this.viewCount = viewCount;
        this.likeCount = likeCount;
        this.hashtag = hashtag;
        this.createdBy = createdBy;
        this.modifiedBy = createdBy;
    }

    public static Article of(String title, String content, Integer viewCount, Integer likeCount, String hashtag, String createdBy) {
        Article article = new Article(title, content, viewCount, likeCount, hashtag, createdBy);
        article.createdAt = LocalDateTime.now(); // TODO: mocking을 위해 시간을 강제로 세팅한 코드는 추후 수정
        article.modifiedAt = article.createdAt; // TODO: mocking을 위해 시간을 강제로 세팅한 코드는 추후 수정
        return article;
    }

}

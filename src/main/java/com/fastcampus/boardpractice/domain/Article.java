package com.fastcampus.boardpractice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class Article {
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

}

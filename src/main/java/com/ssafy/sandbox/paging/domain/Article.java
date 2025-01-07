package com.ssafy.sandbox.paging.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Article {

    @Id
    private Integer id;

    @Column
    private String title;

    @Column
    private String createdAt;
}

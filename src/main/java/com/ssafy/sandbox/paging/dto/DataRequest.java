package com.ssafy.sandbox.paging.dto;

import com.ssafy.sandbox.paging.domain.Article;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DataRequest {

    private List<Article> articles;
}

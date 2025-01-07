package com.ssafy.sandbox.paging.service;

import com.ssafy.sandbox.paging.domain.Article;
import com.ssafy.sandbox.paging.dto.DataRequest;
import com.ssafy.sandbox.paging.dto.OffsetResponse;
import com.ssafy.sandbox.paging.repository.PagingRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PagingService {

    private final PagingRepository pagingRepository;

    @Transactional
    public void makeArticles(DataRequest articles) {
        List<Article> articleList = articles.getArticles();
        System.out.println(articleList.get(0).getTitle());
        pagingRepository.saveAll(articleList);
    }
}

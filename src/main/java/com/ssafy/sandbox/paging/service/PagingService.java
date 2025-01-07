package com.ssafy.sandbox.paging.service;

import com.ssafy.sandbox.paging.domain.Article;
import com.ssafy.sandbox.paging.dto.CursorResponse;
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

    public OffsetResponse offsetPaging(int size, int page) {
        int offset = page * size;
        List<Article> articles = pagingRepository.findAllByOffset(offset, size);
        OffsetResponse offsetResponse = new OffsetResponse();
        offsetResponse.setArticles(articles);
        offsetResponse.setTotalPage(articles.size());
        return offsetResponse;
    }

    public CursorResponse cursorPaging(int size, int cursorId) {
        List<Article> articles = pagingRepository.findAllByCursor(cursorId, size);
        if (articles.isEmpty()) {
            return new CursorResponse();
        }
        CursorResponse cursorResponse = new CursorResponse();
        cursorResponse.setArticles(articles);
        cursorResponse.setLastId(articles.get(articles.size() - 1).getId());
        return cursorResponse;
    }

    @Transactional
    public void makeArticles(DataRequest articles) {
        List<Article> articleList = articles.getArticles();
        System.out.println(articleList.get(0).getTitle());
        pagingRepository.saveAll(articleList);
    }
}

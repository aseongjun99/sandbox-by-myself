package com.ssafy.sandbox.paging.controller;

import com.ssafy.sandbox.paging.domain.Article;
import com.ssafy.sandbox.paging.dto.DataRequest;
import com.ssafy.sandbox.paging.service.PagingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
@CrossOrigin(value = "https://ssafysandbox.vercel.app")
public class PagingController {

    private final PagingService pagingService;

    @PostMapping("/make")
    public void makeArticles(@RequestBody DataRequest articles) {
        System.out.println(articles);
        pagingService.makeArticles(articles);
    }
}

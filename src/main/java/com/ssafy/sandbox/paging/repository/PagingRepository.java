package com.ssafy.sandbox.paging.repository;

import com.ssafy.sandbox.paging.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagingRepository extends JpaRepository<Article, Integer> {
}

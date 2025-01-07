package com.ssafy.sandbox.paging.repository;

import com.ssafy.sandbox.paging.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PagingRepository extends JpaRepository<Article, Integer> {

    @Query(value = "SELECT * FROM article LIMIT :offset , :limit", nativeQuery = true)
    List<Article> findAllByOffset(@Param("offset") Integer offset, @Param("limit") Integer limit);
}

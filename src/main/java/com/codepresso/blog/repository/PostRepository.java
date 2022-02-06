package com.codepresso.blog.repository;

import com.codepresso.blog.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface PostRepository {

    // 등록
    void save(@Param("post") Post post);

    // 여러 건 조회
    List<Post> findAll();

    // 특정 글 조회
    Post findOne(@Param("id") Long id);

    // 수정
    void updatePost(@Param("post") Post post);

    // 삭제
    void deleteById(@Param("id") Long id);
}

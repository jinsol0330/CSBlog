package com.codepresso.blog.repository;

import com.codepresso.blog.vo.Post;
import com.codepresso.blog.vo.UserComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserCommentRepository {

    // 게시물 댓글 등록
    void saveComment(@Param("userComment") UserComment userComment);

    // 툭정 게시물 전체 댓글 조회
    List<UserComment> findOneComment(@Param("postId") Long id);

}

package com.codepresso.blog.repository;

import com.codepresso.blog.vo.Post;
import com.codepresso.blog.vo.UserComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserCommentRepository {

    void saveComment(@Param("userComment") UserComment userComment);

    UserComment findOneComment(@Param("post_id") Post post);

}

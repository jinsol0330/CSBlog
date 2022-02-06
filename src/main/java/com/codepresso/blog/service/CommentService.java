package com.codepresso.blog.service;

import com.codepresso.blog.repository.UserCommentRepository;
import com.codepresso.blog.vo.Post;
import com.codepresso.blog.vo.UserComment;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private UserCommentRepository userCommentRepository;

    public CommentService(UserCommentRepository userCommentRepository) {
        this.userCommentRepository = userCommentRepository;
    }

    public void addUserComment(UserComment userComment) {
        userCommentRepository.saveComment(userComment);

    }


}

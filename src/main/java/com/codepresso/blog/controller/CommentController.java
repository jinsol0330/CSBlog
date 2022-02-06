package com.codepresso.blog.controller;

import com.codepresso.blog.service.CommentService;
import com.codepresso.blog.vo.Result;
import com.codepresso.blog.vo.UserComment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping(value = "/comment")
    public Result addUserComment(@RequestBody UserComment userComment){
        commentService.addUserComment(userComment);
        return new Result(200, "OK");
    }

    @GetMapping(value = "/comments")
    public List<UserComment> getUserComment(@RequestParam(name = "post_id") Long id){
        return commentService.getUserComment(id);
    }

}

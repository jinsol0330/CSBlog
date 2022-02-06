package com.codepresso.blog.controller;

import com.codepresso.blog.service.PostService;
import com.codepresso.blog.vo.Post;
import com.codepresso.blog.vo.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = "/posts")
    public List<Post> getPostList(){
        return postService.getPostList();
    }

    @GetMapping(value = "/post")
    public Post getPost(@RequestParam Long id){
        return postService.getPost(id);
    }

    @PostMapping(value = "/post")
    public Result addPost(@RequestBody Post post){
        postService.addPost(post);
        return new Result(200, "Success");
    }

    @PutMapping(value = "/post")
    public Result updatePost(@RequestBody Post post){
        postService.updatePost(post);
        return new Result(200, "Success");
    }

    @DeleteMapping(value = "/post")
    public Result deletePost(@RequestParam("id") Long id){
        postService.deletePost(id);
        return new Result(200, "Success");
    }

}

package com.example.techiechallenge.Resource;

import com.example.techiechallenge.Model.Post;
import com.example.techiechallenge.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/blog")
public class PostResource {

    private final PostService postService;

    /**
     * Create a new post
     * @param post the post to create
     */
    @PostMapping("/post")
    public Post createPost(@RequestBody Post post) {

         return postService.createPost(post);
    }

    /**
     * Get all post
     * @return list of post in the database
     */
    @GetMapping("/post/all")
    public List<Post> getAllPost() {

        return postService.getAllPost();
    }

    /**
     * Get a post by id
     * @param id the id of the post to get
     * @return the post if found, null otherwise
     */
    @GetMapping("/post/{id}")
    public Post getPostById(@PathVariable String id) {

        return postService.getPostById(id);
    }

    /**
     * Update a post
     * @param id the id of the post to update
     * @param post the post to update
     */
    @PutMapping("/post/{id}")
    public Post updatePost(@PathVariable String id, @RequestBody Post post) {

         return postService.updatePost(id, post);
    }

    /**
     * Delete a post
     * @param id the id of the post to delete
     */
    @DeleteMapping("/post/{id}")
    public void deletePost(@PathVariable String id) {

         postService.deletePost(id);
    }





}

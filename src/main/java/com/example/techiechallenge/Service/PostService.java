package com.example.techiechallenge.Service;

import com.example.techiechallenge.Model.Post;
import com.example.techiechallenge.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostService {

    private final PostRepository postRepository;


    /**
     * Create a new post
     * @param post the post to create
     */
    public void createPost(Post post) {

        postRepository.save(post);
    }

    /**
     * Get all post
     * @return list of post in the database
     */
    public List<Post> getAllPost() {

        return postRepository.findAll();
    }

    /**
     * Get a post by id if found, null otherwise
     * @param id the id of the post to get
     * @return the post if found, null otherwise
     */
    public Post getPostById(String id) {

        return postRepository.findById(UUID.fromString(id)).orElse(null);
    }

    /**
     * Update a post by id
     * @param id the id of the post to update
     * @param post the post to update
     */
    public void updatePost(String id, Post post) {

        Post postToUpdate = postRepository.findById(UUID.fromString(id)).orElse(null);
        if (postToUpdate != null) {
            postToUpdate.setTitle(post.getTitle());
            postToUpdate.setBody(post.getBody());
            postToUpdate.setAuthor(post.getAuthor());
            postToUpdate.setUpdatedAt(post.getUpdatedAt());
            postToUpdate.setUpdatedBy(post.getUpdatedBy());
            postRepository.save(postToUpdate);
        }
    }

    /**
     * Delete a post by id
     * @param id the id of the post to delete
     */
    public void deletePost(String id) {

            Post postToDelete = postRepository.findById(UUID.fromString(id)).orElse(null);
            if (postToDelete != null) {
                postRepository.delete(postToDelete);
            }
    }
}

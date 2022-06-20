package service.impl;

import model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import repository.PostRepository;
import service.IPostService;

import java.util.Optional;
@Service
public class PostService implements IPostService {
    @Autowired
    PostRepository postRepository;

    @Override
    public Page<Post> findAll(Pageable pageable) {
        return postRepository.findAll(pageable);
    }



    @Override
    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public void search(String Title) {
    }

    @Override
    public Iterable<Post> findByTitle(String title) {
        return null;
    }

    @Override
    public Page<Post> findByTitle(String title, Pageable pageable) {
        return postRepository.findAllByTitleContaining(title, pageable);
    }

     public Iterable<Post> findByLikes(){
        return postRepository.findAllByOrderByLikes();
     }
}

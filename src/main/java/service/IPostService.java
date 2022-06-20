package service;

import model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPostService extends IGeneralService<Post> {
    Iterable<Post> findByTitle(String title);

    Page<Post> findByTitle(String title, Pageable pageable);
}

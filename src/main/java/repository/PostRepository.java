package repository;

import model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface PostRepository extends JpaRepository<Post , Long > {
    Page<Post> findAllByTitleContaining(String title, Pageable pageable);

    Iterable<Post> findAllByOrderByLikes();

}

package TAEJU.TTPAGE.repository;

import TAEJU.TTPAGE.domain.Member;
import TAEJU.TTPAGE.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    Post save(Post post);
    Optional<Post> findById(Long id);
    Optional<Post> findBySubject(String subject);
    List<Post> findAll();
}

package TAEJU.TTPAGE.repository;

import TAEJU.TTPAGE.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DataJpaPostRepository extends JpaRepository<Post,Long>,PostRepository {

    @Override
    Optional<Post> findBySubject(String subject);
}

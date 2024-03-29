package TAEJU.TTPAGE.service;

import TAEJU.TTPAGE.domain.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
public class PostServiceTest {
    @Autowired
    PostService postService;

    @Test
    void write_post(){
        Post post = new Post();
        post.setContent("내용");
        post.setSubject("제목");
        post.setCreateDate(LocalDateTime.of(2024,3,30,0,0));



    }

}

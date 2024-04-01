package TAEJU.TTPAGE.service;

import TAEJU.TTPAGE.domain.Member;
import TAEJU.TTPAGE.domain.Post;
import TAEJU.TTPAGE.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    public Long join(Post post){
        postRepository.save(post);
        return post.getId();
    }
    public List<Post> findPosts(){
        return postRepository.findAll();
    }
    public Optional<Post> findOne(Long postId){
        return postRepository.findById(postId);
    }

}

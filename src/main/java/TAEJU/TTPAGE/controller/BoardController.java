package TAEJU.TTPAGE.controller;


import TAEJU.TTPAGE.domain.Member;
import TAEJU.TTPAGE.domain.Post;
import TAEJU.TTPAGE.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
public class BoardController {
    private final PostService postService;

   @Autowired
    public BoardController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/board/save")
    public String WriteForm()
    {
        return "board/write_form";

    }
    @PostMapping("/board/new")
    public String create(PostForm form) {
        Post post = new Post();
        post.setSubject(form.getSubject());
        post.setContent(form.getContent());
        Date date = new Date();
        post.setCreateDate(LocalDateTime.now());

        postService.join(post);
        return "redirect:/";
    }
    @GetMapping("/board")
    public String list(Model model){
        List<Post> posts = postService.findPosts();
        model.addAttribute("posts",posts);
        return "board/boardList";
    }
    @GetMapping("/board/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id){
       return null;
    }




}

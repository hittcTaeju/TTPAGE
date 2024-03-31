package TAEJU.TTPAGE.controller;


import TAEJU.TTPAGE.domain.Post;
import TAEJU.TTPAGE.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class BoardController {
    private final PostService postService;

   @Autowired
    public BoardController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/board/")
    @ResponseBody

    public String list(){
        return "Board_list";
    }
    @GetMapping("/board/save")
    public String WriteForm()
    {
        return "board/write_form";

    }
    @PostMapping("/board/new")
    public String create(PostForm form){
        Post post = new Post();
        post.setSubject(form.getSubject());
        post.setContent(form.getContent());
        Date date = new Date();
        post.setCreateDate(LocalDateTime.now());

        postService.join(post);


        return "redirect:/";
    }

}

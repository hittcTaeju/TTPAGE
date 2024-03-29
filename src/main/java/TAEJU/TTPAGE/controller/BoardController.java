package TAEJU.TTPAGE.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
    @GetMapping("/Board/list")
    @ResponseBody

    public String list(){
        return "Board_list";
    }
    @GetMapping("post/write_form")
    @ResponseBody
    public String postWriteForm()
    {
        return "write_form";

    }

}

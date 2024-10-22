package jinuk.project6.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CommentController {

//    error-댓글기능

/*    private final CommentRepository commentRepository;

    @PostMapping("/comment")
    String postComment(@RequestParam String content, @RequestParam Long parent){

        var data = new Comment();
        data.setContent(content);
        data.setUsername(data.getUsername());
        commentRepository.save(data);
        return "redirect:/list";
    }*/
}

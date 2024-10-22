package jinuk.project6.comment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

//    error-댓글기능
//    List<Comment> findAllByParentId(Long parentId);

}

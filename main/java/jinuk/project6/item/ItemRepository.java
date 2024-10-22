package jinuk.project6.item;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

//    error - 페이지나누기
//    Page<Item> findPageBy(Pageable page);

    List<Item> findAllByTitleContains(String title);

//    error-검색기능
/*    @Query(value = "select * from item where match(title) against(?1)", nativeQuery = true)
    List<Item> rawQuery1(String text);*/
}

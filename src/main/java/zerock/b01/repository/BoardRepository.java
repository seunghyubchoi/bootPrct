package zerock.b01.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import zerock.b01.domain.Board;
import zerock.b01.repository.search.BoardSearch;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {
    // <엔티티 타입, Id 타입>
    @Query(value = "select now()", nativeQuery = true)
    String getTime();

}

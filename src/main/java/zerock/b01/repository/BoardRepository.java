package zerock.b01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zerock.b01.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
    // <엔티티 타입, Id 타입>

}

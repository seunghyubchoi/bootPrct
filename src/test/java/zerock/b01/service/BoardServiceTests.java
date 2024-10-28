package zerock.b01.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zerock.b01.domain.Board;
import zerock.b01.dto.BoardDTO;

@SpringBootTest
@Log4j2
public class BoardServiceTests {
    @Autowired
    private BoardService boardService;


    @Test
    public void testRegister() {
        log.info(boardService.getClass().getName());

        BoardDTO boardDTO = BoardDTO.builder()
                .title("Sample Title")
                .content("Sample Content....")
                .writer("user00")
                .build();

        Long bno = boardService.register(boardDTO);
        log.info("bno : " + bno);
    }

    @Test
    public void testModify() {
        log.info("testModify start");
        BoardDTO boardDTO = BoardDTO.builder()
                .bno(99L)
                .title("Updated....99")
                .content("Updated content 99....")
                .build();

        boardService.modify(boardDTO);
    }
}

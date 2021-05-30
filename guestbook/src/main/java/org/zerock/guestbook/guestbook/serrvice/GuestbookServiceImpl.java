package org.zerock.guestbook.guestbook.serrvice;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.guestbook.guestbook.domain.Guestbook;
import org.zerock.guestbook.guestbook.domain.GuestbookDTO;

@Service
@Log4j2
public class GuestbookServiceImpl implements GuestbookService {


    @Override
    public Long register(GuestbookDTO dto) {

        log.info("DTO :::::::: ");
        log.info(dto);

        Guestbook entity = dtoToEntity(dto);

        log.info(entity);


        return null;
    }
}

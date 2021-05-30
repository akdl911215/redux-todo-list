package org.zerock.guestbook.guestbook.serrvice;

import org.zerock.guestbook.guestbook.domain.Guestbook;
import org.zerock.guestbook.guestbook.domain.GuestbookDTO;

public interface GuestbookService {
    Long register(GuestbookDTO dto);

    default Guestbook dtoToEntity(GuestbookDTO dto){
        Guestbook entity = Guestbook.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .build();
        return entity;
    }
}

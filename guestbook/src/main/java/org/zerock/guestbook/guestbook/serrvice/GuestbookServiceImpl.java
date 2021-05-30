package org.zerock.guestbook.guestbook.serrvice;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.zerock.guestbook.guestbook.domain.Guestbook;
import org.zerock.guestbook.guestbook.domain.GuestbookDTO;
import org.zerock.guestbook.guestbook.domain.PageRequestDTO;
import org.zerock.guestbook.guestbook.domain.PageResultDTO;
import org.zerock.guestbook.guestbook.repository.GuestbookRepository;

import java.util.function.Function;

@Service
@Log4j2
@RequiredArgsConstructor // 의존성 자동 주입
public class GuestbookServiceImpl implements GuestbookService {

    private final GuestbookRepository repository;

    @Override
    public Long register(GuestbookDTO dto) {

        log.info("DTO :::::::: ");
        log.info(dto);

        Guestbook entity = dtoToEntity(dto);

        log.info("============");
        log.info(entity);
        log.info("============");

        repository.save(entity);

        return entity.getGno();
    }

    @Override
    public PageResultDTO<GuestbookDTO, Guestbook> getList(PageRequestDTO requestDTO) {

        Pageable pageable = requestDTO.getPageable(Sort.by("gno").descending());

        Page<Guestbook> result = repository.findAll(pageable);

        Function<Guestbook, GuestbookDTO> fn = (entity -> entityToDto(entity));

        return new PageResultDTO<>(result, fn);
    }


}

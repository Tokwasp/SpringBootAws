package com.jojoldu.book.springboot.service.posts;


import com.jojoldu.book.springboot.domain.posts.PostsRepositiory;
import com.jojoldu.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepositiory postsRepositiory;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepositiory.save(requestDto.toEntity()).getId();
    }
}

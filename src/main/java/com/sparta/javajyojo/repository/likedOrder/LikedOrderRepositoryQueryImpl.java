package com.sparta.javajyojo.repository.likedOrder;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LikedOrderRepositoryQueryImpl {

    private final JPAQueryFactory queryFactory;

}

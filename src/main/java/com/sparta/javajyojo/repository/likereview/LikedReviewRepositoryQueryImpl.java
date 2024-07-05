package com.sparta.javajyojo.repository.likereview;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LikedReviewRepositoryQueryImpl {

    private final JPAQueryFactory queryFactory;

}
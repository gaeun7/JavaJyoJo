package com.sparta.javajyojo.repository.likereview;

import com.sparta.javajyojo.entity.Review;

import java.util.List;

public interface LikedReviewRepositoryQuery {
    List<Review> findLikedReviewsByUser(Long id, int limit);
    long countReviewLikesByUserId(Long id);
}
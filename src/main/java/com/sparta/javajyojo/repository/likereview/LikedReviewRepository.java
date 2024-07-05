package com.sparta.javajyojo.repository.likereview;

import com.sparta.javajyojo.entity.LikedReview;
import com.sparta.javajyojo.entity.Review;
import com.sparta.javajyojo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LikedReviewRepository extends JpaRepository<LikedReview, Long>{
    Optional<LikedReview> findByUserAndReview(User user, Review review);

    List<Review> findLikedReviewsByUser(long userId, int limit);
}
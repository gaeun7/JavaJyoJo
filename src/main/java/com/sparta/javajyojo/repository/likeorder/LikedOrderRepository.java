package com.sparta.javajyojo.repository.likeorder;

import com.sparta.javajyojo.entity.LikedOrder;
import com.sparta.javajyojo.entity.Order;
import com.sparta.javajyojo.entity.Review;
import com.sparta.javajyojo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LikedOrderRepository extends JpaRepository<LikedOrder, Long> {
    Optional<LikedOrder> findByUserAndOrder(User user, Order order);

    List<Order> findLikedOrdersByUser(long userId, int limit);
    long countReviewLikesByUserId(Long id);
}
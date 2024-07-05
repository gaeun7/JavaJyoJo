package com.sparta.javajyojo.repository.likeorder;

import com.sparta.javajyojo.entity.Order;

import java.util.List;

public interface LikedOrderRepositoryQuery {
    List<Order> findLikedOrdersByUser(Long id, int limit);
    long countOrderLikesByUserId(Long id);
}
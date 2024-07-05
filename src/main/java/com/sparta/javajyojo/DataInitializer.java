package com.sparta.javajyojo;

import com.sparta.javajyojo.dto.ReviewRequestDto;
import com.sparta.javajyojo.entity.*;
import com.sparta.javajyojo.enums.OrderStatus;
import com.sparta.javajyojo.enums.UserRoleEnum;
import com.sparta.javajyojo.repository.*;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final MenuRepository menuRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final OrderRepository orderRepository;
    private final ReviewRepository reviewRepository;
    private final OrderDetailRepository orderDetailRepository;
    private final PasswordHistoryRepository passwordHistoryRepository;

    @PostConstruct
    @Transactional
    public void init() {
        List<Menu> menuList =
                List.of(
                        new Menu("후라이드", 14900),
                        new Menu("양념", 14900),
                        new Menu("후라이드반/양념반", 14900),
                        new Menu("떡볶이", 5000),
                        new Menu("콜라", 2000),
                        new Menu("사이다", 2000)
                );
        menuRepository.saveAll(menuList);
    }
}
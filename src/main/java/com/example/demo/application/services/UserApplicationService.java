package com.example.demo.application.services;


import com.example.demo.domain.model.User.entity.User;
import com.example.demo.infrastructure.repository.JpaUserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.ByteBuffer;
import java.util.*;
import java.time.LocalDateTime;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserApplicationService {
        
        private final JpaUserRepository jpaUserRepository;

        @Transactional
        public Boolean SignUp(User user) throws Exception {
            try {
                jpaUserRepository.save(user);
                return true;
            } catch (Exception e) {
                throw new Exception(e);
            }
        }

}

package com.example.demo.web;

import com.example.demo.domain.model.User.entity.*;
import com.example.demo.application.services.*;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.ByteBuffer;
import java.util.*;

@RestController // restApi를 작성할 수 있는 컨트롤러
@RequestMapping("/api/v1/user") // url을 api로 지정
@CrossOrigin(origins = "*", allowedHeaders = "*") // cors허용
@RequiredArgsConstructor
public class UserController {
        @GetMapping("/hello")
        public ResponseEntity<Object> Hello() throws Exception {
            try {
                Map<String, String> map = new HashMap<>();
                map.put("result", "hello world");
                return new ResponseEntity<>(map, HttpStatus.OK);
            } catch (Exception e) {
                // return r.Error(e, "user -hello");
                throw new Exception(e);
            }
        }
}

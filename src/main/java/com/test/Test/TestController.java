package com.test.Test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")

public class TestController {

    @GetMapping
    public ResponseEntity<TestBean> getTest() {
        TestBean testBean = TestBean.builder().code(300).message("Its ok").build();
        System.out.println("This is my first push");
        System.out.println("Changes to be fetched");
        return ResponseEntity.ok(testBean);


    }

    @PostMapping
    public ResponseEntity<TestBean> postTest(@RequestBody TestBean testBean) {
        System.out.println("This is feature/post");
        // this line is for testing pull 
        return new ResponseEntity<>(testBean, HttpStatus.CREATED);
    }
}

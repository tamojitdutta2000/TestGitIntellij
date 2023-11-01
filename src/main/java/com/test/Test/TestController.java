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
        return ResponseEntity.ok(testBean);

    }

    @PostMapping

    public ResponseEntity<TestBean> postTest(@RequestBody TestBean testBean) {
        return new ResponseEntity<>(testBean, HttpStatus.CREATED);
    }
}

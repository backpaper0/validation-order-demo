package com.example.validationorderdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.validation.BindException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.validationorderdemo.Order.All;

@RestController
public class DemoController {

    @PostMapping("/")
    DemoForm post(@Validated(All.class) DemoForm form) {
        return form;
    }

    @ExceptionHandler(BindException.class)
    List<String> handle(BindException e) {
        return e.getAllErrors().stream().map(a -> Arrays.toString(a.getCodes())).collect(Collectors.toList());
    }
}

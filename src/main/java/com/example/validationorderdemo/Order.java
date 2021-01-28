package com.example.validationorderdemo;

import javax.validation.GroupSequence;

import com.example.validationorderdemo.Order.Order1;
import com.example.validationorderdemo.Order.Order2;
import com.example.validationorderdemo.Order.Order3;

@GroupSequence({ Order1.class, Order2.class, Order3.class })
public interface Order {

    public interface All {
    }

    public interface Order1 {
    }

    public interface Order2 {
    }

    public interface Order3 {
    }
}

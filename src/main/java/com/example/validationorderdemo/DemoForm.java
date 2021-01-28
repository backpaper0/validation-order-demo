package com.example.validationorderdemo;

import javax.validation.constraints.NotNull;

import com.example.validationorderdemo.Order.All;
import com.example.validationorderdemo.Order.Order1;
import com.example.validationorderdemo.Order.Order2;
import com.example.validationorderdemo.Order.Order3;

public class DemoForm {

    @NotNull(groups = { All.class, Order1.class })
    private String foo;
    @NotNull(groups = { All.class, Order2.class })
    private String bar;
    @NotNull(groups = { All.class, Order3.class })
    private String baz;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getBaz() {
        return baz;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }
}

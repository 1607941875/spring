package com.yyc.service.impl;

import com.yyc.service._1helloSpring;

public class _1helloSpringImpl implements _1helloSpring {
    public _1helloSpringImpl() {
        System.out.println("执行_1helloSpringImpl的构造方法");
    }

    @Override
    public void helloSpring() {
        System.out.println("hello spring!");
    }
}

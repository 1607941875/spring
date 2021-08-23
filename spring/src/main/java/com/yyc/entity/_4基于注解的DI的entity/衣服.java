package com.yyc.entity._4基于注解的DI的entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class 衣服 {
    public 衣服() {
        System.out.println("执行衣服的无参数构造方法");
    }

    @Value("优衣库")
    private String 品牌;
    @Value("白色")
    private String 颜色;
    @Value("M")
    private String 尺寸;

    @Override
    public String toString() {
        return "衣服{" +
                "品牌='" + 品牌 + '\'' +
                ", 颜色='" + 颜色 + '\'' +
                ", 尺寸='" + 尺寸 + '\'' +
                '}';
    }
}

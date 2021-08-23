package com.yyc.entity._4基于注解的DI的entity;

import org.springframework.beans.factory.annotation.Value;

public class Reader {
    @Value("读者")
    private String name;
    @Value("88888888")
    private String idCard;

}

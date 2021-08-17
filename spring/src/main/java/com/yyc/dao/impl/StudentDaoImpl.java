package com.yyc.dao.impl;

import com.yyc.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {

    @Override
    public void insert() {
        System.out.println("通过mysql插入某某到数据库>>>");
    }
}

package com.yyc.dao.impl;

import com.yyc.dao.ReaderDao;
import org.springframework.stereotype.Repository;

@Repository
public class ReaderDaoImpl implements ReaderDao {

    @Override
    public void insert() {
        System.out.println("写入到数据库中.....");
    }
}

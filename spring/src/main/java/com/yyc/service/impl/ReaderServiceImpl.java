package com.yyc.service.impl;


import com.yyc.dao.ReaderDao;
import com.yyc.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderServiceImpl implements ReaderService {

    @Autowired
    public ReaderDao readerDao;

    @Override
    public void 进入图书馆业务() {
        System.out.println("1.手机预约");
        readerDao.insert();
        System.out.println("2.将预约信息写入到后台系统");
        System.out.println("3.出示穗康码");
    }
}

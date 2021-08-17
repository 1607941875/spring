package com.yyc.service.impl;

import com.yyc.dao.StudentDao;
import com.yyc.dao.impl.StudentDaoImpl;
import com.yyc.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = null;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void 增加学生业务(){

        System.out.println("1.学生体检");
        System.out.println("2.学生缴费");
        System.out.println("3.添加学生到系统数据库");
        System.out.println("执行中");
        studentDao.insert();
        System.out.println("写入完成");
        System.out.println("4.分发校园卡");
    }

}

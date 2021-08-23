package com.yyc.service._3AOP面向切面编程._2joinPoint连接点;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;


@Aspect
public class 切面类 {

    /**
     * 指定通知方法中的参数：JoinPoint
     * JoinPoint:业务方法 要加入切面功能的业务方法
     * 作用是：可以在通知方法中获取方法执行时的信息，例如方法名称，方法实参
     * 如果你的切面功能中，需要用到方法的信息，就加入JoinPoint
     * 这个JoinPoint参数的值是框架赋值的，位置必须放在第一个参数
     */

    @Before(value = "execution(* *..*in(Integer,String))")

    public void 前置通知(JoinPoint joinPoint) {

        System.out.println("第1个前置通知");
        System.out.println("前置通知，切面功能:在目标方法之前输出执行时间: " + new Date());
        System.out.print("获取方法的完整定义--->");
        System.out.println("方法的签名（定义）=" + joinPoint.getSignature());
        System.out.println("方法的名称 =" + joinPoint.getSignature().getName());
        Object args[] = joinPoint.getArgs();
        if (args != null && args.length > 0) {
            for (Object arg : args)
                System.out.println("参数 =" + arg);
        }
    }

    @Before(value = "execution(* *..*in(Integer,String))")

    public void 前置通知() {

        System.out.println("第2个前置通知");


    }

}

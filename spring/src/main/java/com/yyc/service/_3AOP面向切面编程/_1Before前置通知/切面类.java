package com.yyc.service._3AOP面向切面编程._1Before前置通知;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;


/**
 * @Aspect: 是aspectj框架中的注解
 * 作用：表示当前类是切面类
 * 切面类：是用来给业务方法增加功能的类，在这个类中有切面功能代码
 */

@Aspect
public class 切面类 {

/**
 * 定义方法，方法是实现切面功能的。
 * 方法的定义要求：
 * 1. 公共方法 public
 * 2. 方法没有返回值
 * 3. 方法名称自定义
 * 4. 方法可以有参数，也可以没有参数。
 *
 * */

/**
 * @before 前置通知注解
 * 属性:value,是切入点表达式，表示切面的功能执行的位置。
 * 位置:在方法之上
 * 特点:
 * 1.在目标方法之前先执行
 * 2.不会改变目标方法的执行结果
 * 3.不会影响目标方法的执行
 */
    /**
     * 指定通知方法中的参数：JoinPoint
     * JoinPoint:业务方法 要加入切面功能的业务方法
     * 作用是：可以在通知方法中获取方法执行时的信息，例如方法名称，方法实参
     * 如果你的切面功能中，需要用到方法的信息，就加入JoinPoint
     * 这个JoinPoint参数的值是框架赋值的，必须是第一个位置的参数
     */

//@Before(value = "execution(public void com.yyc.service._3AOP面向切面编程._1Before前置通知.ReserveServiceImpl.login(Integer,String))")
    @Before(value = "execution( void *..ReserveServiceImpl.login(Integer,String))")
//@Before(value = "execution(* *..login(Integer,String))")
//Before(value = "execution(* *..login(..))")
//@Before(value = "execution(* *..*in(Integer,String))")

    public void 前置通知(JoinPoint joinPoint) {

        System.out.println("第1个前置通知");
        System.out.println("前置通知，切面功能:在目标方法之前输出执行的时间: " + new Date());

    }

    @Before(value = "execution(* *..*in(Integer,String))")

    public void 前置通知() {

        System.out.println("第2个前置通知");


    }

}

package com.yyc.service._3AOP面向切面编程._7Pointcut替换全部切入点表达式;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class 切面类 {
    /**
     * @Pointcut: 定义和管理切入点， 如果你的项目中有多个切入点表达式是重复的，可以复用的。
     * 可以使用@Pointcut
     * 属性：value 切入点表达式
     * 位置：在自定义的方法上面
     * 特点：
     * 当使用@Pointcut定义在一个方法的上面 ，此时这个方法的名称就是切入点表达式的别名。
     * 其它的通知中，value属性就可以使用这个方法名称，代替切入点表达式了
     */
    @Pointcut("execution(* *.._7Pointcut替换全部切入点表达式.ReserveServiceImpl.login(..))")
    private  void 切入点表达式变量() {
        /**
         * 啥也不用写
         * */
    }

    @Before("切入点表达式变量()")
    public void 前置通知() {
        System.out.println("前置通知");
    }

    @After("切入点表达式变量()")
    public void 后置通知() {
        System.out.println("后置通知");
    }

    @After("切入点表达式变量()")
    public void 最终通知() {

        System.out.println("最终通知，即使发生了异常也能正常执行!👌");

    }


}

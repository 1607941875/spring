package com.yyc.service._3AOP面向切面编程._4Around注解环绕通知;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class 切面类 {
    /**
     * 环绕通知方法的定义格式
     *  1.public
     *  2.必须有一个返回值，推荐使用Object
     *  3.方法名称自定义
     *  4.方法有参数，固定的参数 ProceedingJoinPoint
     */

    /**
     * @Around: 环绕通知
     * 属性：value 切入点表达式
     * 位置：在方法的定义什么
     * 特点：
     * 1.它是功能最强的通知
     * 2.在目标方法的前和后都能增强功能。
     * 3.控制目标方法是否被调用执行
     * 4.修改原来的目标方法的执行结果。 影响最后的调用结果
     * <p>
     * 环绕通知，等同于jdk动态代理的，InvocationHandler接口
     * <p>
     * 参数：  ProceedingJoinPoint 就等同于 Method
     * 作用：执行目标方法的
     * 返回值： 就是目标方法的执行结果，可以被修改。
     * <p>
     * 环绕通知： 经常做事务， 在目标方法之前开启事务，执行目标方法， 在目标方法之后提交事务
     */

    @Around("execution(* *..ReserveServiceImpl.logout(..))")
    public Object 环绕通知(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("====执行环绕通知前====");

        /**
         * 因为 看源码 ProceedingJoinPoint extends JoinPoint
         *
         *
         * */
        System.out.print("获取方法的完整定义--->");
        System.out.println("方法的签名（定义）=" + proceedingJoinPoint.getSignature());
        System.out.println("方法的名称 =" + proceedingJoinPoint.getSignature().getName());
        Object args[] = proceedingJoinPoint.getArgs();
        if (args != null || args.length > 0) {
            for (Object arg : args)
                System.out.println("参数 =" + arg);
        }
        Object obj = proceedingJoinPoint.proceed();  //method.invoke()
        System.out.println(obj);
        System.out.println("====执行环绕通知后====");
        return "👌";

    }

}

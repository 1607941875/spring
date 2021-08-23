package com.yyc.service._3AOP面向切面编程._6After最终通知;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class 切面类 {
    /**
     * 最终通知方法的定义格式
     *  1.public
     *  2.没有返回值
     *  3.方法名称自定义
     *  4.方法没有参数，  如果还有是JoinPoint,
     */

    /**
     * @After :最终通知
     * 属性： value 切入点表达式
     * 位置： 在方法的上面
     * 特点：
     * 1.总是会执行
     * 2.在目标方法之后执行的---->经常用作清除资源
     * <p>
     * try{
     * SomeServiceImpl.doThird(..)
     * }catch(Exception e){
     * <p>
     * }finally{
     * myAfter()
     * }
     */
    @After("execution(* *.._6After最终通知.ReserveServiceImpl.login(..))")
    public void 最终通知() {

        System.out.println("最终通知，即使发生了异常也能正常执行!👌");

    }


}

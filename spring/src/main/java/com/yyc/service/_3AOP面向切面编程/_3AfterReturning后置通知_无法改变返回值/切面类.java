package com.yyc.service._3AOP面向切面编程._3AfterReturning后置通知_无法改变返回值;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class 切面类 {
    /**
     * @AfterReturning:后置通知 属性: 1.value 切入点表达式
     * 2.returning 自定义的变量，表示目标方法的返回值。
     * 自定义变量名必须和通知方法的形参名一样。
     * 位置：在方法定义的上面
     * 特点：
     * 1.在目标方法之后执行的
     * 2.能够获取到目标方法的返回值，可以根据这个返回值做出不同的处理功能
     * 3.可以修改这个返回值
     */
    @AfterReturning(value = "execution(* *..ReserveServiceImpl.logout(..))", returning = "res")
    public Object 后置通知_没有改变返回值(Object res) {

        /**
         * 把res想象成中间变量就行,car开辟了一个新的内存，res指向和car都指向了res，所以呢?只是修改了res的指针没有用的。
         * */
        if (res != null) {

            Car car = new Car("特斯拉", "跑车");
            res = car;
        }
        return res;
    }
}

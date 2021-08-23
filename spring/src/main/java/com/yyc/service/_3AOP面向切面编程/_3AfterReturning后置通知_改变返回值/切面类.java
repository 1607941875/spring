package com.yyc.service._3AOP面向切面编程._3AfterReturning后置通知_改变返回值;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class 切面类 {
    /**
     * @AfterReturning:后置通知
     * 属性: 1.value 切入点表达式
     *      2.returning 自定义的变量，表示目标方法的返回值。
     * 自定义变量名必须和通知方法的形参名一样。
     * 位置：在方法定义的上面
     * 特点：
     * 1.在目标方法之后执行的
     * 2.能够获取到目标方法的返回值，可以根据这个返回值做出不同的处理功能
     * 3.可以修改这个返回值
     */
    @AfterReturning(value = "execution(* *..ReserveServiceImpl.logout(..))", returning = "res")
    public Object 后置通知_没有改变返回值(Object res) {
        if (res != null) {

            //---直接赋值没有产生新的对象，而是新增了一个对象引用,car 和 res 指向同一块内存
            Car car = (Car) res;
            car.setBrand("特斯拉");
            car.setType("电动车");

        }
        return res;
    }

}

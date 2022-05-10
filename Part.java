package chapter03;

import com.sun.corba.se.impl.interceptors.PICurrent;

/**
 * @Author SLX
 * @Date 2022-05-10 12:28
 */

public class Part {

    //声明常量PI，此时如果不对PI进行赋值，将会出现错误提示
    //static final double PI;
    static final double PI = 3.14;
    static int age = 23;    //声明int型变量age并进行赋值

    public static void main(String[] args) {
        final int number;   //声明int型常量number
        number = 1235;  //对常量进行赋值
        age = 22;   //再对变量进行赋值
        //number = 1236;    //错误代码，因为number为常量，只能进行一次赋值
        System.out.println("常量PI的值为：" + PI);
        System.out.println("赋值后number的值为：" + number);
        System.out.println("int型变量age的值为：" + age);
    }
}

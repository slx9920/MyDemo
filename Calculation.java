package chapter03;

/**
 * @Author SLX
 * @Date 2022-05-10 14:29
 */

public class Calculation {

    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        //声明boolean型变量，用于保存应用逻辑运算符“&&”后的返回值
        boolean result1 = ((a > b)) && (a != b);
        //声明boolean型变量，用于保存应用逻辑运算符“||”后的返回值
        boolean result2 = ((a > b)) || (a != b);
        System.out.println(result1);
        System.out.println(result2);
    }

}

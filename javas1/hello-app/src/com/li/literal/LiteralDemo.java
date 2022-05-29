package com.li.literal;

public class LiteralDemo {
    public static void main(String[] args) {
//        整数
        System.out.println(666);
//        小数
        System.out.println(19.6);
//        字符，必须用单引号括起来
        System.out.println(' ');
        System.out.println('a');
//        字符串，必须用双引号括起来
        System.out.println("askd");
//        \n 换行 \t tab一个缩进
//        变量： 数据类型 变量名称=初始值
//        先声明再使用，声明后，不能存储其它类型的数据，同一作用范围
//        内变量名不能重名，范围以“}”结束
//        定义时可以没有初始值，使用时必须有初始值
        double money=0.6;
        System.out.println(money);
        money=money+0.8;
        System.out.println(money);
        long lg=154596265456454L;//默认int整数过大，加L,当long型处理
        float ff=98.5F;//小数默认double,float类型加F
        boolean r1=true;
        System.out.println(r1);
//        自动类型转换
        byte ab=12 ;
        int b=ab;
        System.out.println(ab);
        System.out.println(b);

    }
}

package com.xiongjun.common;

/**
 * 静态内部类测试
 */
public class IntenalClassTest {

    public static void main(String[] args) {
        Son.staHello();
    }

    public static class Son{

        public static void staHello(){
            System.out.println("staHello");
        }

        public void hello(){
            System.out.println("");
        }
    }

}

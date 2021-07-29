package com.ssafy.day5.exception.resource;

import java.util.Random;

public class ExceptionHandlingFlow {
    public static void main(String[] args) {
        int num = new Random().nextInt(2);
        try {
            System.out.println("code 1, num: " + num);
            int i = 1 / num;
            System.out.println("code 2 - 예외 없음");
            return;
        } catch (ArithmeticException e) {
            System.out.println("code 3 - exception handling 완료");
        } finally {
            System.out.println("code 4 - 언제나 실행");
        }
        System.out.println("code 5");
    }
}

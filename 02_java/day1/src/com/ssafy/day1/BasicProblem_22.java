package com.ssafy.day1;

/**
 * @since 2021. 7. 4.
 */
public class BasicProblem_22 {
    public static void main(String[] args) {
        
        // <<
        System.out.println("1 << 2 = " + (1 << 2));
        //    .... 0000 0001
        // << .... 0000 0100

        System.out.println("3 << 3 = " + (3 << 3));
        //    .... 0000 0011
        // << .... 0001 1000
        
        
        // >>
        System.out.println("1 >> 2 = " + (1 >> 2));
        //    .... 0000 0001
        // >> .... 0000 0000
        
        System.out.println("-16 >> 2 = " + (-16 >> 2));
        //    .... 1111 0000
        // >> .... 1111 1100
        
        // >>>
        System.out.println("7 >>> 2 = " + (7 >>> 2));
        //     0000 .... 0000 0111
        // >>> 0000 .... 0000 0001
        
        System.out.println("-5 >>> 24 = " + (-5 >>> 24));
        //     1111 1111 1111 1111 1111 1111 1111 1001
        // >>> 0000 0000 0000 0000 0000 0000 1111 1111
    }
}

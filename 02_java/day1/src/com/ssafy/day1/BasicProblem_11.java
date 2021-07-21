package com.ssafy.day1;

/**
 * @since 2021. 7. 4.
 */
public class BasicProblem_11 {
    public static void main(String[] args) {
    	
    	String s = new String("ssafy");
    	s = null;
    	System.gc();
        // A
        {
            int i = 10;
            byte b = (byte) i;
        }
        
        // B
        {
            byte b = 10;
            int i = b;          
        }
    }
}

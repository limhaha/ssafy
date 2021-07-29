package com.ssafy.day5.exception.resource;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @since 2021. 7. 8.
 */
public class TryWithResource {

    public static void main(String[] args) {
        TryWithResource test = new TryWithResource();
        test.useStream();
        test.useStreamNewStye();

    }


    public void useStream() {
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream("abc.txt");
            fileInput.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInput != null) {
                try {
                    fileInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void useStreamNewStye() {
    	try(FileInputStream input = new FileInputStream("abc.txt")){
    		
    	}
        // TODO: useStream을 try~with~resource 문장으로 변경하세요.
        // END:
    }
}

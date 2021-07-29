package com.ssafy.day5.collection.set;

import java.util.HashSet;
import java.util.Set;
import com.ssafy.day5.collection.SmartPhone;

/**
 * @since 2021. 7. 8.
 */
public class SetTest {
    Set<Object> hset = new HashSet<Object>();
    
    private void addMethod() {
        hset.add(new Integer(1));
        hset.add("Hello");     
        hset.add("Hello");      // 동일한 데이터 추가 확인
        hset.add(1);            // 기본형은 wrapper를 통해 추가
        // TODO: SmartPhone 타입의 객체를 추가해보자.
        hset.add(new SmartPhone("010"));
        hset.add(new SmartPhone("010"));
        
        // END:
        System.out.println("데이터 추가 결과: " + hset);
    }

    private void retrieveMethod() {
        System.out.println("데이터 개수: " + hset.size());
        
        
        for (Object sobj : hset) {
            System.out.println("데이터 조회: " + sobj);
        }
    }

    private void removeMethod() {
        hset.remove("Hello");
        System.out.println("데이터 삭제 결과: " + hset);
    }
    
    public static void main(String[] args) {
        SetTest test = new SetTest();
        test.addMethod();
//        test.retrieveMethod();
//        test.removeMethod();
    }
}

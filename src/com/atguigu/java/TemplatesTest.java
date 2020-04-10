package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2020-04-10 10:40
 */
public class TemplatesTest {


    //模板一:psvm
    public static void main(String[] args) {


        //模板二:sout
        System.out.println("helle");
        //变形:soutp,soutv,soutm,xxx.sout
        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);

        //for循环:fori
        String[] arr = new String[]{"hzt","qxc","hhh"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        变形:iter
        for (String s : arr) {
            System.out.println(s);
        }

//        list.for
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(132);
        objects.add(456);
        objects.add(789);
        for (Object object : objects) {
            System.out.println(object);
        }
//        条件判断:ifn
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add(132);
        list1.add(456);
        list1.add(789);
        if (list1 == null) {

        }
//        inn
        if (list1 != null) {

        }



    }

}

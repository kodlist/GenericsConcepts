package com.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardVSObject {


    public void method1(List<?> lis)
    {  //lis.add(new Integer(1));
        System.out.println(lis);
    }

    public static void main(String[] args) {


        WildcardVSObject w = new WildcardVSObject();
        List<Integer>li = new ArrayList<Integer>(); li.add(2);
        w.method1(li);


        List<?> li1 = new ArrayList<Integer>();
      //  li1.add(new Integer(1));
    }
}

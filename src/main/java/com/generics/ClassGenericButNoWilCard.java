package com.generics;


//THIS doesnt work.
/*class XClass <?>{

}*/

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//this works
class YClass <T>{

}
public class ClassGenericButNoWilCard {

    public static void main(String[] args) {

        List<?> li = new ArrayList<>();
        //li.add(new Integer(1));
        List<?> li1 = new ArrayList<Integer>();
        //li1.add(new Integer(1));

        List<? super Number> li2 = new ArrayList<Number>();
        li2.add(new Integer(1));
        li2.add(new Long(22));

        List<? extends  Number> li3 = new ArrayList<Number>();
        //li3.add(new Integer(2));
        List<? extends  Number> li4 = new ArrayList<Integer>();
        //li4.add(new Integer(2));





    }
}

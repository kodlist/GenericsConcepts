package com.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Car{

    @Override
    public String toString() {
        return "Car";
    }
}
class BMW extends Car{
    @Override
    public String toString() {
        return "BMW";
    }
}

class BX extends BMW{

}

class TestCar{

    List<Car> carL = new ArrayList<>();

    public void addCar(List<Car> cars)
    {

        cars.add(new BMW());

    }

    public void addCarToLi(Car c)
    {
        carL.add(new BMW());
    }

    public void addCarToLisUSINGextend(List<? extends BMW> cars)
    {



        //    cars.add(new BX());
      //cars.add(new BMW());
     //cars.add(new Car());
      //cars.addAll(cars);

        List<BX> lsB = new ArrayList<>();
        lsB.add(new BX());
        //lsB.add(new BMW());
        List<BMW> ls = new ArrayList<>();
        ls.add(new BX());
       //ls.add(new Car());
        ls.add(new BMW());
       //cars.add(ls);

        ls.addAll(cars);

        ls.addAll(lsB);

        List<String> ls1 = new ArrayList<>();



        System.out.println(cars);
        System.out.println(cars.size() + " ---  ");
       // System.out.println(cars.get(0));

    }

    public void addCarToLisUSINGssuper(List<? super BMW> cars)
    {

        List<Car> ls = new ArrayList<>();
        ls.add(new BX());
        ls.add(new Car());
        ls.add(new BMW());


       // cars.add(ls);


       cars.add(new BMW());
       //cars.add(new Car());
        cars.add(new BX());
        System.out.println(cars);
        System.out.println(cars.size() + " ---  ");
        System.out.println(cars.get(0));

    }

}

public class Generic_with_extend_super {

    public static void main(String[] args) {
        List<Car> carL = new ArrayList<>();

        carL.add(new Car());
        TestCar ts = new TestCar();
       // ts.addCarToLisUSINGextend(carL);
       // ts.addCarToLisUSINGssuper(carL);

        List<BX> bxCar = new ArrayList<>();
        List<BMW> carBmw = new ArrayList<>();
        carBmw.add(new BMW());
       ts.addCarToLisUSINGextend(carBmw);
     //  ts.addCarToLisUSINGextend(carL);
        ts.addCarToLisUSINGextend(bxCar);
        ts.addCarToLisUSINGextend(carBmw);
        ts.addCarToLisUSINGssuper(carL);
        ts.addCarToLisUSINGssuper(carBmw);
      //  ts.addCarToLisUSINGssuper(bxCar);



        ArrayList<Integer> arrlist1 =
                new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrlist1.add(12);
        arrlist1.add(20);
        arrlist1.add(45);

        ArrayList<Integer> arrlist2 =
                new ArrayList<Integer>(5);

        // use add() method to add elements in list2
        arrlist2.add(25);
        arrlist2.add(30);
        arrlist2.add(31);
        arrlist2.add(35);






    }
}

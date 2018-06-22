package com.generics;

import java.util.*;

 abstract  class Animal{

    abstract void addAnimal(Animal list)
    ;
}

class Dog extends  Animal{

     //List<Animal> aniLis ;

    void addAnimal(Animal animals) {
     //   aniLis.add(animals);
    }
}

class Inserter{

    List li = new ArrayList();
    void insert(List list)
    {
        list.add(new String("44"));
        li =list;
    }

    void printList()
    {
        System.out.println(li);
    }
}

class AnimalInList
        {

            List<Animal> aniLis = new ArrayList<Animal>() ;
            void addAnimals(Animal animals) {
                aniLis.add(animals);
            }

            void printList()
            {
                System.out.println("---------------");
                System.out.println(aniLis);
            }
            List<Animal> aniLis2 = new ArrayList<Animal>() ;
            void addSani(List<Animal> a )
            {
               // aniLis2.add(new String(""));
               // a.add(new String(""));
            }
        }
public class TestBadLegacyGeneric {



    public static void main(String[] args) {


        List<Integer> myli = new ArrayList<>();
        myli.add(4);
        myli.add(5);
        Inserter ins = new Inserter();

        ins.insert(myli);


        System.out.println();
        ins.printList();

        AnimalInList anilist = new AnimalInList();
       Dog dog = new Dog();
        Animal dog1 = new Dog();

        anilist.addAnimals(dog);
        anilist.addAnimals(dog1);
        anilist.printList();

        String s1 = new String("lll");
       // anilist.addAnimals(s1);
        ArrayList<Dog>  ds = new ArrayList<>();
        ds.add(new Dog());
       // anilist.addSani(ds);
    }
}

package com.generics;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract  class Animal{
    public abstract void makeNoise(Animal animal)
    ;
}

class Dog extends  Animal{

    @Override
    public String toString() {
        return "Dog object...";
    }

    @Override
    public void makeNoise(Animal animal) {
        System.out.println("dog......" + animal);
    }
}

class Cat extends  Animal{

    @Override
    public String toString() {
        return "Cat object...";
    }

    @Override
    public void makeNoise(Animal animal) {
     System.out.println("cat....." +animal);
    }
}

class  Bird extends Animal{

    @Override
    public String toString() {
        return "Bird object...";
    }

    @Override
    public void makeNoise(Animal animal) {
        System.out.println("bird....." +animal);
    }
}

class HelperAnimal{

    public void makeSomeNoise(Animal animal)
    {
        animal.makeNoise(animal);
    }

    public void makeSomeNoiseA(List< ? extends Animal> animalsList)
    {
        for(Animal a : animalsList)
        {
            a.makeNoise(a);
        }
    }
}
public class GenericVSNormal {




    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        HelperAnimal hs = new HelperAnimal();

        hs.makeSomeNoise(dog);
        hs.makeSomeNoise(cat);
        hs.makeSomeNoise(bird);


      /*  hs.makeSomeNoise(dog);
        hs.makeSomeNoise(cat);
        hs.makeSomeNoise(bird);
        hs.makeSomeNoise(dog);
        hs.makeSomeNoise(cat);
        hs.makeSomeNoise(bird);
        hs.makeSomeNoise(dog);
        hs.makeSomeNoise(cat);
        hs.makeSomeNoise(bird);
*/

      System.out.println("-----------------------------");
        List<Animal> animalLS = new ArrayList<>()
;
        animalLS.add(dog);
        animalLS.add(cat);
        animalLS.add(bird);

        hs.makeSomeNoiseA(animalLS);

        List<Dog > liDog = new ArrayList<>();

        hs.makeSomeNoiseA(liDog);

        Scanner sc = new Scanner(System.in);





    }

}

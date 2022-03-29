package com.ibs.javafeatures.newinstanceof;

public class Demo {

    public void performAnimalOperations(Animal animal) {
        if (animal instanceof Cat cat) {
            cat.meow();
        } else if(animal instanceof Dog dog) {
            dog.woof();
        }
    }

    abstract class Animal {
    }

    final class Cat extends Animal {
        void meow() {
            System.out.println("meow");
        }
    }

    final class Dog extends Animal {
        void woof() {
            System.out.println("woof");

        }
    }
    public void create(Demo demo){
        demo.performAnimalOperations(new Cat());
        demo.performAnimalOperations(new Dog());

    }

    public static void main(String[] args)
    {

        Demo demo = new Demo();
        demo.create(demo);


    }


}

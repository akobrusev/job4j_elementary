package ru.job4j.tracker;

public class Item {

    public Item() {
        super();
        System.out.println("load item");
    }
    public static class Bug extends Item {
    }
    public static void main(String[] args) {
        Bug bug = new Bug();
    }
 }
 class Animal {
    public Animal() {
        super();
        System.out.println ("Animal");
    }
    public static class Name extends Animal {
    }
     public static void main(String[] args) {
         Name name = new Name();
     }
 }
class Predator {
    public Predator() {
        super();
        System.out.println ("Predator");
    }
    public static class Name extends Predator {
    }
    public static void main(String[] args) {
        Name name = new Name();
    }
}

class Tiger {
    public Tiger() {
        super();
        System.out.println ("Tiger");
    }
    public static class Name extends Tiger {
    }
    public static void main(String[] args) {
        Name name = new Name();
    }
}
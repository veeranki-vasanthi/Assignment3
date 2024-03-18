//Abstraction in Java is a fundamental concept of object-oriented programming that allows us to hide the complex implementation details and only show the necessary features.
//There are two main ways to achieve abstraction in Java: Abstract Classes and Interfaces
//code to implement abstraction

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();

        Animal myCat = new Cat();
        myCat.makeSound();
    }
}

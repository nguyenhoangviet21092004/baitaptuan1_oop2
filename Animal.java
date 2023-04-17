package baitaptuan1;

public class Animal {
    public double weight ;
    public double height ;

    public Animal() {
        this.weight = 0.0 ;
        this.height = 0.0 ;
    }

    public Animal(double weight , double height) {
        this.height = height ;
        this.weight = weight ;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString () {
        return "A animal with weight " + getWeight() + "and height" + getHeight() ;
    }
}

class Cat extends Animal {
    public double age;

    public Cat() {
        this.age = 1.0;
    }

    public Cat(double age) {
        this.age = age;
    }

    public Cat(double age, double weight, double height) {
        super(weight, height);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String toString() {
        return "A Cat with age " + getAge() + "which is a subclass of" + super.toString();
    }
}

class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat() ;
        System.out.println(cat);

        cat = new Cat(3.5);
        System.out.println(cat);

        cat = new Cat(3.5,5,10) ;
        System.out.println(cat);
    }
}
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void sound() {
        super.sound();
        System.out.println("Dog Sound");
    }
}

public class Keyword_Super {
    public static void main(String[] args) {
        Dog s = new Dog();
        s.sound();
    }
}

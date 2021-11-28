class Mammal {
    void show() {
        System.out.println("Mammal Class");
    }
}

class Man extends Mammal    {
    String n;
    Man()   {
        n = "Man default constructor";
    }
    Man (String s)  {
        n = s;
    }
    void show() {
        System.out.println("Man Class ( Inherited form Mammals ) : "+n);
    }
}

class Dog extends Mammal    {
    String n;
    Dog()   {
        n = "Dog default constructor";
    }
    Dog (String s)  {
        n = s;
    }
    void show() {
        System.out.println("Dog Class ( Inherited form Mammals ) : "+n);
    }
}

class Elephant extends Mammal    {
    String n;
    Elephant()   {
        n = "Elephant default constructor";
    }
    Elephant(String s)  {
        n = s;
    }
    void show() {
        System.out.println("Elephant Class ( Inherited form Mammals ) : "+n);
    }
}

class Rabbit extends Mammal    {
    String n;
    Rabbit()   {
        n = "Rabbit default constructor";
    }
    Rabbit(String s)  {
        n = s;
    }
    void show() {
        System.out.println("Elephant Class ( Inherited form Mammals ) : "+n);
    }
}

public class hierarchical {
    public static void main (String args[])
    {
        Man m = new Man("Deenesh");
        Dog d = new Dog("Tommy");
        Elephant e = new Elephant("Ram");
        Rabbit r = new Rabbit("Rabbit");

        m.show();
        d.show();
        e.show();
        r.show();

    }
}

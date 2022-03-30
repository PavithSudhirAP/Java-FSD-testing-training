package day9;

class GrandParent {
    GrandParent() {
        super();
        System.out.println("GP");
    }
}

class Parent extends GrandParent {
    Parent() {
        super();
        System.out.println("P");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Ch");
    }
}

public class ConstructorChaining2 {
    public static void main(String[] args) {
        new Child();
    }
}

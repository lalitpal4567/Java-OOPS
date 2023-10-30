package constructor.constructorChaining.thisKeywordInSameClass;

public class NewChain
{
    private int value1;
    private int value2;
    private String name;

    public NewChain() {
        this(0, 0, "Default");
    }

    public NewChain(int value1, int value2) {
        this(value1, value2, "Custom");
    }

    public NewChain(int value1, int value2, String name) {
        this.value1 = value1;
        this.value2 = value2;
        this.name = name;
    }

    public void printValues() {
        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("name: " + name);
    }

    public static void main(String[] args) {
        NewChain obj1 = new NewChain();
        obj1.printValues();

        System.out.println();

        NewChain obj2 = new NewChain(10, 20);
        obj2.printValues();

        System.out.println();

        NewChain obj3 = new NewChain(30, 40, "Custom Name");
        obj3.printValues();
    }
}


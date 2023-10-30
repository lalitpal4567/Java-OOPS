package polymorphism.overriding.interfaceMethodsOverriding;

interface FreeAndroidApps{
    default void PDFConverter(){    // by default it is public
        System.out.println("Install PDF converter");
    }
}
abstract class Vivo implements FreeAndroidApps{
    @Override
    public void PDFConverter(){     // public is mandatory here
        System.out.println("Vivo offer free PDF converter.");
    }
}
class Computer extends Vivo{
    @Override
    public void PDFConverter(){     // // public is mandatory here
        System.out.println("Sorry this is not computer app.");
    }
}

public class DefaultMethodOverriding2 {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.PDFConverter();

//        Vivo vivo = new Vivo(); // compilation error Vivo' is abstract; cannot be instantiated
        Vivo vivo = new Computer();
        vivo.PDFConverter();

        FreeAndroidApps app = new Computer();
        app.PDFConverter();
    }
}

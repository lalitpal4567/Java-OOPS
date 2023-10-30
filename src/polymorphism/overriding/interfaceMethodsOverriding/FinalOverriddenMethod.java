package polymorphism.overriding.interfaceMethodsOverriding;

interface Engine{
     default String enginePower(){
        return "5 Hp engine";
    }
}

abstract class Car implements Engine{
    @Override
    public final String enginePower(){      // final method
        return "7 HP engine";
    }
}
public class FinalOverriddenMethod extends Car{
//    @Override
//    public final String enginePower(){    // compilation error because final method can't be overridden
//        return "10 HP engine";
//    }

    public static void main(String[] args) {
        FinalOverriddenMethod obj = new FinalOverriddenMethod();
    }
}

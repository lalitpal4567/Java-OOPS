package polymorphism.overriding.sameVariableInParentChildClass;

class Question{
    static int a = 10;
}
class Question1 extends Question{
    static int a = 20;
}
public class Quest extends Question1 {
    public static void main(String[] args) {
        a = 100;
        System.out.println(Question.a);
        System.out.println(Question1.a);
    }
}

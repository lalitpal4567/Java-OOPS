package polymorphism.overriding.interfaceMethodsOverriding;

interface University{
    void conductExam(); // by default it is public abstract
}

public class College implements University{
    @Override
    public void conductExam(){
        System.out.println("Exam will be conducted in the month of July");
    }

    public static void main(String[] args) {
        College akg = new College();
        akg.conductExam();

        University obj = new College();
        obj.conductExam();
    }
}

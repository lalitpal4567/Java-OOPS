package constructor.defaultConstructor;

class Mom
{
    String job;
    int age;

    Mom()
    {
        job = "House keeper";
        age = 32;
//        this.job = "House keeper";
//        this.age = 32;
    }
}
public class Mother {
    public static void main(String[] args) {
        Mom mom = new Mom();
        System.out.println(mom.job);
        System.out.println(mom.age);
    }
}

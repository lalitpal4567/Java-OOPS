package inheritance.singleInheritance.example_09;

class Credit
{
    float salary = 4000; // by default it is package
}

class Balance extends Credit
{
    int bonus = 3000;
//    float income = salary + bonus;
    float income = this.salary + bonus; // using this keyword

    public static void main(String[] args) {
        Balance obj = new Balance();
        System.out.println("Bonus: "+obj.bonus);
        System.out.println("Income: "+obj.income);
    }
}
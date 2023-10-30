package practiceQuestion;

class Address{
    String city;
    int houseNo;
    String district;
    String state;
    Address(){}
    public void setState(String state){
        this.state = state;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setHouseNo(int houseNo){
        this.houseNo = houseNo;
    }
    public void setDistrict(String district){
        this.district = district;
    }
    public String getState(){
        return state;
    }
    public String getDistrict(){
        return district;
    }
    public String getCity(){
        return city;
    }
    public int getHouseNo(){
        return houseNo;
    }
}
class User{
    String name;
    int age;
    String gender;
    Address address;
    User(){
        address = new Address();
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public String userInfo(){
        return "name: " + name + "\nage: " + age + "\ngender: ";
    }
    public String getAddress(){
        return "City: " + address.city + "\nHouse no: " + address.houseNo + "\nDistrict: " + address.district + "\nState: " + address.state;
    }
}
public class StudentLocation {
    public static void main(String[] args) {
        User lalit = new User();
        lalit.setName("Lalit Pal");
        lalit.setGender("Male");
        lalit.setAge(24);
        lalit.address.setCity("Noida");
        lalit.address.setDistrict("Ghaziabad");
        lalit.address.setState("Uttar Pradesh");
        lalit.address.setHouseNo(20);

        System.out.println(lalit.userInfo());
        System.out.println(lalit.getAddress());
    }
}

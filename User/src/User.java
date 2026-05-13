class User {
    private int id;
    private String name;
    private int age;

    public User(){

    }
    public User(int id , String name , int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //getter for id
    public int getId(){
        return id;
    }

    //setter for id
    public void setId(int id){
        if (id <= 0) {
            System.out.println("Invalid Id");
            return;
        }
        this.id = id;
    }

    //getter for name
    public String getName(){
        return name;
    }

    //setter for name
    public void setName(  String name ){
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid Name");
            return;
        }
        this.name = name ;
    }

    //getter for age
    public int getAge() {
        return age;
    }

    //setter for age
    public void setAge(int age){
        if (age < 0 || age > 120) {
            System.out.println("Invalid Age");
            return;
        }
        this.age = age ;
    }

    //method
    public void DisplayUser(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

}

public class Main{
    public static void main(String[] args){
        User user1 = new User(1 , "abcd" , 12);
        User user2 = new User(2 , "defg" , 13);
        System.out.println("User1 details : ");
        user1.DisplayUser();
        System.out.println("\nUser2 details : ");
        user2.DisplayUser();
        user2.setAge(15);
        user2.setName("hjkl");
        user2.setId(3);
        System.out.println("\nUser2 updated details : ");
        System.out.println("id : " + user2.getId());
        System.out.println("name : " + user2.getName());
        System.out.println("age : " + user2.getAge());


    }
}

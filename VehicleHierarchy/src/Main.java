class Vehicle {
    void start(){
        System.out.println("Vehicle is starting");
    }
}

class bike extends Vehicle {

    @Override
    void start(){
        System.out.println("Bike is starting with key");
    }

}

class electricBike extends Vehicle{

    @Override
    void start() {
        System.out.println("electricBike is starting with button");
    }
}



public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new bike();
        Vehicle v3 = new electricBike();

        v1.start();
        v2.start();
        v3.start();

    }
}
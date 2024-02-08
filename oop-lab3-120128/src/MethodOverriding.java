class Vehicle {
    void startEngine () {
        System.out.println("Vehicle engine start. This is a generic behaviour");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println(" Car engine starts with a key or a button press");
    }
}

class ElectricCar extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Electric car engine starts silently with a button press.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starts with a kickstart or button press.");
    }
}

class Mainvehicle {
    public static void main(String[] args) {
        //An object of the superclass Vehicle
        Vehicle myvehicle = new Vehicle();
        System.out.println("How does a vehicle engine generally starts?");
        myvehicle.startEngine();


    }
}
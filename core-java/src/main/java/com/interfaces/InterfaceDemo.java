package com.interfaces;

interface IVehicle {
    void drive();
    void turnLeft();
    void brake();
}
interface IPublicTransport {
    void getNumberOfPeople();
}
class MotorizedVehicle {
    public void checkMotor() {
        System.out.println("The Motor of vehicle is in good condition.");
    }
}
class Car extends MotorizedVehicle implements IVehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car is turning left.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }
}
class Train implements IVehicle, IPublicTransport {
    @Override
    public void drive() {
        System.out.println("Train is driving.");
    }

    @Override
    public void turnLeft() {
        System.out.println("Train is turning left.");
    }

    @Override
    public void brake() {
        System.out.println("Train is braking.");
    }

    @Override
    public void getNumberOfPeople() {
        System.out.println("Train has 100 people.");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        IVehicle vehicle = new Car();
        vehicle.drive();
        vehicle.turnLeft();
        vehicle.brake();
        new Car().checkMotor();
        //Car car = new Car();
        //car.checkMotor();

        vehicle = new Train();
        vehicle.drive();
        vehicle.turnLeft();
        vehicle.brake();
        IPublicTransport transport = new Train();
        transport.getNumberOfPeople();
    }
}

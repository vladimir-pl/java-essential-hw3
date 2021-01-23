public class Vehicle {

  double price;
  double speed;
  int year;

  Vehicle() {
    price = 1000.0;
    speed = 115.0;
    year = 2007;
  }

  @Override
  public String toString() {
    return "price: " + price + ", speed: " + speed + ", year: " + year;
  }
}

class Plane extends Vehicle {

  double height;
  int passengers;

  public Plane(double height, int passengers) {
    this.height = height;
    this.passengers = passengers;
  }

  @Override
  public String toString() {
    return "price: " + price + ", speed: " + speed + ", year: " + year + ", height: " + height + ", passengers: "
        + passengers;
  }
}

class Car extends Vehicle {


}

class Ship extends Vehicle {

  int passengers;
  String port;

  public Ship(int passengers, String port) {
    this.passengers = passengers;
    this.port = port;
  }

  @Override
  public String toString() {
    return "price: " + price + ", speed: " + speed + ", year: " + year + ", port: " + port + ", passengers: "
        + passengers;
  }
}

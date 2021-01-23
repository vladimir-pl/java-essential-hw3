public class Main {

  public static void main(String[] args) {

    Vehicle car = new Car();
    Vehicle plane = new Plane(123, 56);
    Vehicle ship = new Ship(1100, "Bar");

    System.out.println(car.toString());
    System.out.println(plane.toString());
    System.out.println(ship.toString());
  }
}

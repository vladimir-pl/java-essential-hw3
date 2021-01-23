public class Main {

  public static void main(String[] args) {
    Printer printer1 = new Printer();
    Printer printer2 = new ColorPrinter();

    printer1.print("Message");
    printer2.print("Message");
  }
}

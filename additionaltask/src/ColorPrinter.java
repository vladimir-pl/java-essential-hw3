public class ColorPrinter extends Printer {

  @Override
  void print(String value) {
    System.out.println((char) 27 + "[31m" + value + (char) 27 + "[39m");
  }
}

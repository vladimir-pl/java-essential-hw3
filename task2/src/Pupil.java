public class Pupil {

  void study(){

  }

  void read(){

  }

  void write(){

  }

  void relax(){

  }
}

class ExcelentPupil extends Pupil {

  int grade = 5;
  @Override
  void read() {
    System.out.println("Read score: " + grade);
  }

  @Override
  void relax() {
    System.out.println("Relax score: " + grade);
  }

  @Override
  void study() {
    System.out.println("Study score: " + grade);
  }

  @Override
  void write() {
    System.out.println("Study score: " + grade + "\n");
  }
}

class GoodPupil extends Pupil {

  int grade = 4;
  @Override
  void read() {
    System.out.println("Read score: " + grade);
  }

  @Override
  void relax() {
    System.out.println("Relax score: " + grade);
  }

  @Override
  void study() {
    System.out.println("Study score: " + grade);
  }

  @Override
  void write() {
    System.out.println("Study score: " + grade + "\n");
  }
}

class BadPupil extends Pupil {

  int grade = 3;
  @Override
  void read() {
    System.out.println("Read score: " + grade);
  }

  @Override
  void relax() {
    System.out.println("Relax score: " + grade);
  }

  @Override
  void study() {
    System.out.println("Study score: " + grade);
  }

  @Override
  void write() {
    System.out.println("Study score: " + grade + "\n");
  }
}
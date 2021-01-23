import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int proKey = 555, expertKey = 777;
    Scanner in = new Scanner(System.in);
    int key = in.nextInt();

    if (key == proKey){
      System.out.println("Уровень доступа Pro");
      DocumentWorker worker = new ProDocumentWorker();
      worker.saveDocument();
    }
    else if (key == expertKey){
      System.out.println("Уровень доступа Expert");
      DocumentWorker worker = new ExpertDocumentWorker();
      worker.saveDocument();
    }
    else{
      DocumentWorker worker = new DocumentWorker();
      worker.saveDocument();
    }
  }
}

import java.util.Scanner;

public class Java {

      public static void main (String[] args) {

          String name = "Jan";
          String lastname = "van der Henst";
          int leerjaar = 1;
          double getal = 2.2;

          System.out.println(name + " " + lastname);

          System.out.println("Hello Variables");

          Scanner scan = new Scanner(System.in);
          scan.next();
          System.out.print(scan.next());

      }
}

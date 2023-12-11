import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      Triangulo x,y;
      x = new Triangulo();
      y = new Triangulo();

      System.out.println("Digite os lados do triângulo x: ");
      x.setA(scanner.nextDouble());
      x.setB(scanner.nextDouble());
      x.setC(scanner.nextDouble());

      System.out.println("Digite os lados do triângulo y: ");
      y.setA(scanner.nextDouble());
      y.setB(scanner.nextDouble());
      y.setC(scanner.nextDouble());

      double areaX = x.area();
      double areaY = y.area();

      System.out.printf("A área do triângulo x é: %.4f%n",areaX);
      System.out.printf("A área do triângulo y é: %.4f%n",areaY);

      if(areaX > areaY) {
          System.out.println("A área x é maior.");
      } else{
          System.out.println("A área y é maior");
      }

       scanner.close();
    }
}
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class AreaOfCircle {
   public AreaOfCircle() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter radius of circle:");
      double var2 = var1.nextDouble();
      double var4 = Math.PI * var2 * var2;
      System.out.printf("Area of Circle is: %.2f", var4);
      var1.close();
   }
}

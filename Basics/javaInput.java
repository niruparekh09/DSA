import java.util.*;

public class javaInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input cost of pen");
        float pen = sc.nextFloat();
        System.out.println("Input cost of pencil");
        float pencil = sc.nextFloat();
        System.out.println("Input cost of eraser");
        float eraser = sc.nextFloat();
        float total_price = 1.18f * (pen + pencil + eraser);
        System.out.println("Total price wit 18% GST = " + total_price);
    }
}
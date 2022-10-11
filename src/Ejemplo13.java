import java.util.Scanner;
public class Ejemplo13 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        double x, y, z;

        System.out.println("Introduce el primer numero: ");
        x = inputValue.nextInt();

        System.out.println("Introduce el segundo numero: ");
        y = inputValue.nextInt();

        System.out.println("Introduce el tercer numero: ");
        z = inputValue.nextInt();


        inputValue.close();

        if (x>y && x>z) {
            System.out.println("El numero mas grande es: " + x);
        } else if (y>x && y>z) {
            System.out.println("El numero mas grande es: " + y);
        } else if (z>x && z>y) {
            System.out.println("El numero mas grande es: " + z);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao canh thu nhat: ");
        double side1 = scanner.nextDouble();
        System.out.println("Nhap vao canh thu hai: ");
        double side2 = scanner.nextDouble();
        System.out.println("Nhap vao canh thu ba: ");
        double side3 = scanner.nextDouble();
        System.out.println("Mau sac cua tam giac: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        System.out.println(triangle.toString());
    }
}

package TasksLab1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        //-6 -3
        //-6 0
        //-4 0
        //-4 5
        //4 5
        //4 0
        //6 0
        //6 -3
        boolean InRegion = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x and y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ((x <= 6 && x>= -6 && y >= -3 && y <= 0) || (x <= 4 && x>= -4 && y >= 0 && y <= 5)) {
            InRegion = true;
        }
        System.out.println("InRegion = " + InRegion);
    }
}

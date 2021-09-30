package TasksLab1;

public class task1 {
    public static void main(String[] args) {
        double x = 3, y = 7;
        double calculation = ((1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - (2 * x) / (1 + x * x + y * y)))) + x;
        System.out.println("z = " + calculation);
    }
}

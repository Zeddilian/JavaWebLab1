package TasksLab1;

public class task3 {
    public static void main(String[] args) {
        int a = 1, b = 14;
        int h = 3;
        int x;
        System.out.println(" Arg | Value");
        while (a < b){
            x =a;
            double F = Math.tan(x);
            double roundOff = Math.round(F * 100.0) / 100.0;
            System.out.println(x + " | "+ roundOff);
            a+=h;
        }
    }
}

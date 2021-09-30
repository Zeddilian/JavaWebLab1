package TasksLab1;

public class task4 {
    public static void main(String[] args) {
        int[] array = new int[] {2, 4, 7, 21, 13, 87, 77, 11, 19, 15};
        for (int i=0; i < array.length - 1; i++){
            if (IsPrimeNumber(array[i])){
                System.out.println("Simple with index - " + i);
            }
        }
    }

    public static boolean IsPrimeNumber(int n)
    {
        boolean result = true;
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        else {
            result = false;
        }
        return result;
    }
}

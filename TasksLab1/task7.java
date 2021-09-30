package TasksLab1;

public class task7 {
    public static void main(String[] args) {
        int[] array = new int[] {2,7,4,9,2,5,8,2,1};
        Shell(array);
        for (int i=0; i<array.length; i++)
            System.out.print(array[i]+ " ");
    }

    public static void Shell(int[] array){
        int temp, i=0;
        while (i < array.length-1){
            if (array[i] <= array[i+1]) {
                i++;
            } else
            if (array[i] > array[i+1]) {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                if (i != 0)
                    i--;
            }
        }
    }
}

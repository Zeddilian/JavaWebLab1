package TasksLab1;

public class task6 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        for (int i=0; i < array.length; i++){
            for (int j=0; j < array.length; j++){
                System.out.print(array[j] + " ");
            }
            NextLetter(array);
            System.out.println();
        }
    }

    public static void NextLetter(int[] array){
        int temp1;
        for (int i=0; i < array.length-1; i++){
            temp1 = array[i];
            array[i] = array[i+1];
            array[i+1] = temp1;
        }
    }
}

package TasksLab1;

public class task5 {
    public static void main(String[] args) {
        int[][] array = new int [][] {
                {2, 3, 6, 5},
                {1, 9, 17, 12},
                {15, 19, 22, 20},
                {7, 27, 18, 30}};
        int counter = 0;
        int temp = array[0][0];
        for (int i=0; i < 4; i++){
            for (int j=0; j < 4; j++){
                if (temp > array[i][j])
                    counter++;
                else
                    temp = array[i][j];
            }
        }
        System.out.println("Count = " + counter);
    }
}

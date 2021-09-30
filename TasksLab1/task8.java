package TasksLab1;

import jdk.nashorn.internal.runtime.NumberToString;

public class task8 {
    public static void main(String[] args){
        int[] a = new int[] {2,5,6,7,8,13,20};
        int[] b = new int[] {1,3,4,9,11,21};
        String between;
        int m=0, n=0;
        boolean ExitFlag = false;
        while (!ExitFlag) {
            if (m >= b.length) {
                ExitFlag = true;
                break;
            }
            if (b[m] < a[n]) {
                if (n == 0)
                    between = "-eternity";
                else
                    between = Integer.toString(n - 1);
                System.out.println("b[" + m + "] between a[" + between + "] and a[" + n + "]");
                m++;
            }
            else
            if (b[m] >= a[n]) {
                if (n == a.length-1){
                    between = "+eternity";
                    System.out.println("b[" + m + "] between a[" + n + "] and a[" + between + "]");
                    m++;
                }
                else
                    n++;
            }
        }
    }
}

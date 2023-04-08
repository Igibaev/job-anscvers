```java
package test;

public class Task1 {
    private static int[][] matrix = {
            {1, 1, 1, 9, 5},
            {1, 4, 8, 1, 3},
            {1, 7, 2, 1, 4},
            {4, 7, 6, 4, 4},
            {5, 1, 1, 3, 3}
    };

    public static void main(String[] args) {
        int i = 0;
        int j = matrix.length - 1;
        int sum = 0;
        for (int[] x : matrix) {
            if (i == j) {
                sum += x[i];
                System.out.print(i + " | " + x[i] + "    MIDDLE   ");
            } else {
                sum += x[j];
                sum += x[i];
            }
            i++;
            j--;
        }
        System.out.println(sum);
    }
}

```
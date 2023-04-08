```java
package test;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int[] nums = {1,0,1};
        int movedNonZero = 0;
        boolean zeroFound = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroFound = true;
            }
            if (nums[i] != 0) {
                if (zeroFound) {
                    nums[movedNonZero] = nums[i];
                    nums[i] = 0;
                }
                movedNonZero++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

```
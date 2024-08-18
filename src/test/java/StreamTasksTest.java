import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import telran.stram.StreamTasks;

public class StreamTasksTest {

    @Test
    void shuffleTest() {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] actualArr = StreamTasks.shuffle(arr);

        assertFalse(Arrays.equals(arr, actualArr));
        for (int i: actualArr) {
            assertTrue(Arrays.binarySearch(arr, i) >= 0);
        }
    }
}

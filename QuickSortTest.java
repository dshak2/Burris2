import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import java.util.Arrays; // For Arrays.copyOf

public class QuickSortTest {

    private QuickSort sorter;

    @BeforeEach
    public void setUp() {
        sorter = new QuickSort();
    }

    @Test
    public void testSortEmptyArray() {
        int[] inputArray = {};
        int[] expectedArray = {};
        sorter.quickSort(inputArray, 0, inputArray.length - 1);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortSingleElementArray() {
        int[] inputArray = {5};
        int[] expectedArray = {5};
        sorter.quickSort(inputArray, 0, inputArray.length - 1);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortAlreadySortedArray() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        // Make a copy for quickSort to modify, as it sorts in-place
        int[] actualArray = Arrays.copyOf(inputArray, inputArray.length);
        sorter.quickSort(actualArray, 0, actualArray.length - 1);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testSortReverseSortedArray() {
        int[] inputArray = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] actualArray = Arrays.copyOf(inputArray, inputArray.length);
        sorter.quickSort(actualArray, 0, actualArray.length - 1);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testSortArrayWithDuplicateElements() {
        int[] inputArray = {5, 3, 8, 3, 5, 2, 8};
        int[] expectedArray = {2, 3, 3, 5, 5, 8, 8};
        int[] actualArray = Arrays.copyOf(inputArray, inputArray.length);
        sorter.quickSort(actualArray, 0, actualArray.length - 1);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testSortArrayWithNegativeNumbers() {
        int[] inputArray = {-5, -3, -8, -1, -10};
        int[] expectedArray = {-10, -8, -5, -3, -1};
        int[] actualArray = Arrays.copyOf(inputArray, inputArray.length);
        sorter.quickSort(actualArray, 0, actualArray.length - 1);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testSortMixedArray() {
        int[] inputArray = {10, -3, 5, 0, 2, 8, -1, 15, 7, 3};
        int[] expectedArray = {-3, -1, 0, 2, 3, 5, 7, 8, 10, 15};
        int[] actualArray = Arrays.copyOf(inputArray, inputArray.length);
        sorter.quickSort(actualArray, 0, actualArray.length - 1);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testSortArrayWithThirtyElements() {
        int[] inputArray = {10, -3, 5, 2, 8, -1, 0, 15, 7, 3,
                            12, 6, 1, 9, 4, 11, 13, 14, -2, -5,
                            20, 18, 16, 19, 17, 25, 22, 21, 24, 23};
        int[] expectedArray = {-5, -3, -2, -1, 0, 1, 2, 3, 4, 5,
                               6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                               16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        int[] actualArray = Arrays.copyOf(inputArray, inputArray.length);
        sorter.quickSort(actualArray, 0, actualArray.length - 1);
        assertArrayEquals(expectedArray, actualArray);
    }
}

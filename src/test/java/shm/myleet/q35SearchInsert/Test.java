package shm.myleet.q35SearchInsert;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class Test {

    Solution solution = new Solution();

    @Test
    public void test() {
        Assert.assertEquals(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 5), 2);
        Assert.assertEquals(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 2), 1);
        Assert.assertEquals(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 7), 4);
        Assert.assertEquals(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 0), 0);
    }

}

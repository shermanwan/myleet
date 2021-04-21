public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();

         solution.searchInsert(new int[] { 1, 3, 5, 6 }, 5) == 2;
        assert solution.searchInsert(new int[] { 1, 3, 5, 6 }, 2) == 1;
        assert solution.searchInsert(new int[] { 1, 3, 5, 6 }, 7) == 4;
        assert solution.searchInsert(new int[] { 1, 3, 5, 6 }, 0) == 0;
    }

}

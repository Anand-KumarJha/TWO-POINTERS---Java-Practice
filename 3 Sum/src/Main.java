public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSum(new int[]{-1,0,1,2,-1,-4}));

        FastSolution fastSolution = new FastSolution();
        System.out.println(fastSolution.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}

class KthLargest {
    private int kth;
    private List<Integer> list;

    public KthLargest(int k, int[] nums) {
        this.kth = k;
        this.list = new ArrayList<>();
        for(int n: nums)
            this.list.add(n);
    }
    
    public int add(int val) {
        this.list.add(val);
        Collections.sort(list, Comparator.reverseOrder());
        return list.get(this.kth-1);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

// 3 th
// [4, 5, 8, 2] -> [2, 4, 5, 8] -> null
// [2, (3), 4, 5, 8] -> 4
// [2, 3, 4, (5), 5, 8] -> 5
// [2, 3, 4, 5, 5, 8, (10)] -> 5
// [2, 3, 4, 5, 5, 8, (9), 10] -> 8
// [2, 3, 4, (4) 5, 5, 8, 9, 10] -> 8
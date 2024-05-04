class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> intersect = new ArrayList<>();

        if(nums1.length < nums2.length){
            for(int n: nums1){
                list1.add(n);
            }
            for(int n: nums2){
                list2.add(n);
            }
        }else{
            for(int n: nums2){
                list1.add(n);
            }
            for(int n: nums1){
                list2.add(n);
            }
        }

        for(int n: list1){
            for(int i=0; i<list2.size(); i++){
                if(n == list2.get(i)){
                    intersect.add(n);
                    list2.remove(i);
                    break;
                }
            }
        }

        return intersect.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
    }
}
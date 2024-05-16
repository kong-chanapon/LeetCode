class Solution {
    public int maximumProduct(int[] nums) {

        if(nums.length == 3){
            return nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        }

        List<Integer> p = new ArrayList<>();
        List<Integer> m = new ArrayList<>();

        for(int n: nums){
            if(n >= 0){
                p.add(n);
            }else{
                m.add(n);
            }
        }

        if(p.size() == 0 || m.size() == 0){
            Arrays.sort(nums);
            return nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        }

        p.sort((n1, n2) -> Integer.compare(n1, n2));
        m.sort((n1, n2) -> Integer.compare(n1, n2));

        if(p.size() <= 2){
            return m.get(0) * m.get(1) * p.get(p.size()-1);
        }
       
        if(m.size() <= 1){
            return p.get(p.size()-1) * p.get(p.size()-2) * p.get(p.size()-3);
        }

        int pMax = p.get(p.size()-1) * p.get(p.size()-2) * p.get(p.size()-3);
        int mMax = m.get(0) * m.get(1) * p.get(p.size()-1);

        return (int)Math.max(pMax, mMax); 

    }
}

//ex nums = [-100,-3, -2, 1]
//p=[1] m=[-100, -3, -2] -> -3, -100, 1 = 300

//ex nums = [-2, 1, 2, 3]
//p[1, 2, 3] m=[-2] -> 1, 2, 3 = 6

//ex nums[-2, -1, 2, 3]
//p=[2,3] m=[-2, -1] = -1, -2, 3 = 6

///ex nums[-2, -1, 2, 3, 4]
//?

//p < 3 used m[0]*m[1]*max(p)
//m < 2 used p[l-1]*p[l-2]*p[l-1]
//other m>2  p[l-1]*p[l-2]*p[l-3] | p[l-1]*m[0]*m[2]

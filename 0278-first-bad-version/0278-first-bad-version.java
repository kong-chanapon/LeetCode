/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int begin = 0;
        int end = n;

        while(begin <= end){
            int mid = begin + (end - begin) / 2;
            if(isBadVersion(mid) == true && isBadVersion(mid-1)==false){
                return mid;
            }else if(isBadVersion(mid) == false){
                begin = mid+1;
            }
            else{
                end = mid;
            }
        
        }

        return -1;
    }
  
}

// f t t
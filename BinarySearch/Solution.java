/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {

            int right =n;

            int left =1;


            while(left < right ){


                int mid = left + (right - left)/2;

                if(isBadVersion(mid)){
                    right = mid;
                }
                else{
                    left = mid+1;
                }

            }

            return left;
            
        }
    }
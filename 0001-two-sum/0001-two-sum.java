class Solution {

    public int[] twoSum(int[] arr, int target) {

        int i = 0;
        int j = i+1;

        while(i<arr.length-1){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return new int[]{i,j};
            }
            if(j == arr.length-1){
              i++;
                j = i+1;
            }else{
                j++;
            }
        }
      return  new int[]{-1,-1};
    }
}
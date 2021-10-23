package arrays;

public class MaxConsecutiveOnes {

public int findMaxConsecutiveOnes(int[] nums) {
        
        int tempCount=0;
		int maxConsecutiveCount = 0;
		for (int i = 0; i < nums.length - 1; i++)
            
            if(nums[i]==1 && nums[i+1]==1){
                
                if(tempCount==0)
                    tempCount=2;
				else
					tempCount++;
            }else{
                
                if(tempCount>maxConsecutiveCount){
                    maxConsecutiveCount=tempCount;
                    tempCount=0;
                }else{
                    tempCount=0;
                }
                   
            }

		if (tempCount > maxConsecutiveCount)
			maxConsecutiveCount = tempCount;

		return maxConsecutiveCount;
    }

	public static void main(String[] args) {

		int[] nums = { 1, 1, 0, 1, 1, 1 };
		int[] nums1 = { 1, 0, 1, 1, 0, 1 };

		MaxConsecutiveOnes m = new MaxConsecutiveOnes();
		System.out.println(m.findMaxConsecutiveOnes(nums));
		System.out.println(m.findMaxConsecutiveOnes(nums1));

	}

}

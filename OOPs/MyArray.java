package OOPs;
class MyArray{
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 200, 700};
//                    #0  #1  #2.........

//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        nums[1] = 2000;

        for (int item : nums) {
            System.out.println(item);
        }
    }
}

package dsa;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int arr[] = {2,5,3};

        int[] result;
        result = productExceptSelf(arr);
        for(int i:result) {
            System.out.println(i);
        }
    }

    private static int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        left[0] = 1;
        for(int i=1; i<nums.length; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        int[] right = new int[nums.length];
        right[nums.length - 1] = 1;
        for(int j=nums.length-2; j>=0; j--) {
            right[j] = right[j+1] * nums[j+1];
        }

        int[] product = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            product[i] = left[i] * right[i];
        }
        return product;
    }
}

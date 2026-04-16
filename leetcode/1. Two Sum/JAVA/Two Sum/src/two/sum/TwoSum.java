package two.sum;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        
        Solution solucion = new Solution();
        int[] arreglo = {1,2,3,4};
        int[] arreglo2 = solucion.twoSum(arreglo , 7);
        System.out.println(Arrays.toString(arreglo2));
    }
}
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] arregloFinal = new int[2];
            int longitud = nums.length;
            for(int i = 0;i<longitud;i++){
                for(int j = 0;j<longitud;j++){
                    if(i==j){
                        continue;
                    }
                    if(nums[i]+nums[j]==target){
                        arregloFinal[0]=i;
                        arregloFinal[1]=j;
                    }
                }
            }
            return arregloFinal;
        }
    }

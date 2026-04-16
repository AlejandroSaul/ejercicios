/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var longitud = nums.length
    for(var i=0;i<longitud;i++){
        for(var j=0;j<longitud;j++){
            if(i===j){
                continue
            }
            if(nums[i]+nums[j]==target){
                var arreglo= [];
                arreglo[0] = i
                arreglo[1] = j
                return arreglo
            }
        }
    }
};
arreglo = [1,2,3,4]
console.log(twoSum(arreglo,7));

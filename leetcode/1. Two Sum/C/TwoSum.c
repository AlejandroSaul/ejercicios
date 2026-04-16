#include <stdio.h>


int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int* arreglo = (int*)malloc(2 * sizeof(int)); //Reserva memoria dinámica para 2 enteros y guarda la dirección en combinacion.
    for(int i = 0;i<numsSize;i++){
        for(int j = 0;j<numsSize;j++){
            if(i==j){continue;}
            if(nums[i]+nums[j] == target){
                arreglo [0] = i;
                arreglo [1] = j;
                *returnSize = 2; //Asigno el tamaño del arreglo returnSize es un puntero - *returnSize es el valor real al que apunta
                return arreglo;
            }
        }
    }
    *returnSize = 0;
    return arreglo;
}

int main(){
    int nums[] = {2,7,11,15};
    int target = 9;
    int size = sizeof(nums) / sizeof(nums[0]);
    int returnSize;
    int* resultado = twoSum(nums, size, target, &returnSize);//&returnSize direccion de la variable
    printf("[%d, %d]\n",resultado[0],resultado[1]);
    free(resultado);
    return 0;
}

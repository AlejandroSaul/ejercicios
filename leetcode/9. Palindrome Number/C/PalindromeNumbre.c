#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool isPalindrome(int x) {
    char palindromo[50];
    char inverso[50];
    snprintf(palindromo, sizeof(palindromo), "%d", x);
    int aux = 0;
    for(int i = strlen(palindromo)-1;i>=0;i--){
        inverso[aux] = palindromo[i];
        aux++;
    }
    inverso[aux] ='\0';
    if(strcmp(palindromo,inverso)==0){
        return true;
    } else{
        return false;
    }
}

int main(){
    isPalindrome(111);
}

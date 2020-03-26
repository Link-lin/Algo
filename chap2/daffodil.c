#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){

    for(int i =100; i < 1000; ++i){
       int hundred = i/100;
       int ten = (i-hundred*100)/10;
       int one = i-hundred*100 -ten*10;

       if(i == pow(hundred, 3)+ pow(ten, 3) + pow(one,3)){
           printf("%d ", i);
       }
    }
    printf("\n");
}

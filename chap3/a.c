#include <string.h>
#include <stdio.h>
#include <stdlib.h>

int check(int number, int hundred, int ten, int one){

    int arr[10];
    int twice = number*2;
    int triple = number*3;

    arr[0] = hundred;
    arr[1] = ten;
    arr[2] = one;

    int hundred2 = twice/100;
    int ten2 = (twice - hundred2*100)/10;
    int one2 = (twice -hundred2*100-ten2*10);

    arr[3] = hundred2;
    arr[4] = ten2;
    arr[5] = one2;

    int hundred3 = triple/100;
    int ten3 = (triple- hundred3*100)/10;
    int one3 = (triple-hundred3*100-ten3*10);

    arr[6] = hundred3;
    arr[7] = ten3;
    arr[8] = one3;

    for(int i =0; i < 9; ++i){
        printf("array:%d",arr[i]);
    }
    printf("\n");
    int count =0;
    for(int i =0 ; i < 9; ++i){
        for(int j = 0; j< 9; ++j){
            if(arr[i] == arr[j] && (j!=i)){
                //printf("count: %d",count);
                count++;
                return 0;
            }
        }
    }
    return 1;
}

int main(int argc, char ** argv){
    
    int hundred;
    int ten;
    int one;

    for(int i =124; i< 333; ++i){

        hundred = i/100;
        //printf("%d\n", hundred);
        ten = (i - hundred*100)/10;
        //printf("%d\n",ten);
        one = (i-hundred*100-ten*10);
        //printf("%d\n",one);

        if(hundred==ten || hundred == one || ten ==one){
            continue;
        }

        if(check(i, hundred, ten, one) == 1){
            printf("%d\n", i);
        }
    }
    return 0;
}

#include <stdio.h>
#include <stdlib.h>

int main(){

    int a;
    scanf ("%d", &a);

    for(int i =a; i >0; --i){

        for(int x =0; x < 2*(a-i); ++x){
            printf(" ");
        }
        for(int j = 0; j < i*2-1; ++j){
            printf("# ");
        }
        printf("\n");
    }
}

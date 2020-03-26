#include <stdio.h>
#include <stdlib.h>

int main(){
    int n, m;
    scanf("%d %d", &n, &m);

    int numChicken = (4*n-m)/2;
    int numRabbit = (m-2*n)/2;

    if(numChicken < 1 || numRabbit < 1 || m%2 == 1){
        printf("No answer\n");
    }
    else{
        printf("%d %d\n",numChicken, numRabbit);
    }

    return 0;
}

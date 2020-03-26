#include <stdio.h>
#include <stdlib.h>

int main(){
    double n, m;
    while(1){
        scanf("%lf %lf",&n, &m);
        if(m == 0.0 || n == 0.0){
            return 0;
        }
        double total = 0.0;
        while(n <= m){
            total += (1/(n*n));
            n++;
        }
        printf("%.5f", total);
   }
}

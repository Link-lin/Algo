#include <stdio.h>
#include <stdlib.h>

int main(){
    long long a, b;
    int c;

    while((scanf("%lld %lld %d",&a, &b, &c) ==3) && !(a ==0 && b ==0 && c == 0)){
        printf("%lld.", a/b);
        a %= b;
        for(int i =0; i < c; ++i){
            printf("%lld",a*10/b);
            a = a*10%b;
        }

        if(a*10%b*10/b < 5){
            printf("%lld",a*10/b);
        }
        else{
            printf("%lld",a*10/b+1);
        }
    }
}

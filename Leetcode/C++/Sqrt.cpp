#include <iostream>
#include<stdio.h>

using namespace std;

int mySqrt(int x){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int l = 0 , r = x;
    long long m;
    if(x==1) return 1;
    while(1){
        m = (l+r)/2;
        if(m*m <= x && (m+1)*(m+1) > x) return m;
        if(m*m > x) r = m;
        if(m*m < x) r = l;
    }
}

int main(){
    cout << mySqrt(4);
}
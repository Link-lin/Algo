#include <iostream>

int main(){
    
    int a,b,c;

    scanf("%d %d %d", &a, &b, &c);

    for(int i =10; i< 100; ++i){
        if((i%3 == a) && (i%5 ==b) && (i%7 ==c)){
            std::cout << i << std::endl;
            return 0;
        }
    }
    std::cout << "No answer" << std::endl;
    return 0;
}

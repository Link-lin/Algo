#include <iostream>
#include <vector>

using namespace std;

int findLengthOfLCIS(vector<int> &nums){
    int max = 0;
    int temp = 0;
    for(int i =0; i< nums.size(); ++i){
        if(i == 0){
           temp = 1; 
        }
        else if(nums.at(i) >= nums.at(i-1)){
            temp += 1;
        }
        else temp = 1;
        if(temp > max){
            max = temp;
        }
    }
    return max;
}

int main(){
    
}
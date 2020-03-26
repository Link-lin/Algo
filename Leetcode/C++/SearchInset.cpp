#include <iostream>
#include <vector>

using namespace std;

int searchInsert(vector<int> &nums, int target) {
    vector<int>::iterator it;
    int place = 0;
    for(it = nums.begin(); it != nums.end(); it++){
        if(target <= *it){
            break;
        }
        place++;
    }

    return place;
}

int main(){

}
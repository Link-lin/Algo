#include <iostream>
#include <vector>

using namespace std;

int removeDuplicates(vector<int> &nums){
    vector<int>::iterator it;
    int cur;
    int count = 0;
    for(it = nums.begin(); it!=nums.end(); it++){
        if(it == nums.begin()){
            cur = *it;
            count += 1;
            continue;
        }
        else{
            if(*it != cur){
                count ++;
                cur = *it;
                nums.erase(it);
            }
            else{
                nums.erase(it);
            }
        }
    }
    return count;
}

int main(){
    vector<int> vec;
    vec.push_back(0);
    vec.push_back(0);
    vec.push_back(1);
    vec.push_back(1);
    vec.push_back(2);
    vec.push_back(2);
   
    removeDuplicates(vec);
    for(auto it = vec.begin(); it != vec.end(); it++){
        cout << *it << endl;
    }
}
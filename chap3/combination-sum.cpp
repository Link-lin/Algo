#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:

    vector<vector<int> > n;
    vector<int> candidate;
    int target;

    int recur(int sum, int pos){
        if(sum == target){
             
        }
    }
    
    vector<vector<int> > combinationSum(vector<int>& candidates, int target) {
        n.resize(100);
        for (int i = 0; i < 100; ++i)
        n[i].resize(100);

        recur(0);
        return n;
    }


};

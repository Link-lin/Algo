#include <iostream>
#include <string>
#include <vector>

using namespace std;

string longest(vector<string>& strs){
    int n = strs.size();
    string res = "";
    if(n == 0) {
        return "";
    }

    for(int i = 0; i< strs[0].length(); ++i){
        for(int j = 0; j < n; j++){
            if(i>strs[j].size() ||strs[0][i] !=strs[j][i]){
                return res;
            }
        }
        res += strs[0][i];
    }
    return res;
}



int main(){

}
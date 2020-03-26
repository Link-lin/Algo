#include <iostream>

using namespace std;

int lengthOfLongestSubstring(string s) {
   int index = 0, max =0, test =0;
    string n;   
    if(s == " ") return 1;
    else if(s.size() == 0){
        return 0;
    }
    while(index != s.size()){        
        char ch_test = s.at(index);
        if(n.find(ch_test) == -1){
            n = n + ch_test;
            test++;
            if(test > max) max = test;
        }
        else{
            int in = n.find_first_of(ch_test);
            n = n.erase(0,(in+1));
            n = n + s.at(index);
            test -= in; 
            cout << n << endl;
        }
        index++;
    }
    
    return max;
}

int main(){
    cout << lengthOfLongestSubstring("dvdf");
    return 0;
    string a = "a a";
    //cout << a.size() << endl;
}

#include <iostream>
#include <string>

using namespace std;

int LengthOfLastWord(string s){
    int count = 0;
    int endspace = 0;
     for(auto i = s.end()-1; i != s.begin()-1; i--){
            if(*i == ' ') endspace ++;
            else break;
     }
     s.erase(s.end()-endspace, s.end());
    for(auto i = s.end()-1; i != s.begin()-1; i --){
        cout << *i;
        if(*i == ' ') break;
        count ++;
    }
    return count;
}

int main(){
    cout << LengthOfLastWord("hello World    ");

}
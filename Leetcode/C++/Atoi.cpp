#include <iostream>
#include <string>

using namespace std;

int myCharAtoi(char c){
    char x = '0';
    int i =0;
    while(x != c){
        i++;
        x++;
    }
    return i;
}

int myAtoi(string str){
    long long value = 0;
    bool positive = true, f_time = true;
    if(str.find_first_not_of(' ') == str.npos) return 0;

    string::iterator it; 
    for(it = str.begin(); it != str.end(); ++it){
        char c = *it;
        if(c == ' ' && f_time) continue;
        else if(c == ' '&& !f_time){
            break;
        }

        if(f_time){
            if(c == '-'){
                positive = false;
                continue;
            } 
            else if (c == '+'){
                f_time = false;
                continue;
            }
            f_time = false;
        }
        if(isdigit(c)){
            value = value *10 + myCharAtoi(c);
        }
        else{
            break;
        }
        if(value > 2147483647) break;
    }

    if(!positive) value = -value;
    // 2^31, boundary case 
    if(value > 2147483647) value = 2147483647;
    if(value < -2147483648) value = -2147483648; 
    return value;
}

int main(){
    int x = myAtoi("0-1");
    cout << x;
    return 0;
}
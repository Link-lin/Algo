#include <iostream>
#include <string>

using namespace std;


string addBinary(string a, string b){
    string binary;
    int carry = 0;
    int a_pos = a.size()-1;
    int b_pos = b.size()-1;
    int _a , _b;
    int sum = 0;
    while(a_pos >= 0 || b_pos >= 0){
        if(a_pos < 0){
            _a = 0;
        }
        else{
            /*
            char x = a.at(a_pos);
            if(x == '1')
                _a = 1;
            else 
                _a = 0;

            cout << a.at(a_pos) << endl;
            */
           _a = a.at(a_pos) == '1' ? 1 : 0;
        }

        if(b_pos < 0){
            _b =0;
        }
        else{
             char y = b.at(b_pos);
            if(y == '1')
                _b = 1;
            else 
                _b = 0;
        }
        sum = _a + _b + carry; 
        if(sum >=2){
            carry = 1;
            if(sum == 3){
                binary.insert(0, "1");
            }
            else{
                binary.insert(0, "0");
            }
        }
        else{
            if(sum == 1){
                binary.insert(0, "1");
            }
            if(sum == 0){
                binary.insert(0, "0");
            }
            carry = 0;
        }
        a_pos--;
        b_pos--;
    }
    if(carry != 0) 
        binary.insert(0, "1");
    return binary;
}



int main(){
    string a = "11";
    string b = "1";
    cout << addBinary(a,b);
}
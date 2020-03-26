#include <iostream>
#include <string>
#include <stack>
using namespace std;

bool isvalid(string s){
    stack<char> b;
    char x; 
    // Traversing the Expression 
    for (int i=0; i<s.length(); i++) 
    { 
        if (s[i]=='('||s[i]=='['||s[i]=='{') 
        { 
            // Push the element in the stack 
            b.push(s[i]); 
            continue; 
        } 
        // IF current current character is not opening 
        // bracket, then it must be closing. So stack 
        // cannot be empty at this point. 
        if (b.empty()) 
           return false; 
        switch (s[i]) 
        { 
        case ')': 
            // Store the top element in a 
            x = b.top(); 
            b.pop(); 
            if (x=='{' || x=='[') 
                return false; 
            break; 
        case '}': 
            // Store the top element in b 
            x = b.top(); 
            b.pop(); 
            if (x=='(' || x=='[') 
                return false; 
            break; 
        case ']': 
            // Store the top element in c 
            x = b.top(); 
            b.pop(); 
            if (x =='(' || x == '{') 
                return false; 
            break; 
        } 
    } 
    // Check Empty Stack 
    return (b.empty()); 
}



int main(){
    cout << isvalid("(({}))");
}
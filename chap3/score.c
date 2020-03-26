#include <stdio.h>
#include <stdlib.h>


int process(char* line){
    int i = 0;
    int score = 0;
    int count = 1;
    while(line[i] != '\0'){
        if(line[i] == 'X'){
            count = 1;
        }
        else if(line[i] == 'O'){
            score += count;
            count++;
        }
        i++;
    }
    return score;
}

int main(){
    int numCase;
    scanf("%d", &numCase);

    for(int i =0; i < numCase; i ++){
        char currLine[80];
        scanf("%s", currLine);
        int score = process(currLine);
        printf("%d\n", score);
    }

}

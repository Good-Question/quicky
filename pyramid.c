#include <stdio.h>

int main(void){

    int rows,spaces;
    char asc,desc,input;
    
    printf("Please enter an uppercase letter: "); 
    scanf("%c", &input); 
    
    for (rows = 'A'; rows <= input; rows++)
    {
        for (spaces = input; spaces > rows; spaces--) 
        {
            printf(" ");
        }
        for (asc = 'A'; asc <= rows; asc++)
        {
            printf("%c", asc);
        }
        for (desc = asc - 2; desc >= 'A'; desc--) 
        {
            printf("%c", desc);
        }
        printf("\n");
    }
    return 0;
}

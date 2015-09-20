#include <cs50.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

int main(int argc, string argv[])
{
    int encrypted;
    
    if (argc != 2)
    {
        printf("Invalid Key!\n");
        return 1;
    }
    
    string key = argv[1];
    
    for (int i = 0, n  = strlen(key); i < n;  i++)
    {
        if (isalpha(key[i]) == false)
        {
            printf("Invalid Key!\n");
            return 1;
        }
    }
    
    printf("Please enter a phrase to be encoded: \n");
    string plaintxt = GetString();
    
    for (int i = 0, ptlen = strlen(plaintxt), ctlen = strlen(key), index = 0; i < ptlen; i++)
    {
        if (isalpha(plaintxt[i]))
        {
            if (isupper(plaintxt[i]))
            {
                encrypted = ((((plaintxt[i] - 'A') + ((toupper(key[index % ctlen])) - 'A')) % 26)  + 'A');
                printf("%c", encrypted);
            }
            else if (islower(plaintxt[i]))
            {
                encrypted = ((((plaintxt[i] - 'a') + ((tolower(key[index % ctlen])) - 'a')) % 26)  + 'a');
                printf("%c", encrypted);
            }
            index++;
        }
        else
        {
            printf("%c", plaintxt[i]);
        }
    }
    printf("\n");
}

#include <stdlib.h>
#include <stdio.h>

#define NUM 7

void get_unique(int[10], int[NUM]);

int main(){
	int int_arr[10] = {1,2,3,3,4,5,5,6,7,8};
	int ret_arr[NUM] = {0};
	get_unique(int_arr, ret_arr);
	for(int i = 0; i < 10; i++)
		printf("%d ", int_arr[i]);
	printf("\n");
	for(int i = 0; i < NUM; i++)
		printf("%d ", ret_arr[i]);
	printf("\n");
}

void get_unique(int int_arr[10], int ret_arr[NUM]){
	int i, j;
	for(i = 0; i < 10; i++){
		int pass = 0;
		for(j = 0; j < NUM; j++){
			if(ret_arr[j] == 0){
				break; //A number hasn't been put here
			}
			if(ret_arr[j] == int_arr[i]){
				pass++;
				break; //A number has been put here but it's the same as the one we're looking at (we can move onto the next)
			}
			else
				continue; //A number has been put here and we haven't seen it yet
		}
		if(pass)
			continue;
		ret_arr[j] = int_arr[i];
	}
}

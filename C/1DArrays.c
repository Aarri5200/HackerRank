#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int size,sum=0;
    scanf("%d\n", &size);
    int arr[size];
    for(int i=0;i<size;i++){
        scanf("%d\n", &arr[i]);
    }
    for(int i=0;i<size;i++){
        sum=sum+arr[i];
    }
    printf("%d", sum);    
    return 0;
}

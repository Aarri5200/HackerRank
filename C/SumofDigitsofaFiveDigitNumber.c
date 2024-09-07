#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.
    int a = n%10;
    int b=n/10;
    int c = b%10;
    int d=n/100;
    int e = d%10;
    int f=n/1000;
    int g = f%10;
    int h = n/10000;
    int sum = a+c+e+g+h;
    printf("%d\n", sum);
    return 0;
}

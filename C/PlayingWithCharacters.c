#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
int temp;
 char ch;
 char str[20];
 char sentence[100];
 scanf("%c", &ch);
 scanf("%s", &str);
  scanf("%c",&temp); // temp statement to clear buffer
    fgets(sentence,100,stdin);
 printf("%c\n", ch);
  printf("%s\n", str);
  printf("%s\n", sentence);
 
    return 0;
}

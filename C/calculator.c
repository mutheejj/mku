#include<stdio.h>
#include "main.h"
#include<math.h>
#include<strings.h>

int sum()
{   int x;
    int y;

    printf("enter the values: \n");
    scanf("%d", &y);
    scanf("%d", &x);
    return (x + y);
}

int sub()
{
    int x;
    int y;

    printf("enter the values: \n");
    scanf("%d", &y);
    scanf("%d", &x);
    return (x - y);

}

int mult()
{
    int x;
    int y;

    printf("enter the values: \n");
    scanf("%d", &y);
    scanf("%d", &x);
    return (x * y);
    

}

float divide()
{
    int x;
    int y;
    printf("enter the values: \n");
    scanf("%d", &y);
    scanf("%d", &x);
    return (y / x);

}

int main(void)
{
    int choose;

    printf(RED"what do you want me to evaluate:...\n 1) sum \n 2) diffrence \n 3) division \n 4) multiplication \n 5) subtraction \n"RED);
    scanf("%d", &choose);

    if (choose == 1)
        {
            int result = sum();
            printf("%d", result);
        }

    else if (choose == 2)
    {
        int result = sub();
        printf("%d", result);
    }
    else if (choose == 3)
    {
        float result = divide();
        printf("%f", result);        

    }
    else if (choose == 4)
    {
        int result = mult();
        printf("%d", result);

    }
    else if (choose == 5)
    {
        int result = sub();
        printf("%d", result);
    }
    else
    {
        printf("invalid option");
    }
    printf("\n");

    return (0);

}
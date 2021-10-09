#include <stdio.h>
int main()
{
    int num, i, choice, pos, new,j;
    printf("Enter number of elements in array:");
    scanf("%d", &num);

    int arr[num];

    printf("Enter elements:");
    for (i = 0; i < num; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("\n\n****************************MENU**********************************\n") 
    printf("ENTER:\n");
    printf("1-INSERT\n");
    printf("2-DELETE\n");
    printf("3-TRAVERSE\n");
    printf("4-SEARCH\n");

    scanf("%d", &choice);
    switch (choice)
    {
    case 1:
        printf("\nEnter position of element :");
        scanf("%d", &pos);

        printf("\nEnter new element :");
        scanf("%d", &new);

        if (pos > num)
            printf("\ninvalid input");
        else
        {
            for (i = num; i > pos - 2; i--)
            {
                arr[i + 1] = arr[i];
            }
            arr[pos - 1] = new;
        }
        printf("\nthe new array is:\t");
        for (i = 0; i < num + 1; i++)
        {
            printf("\t%d", arr[i]);
        }

    case 2:
    {
        printf("\nEnter position of element to be deleted:");
        scanf("%d", &pos);

        if (pos > num)
            printf("\ninvalid input");
        else
        {
            for (i = pos - 1; i < num - 1; i++)
            {
                arr[i] = arr[i + 1];
            }
            printf("\nModified array is:\t");
            for (i = 0; i < num - 1; i++)
            {
                printf("\t%d", arr[i]);
            }
        }
    }

    break;

    case 3:
    {
        printf("\narray:");
        for (i = 0; i < num; i++)
        {
            printf("\t%d", arr[i]);
        }
    }
        break;

    case 4:
   
        break;
    default:
    printf("INVALID OPTION");
        break;
    }
    }
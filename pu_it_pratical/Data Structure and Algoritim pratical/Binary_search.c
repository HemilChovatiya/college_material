#include <stdio.h>
int main()
{
    int i, a[10], n, key;
    printf("Enter Size of array:");
    scanf("%d", &n);
    printf("Enter array:");
    for (i = 0; i < n; i++)
    {

        scanf("%d", &a[i]);
    }
    printf("Enter Key Value:");
    scanf("%d", &key);

    int low = 0, high = n, mid;
    while (low <= high)
    {
        mid = (low + high) / 2;
        if (a[mid] == key)
        {
            printf("Element %d found at location %d", key, mid);
            break;
        }
        else if (a[mid] < key)
        {
            low = mid + 1;
        }
        else if (key < a[mid])
            ;
        high = mid - 1;

        mid = (low + high) / 2;
    }
    if (low > high)
    {
        printf("Element not found");
    }
    return 0;
}

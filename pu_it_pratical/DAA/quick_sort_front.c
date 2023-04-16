#include <stdio.h>
void quicksort(int num[], int front, int l)
{
	int i, j, pivot, temp;
	if (front < l)
	{
		pivot = front;
		i = front;
		j = l;
		while (i < j)
		{
			while (num[i] <= num[pivot] && i < l)
				i++;
			while (num[j] > num[pivot])
				j--;
			if (i < j)
			{
				temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}

		temp = num[pivot];
		num[pivot] = num[j];
		num[j] = temp;
		quicksort(num, front, j - 1);
		quicksort(num, j + 1, l);
	}
}

int main()
{  
	int i, count;
	printf("Enter element Size:");
	scanf("%d", &count);
	int num[count];
	printf("Enter %d elements:", count);
	for (i = 0; i < count; i++)
	{
		scanf("%d", &num[i]);
	}
	quicksort(num, 0, count - 1);
	printf("Sorted elements:");
	for (i = 0; i < count; i++)
	{
		printf("%d\t", num[i]);
	}
	return 0;
}

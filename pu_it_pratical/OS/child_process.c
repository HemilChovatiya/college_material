#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
void fork()
{
	printf("Hello world!\n");
}
int main()
{

	
	fork();

	printf("Hello world!\n");
	return 0;
}

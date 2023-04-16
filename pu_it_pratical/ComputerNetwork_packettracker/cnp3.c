#include <stdio.h>
#include <conio.h>
void main()
{
 int i,f[20],n[50],div[50],j,t,quo[20],z[10];
 printf("Entre the number\n");
 for(i=0;i<8;i++)
 {
 scanf("%d",&n[i]);
 }
 printf("Enter the d\n");
 for(i=0;i<4;i++)
 {
 scanf("%d",&div[i]);
 }
 for(i=8;i<12;i++)
 {
 n[i]=0;
 }
 for(i=0;i<8;i++)
 {
 if(n[i]==1)
 {
 for(j=0;j<4;j++)
 {
 if(n[t]==div[j])
 {
 n[t]=0;
 f[j]=0;
 }
 else
 {
 n[t]=1;
 f[j]=1;
 }
 t=t+1;
 }
 quo[i]=1;
 }
 else
 quo[i]=0;
 }
 printf("\nthe quotient is\n");
 for(i=0;i<8;i++)
 printf("%d",quo[i]);
 printf("\n the remainder is\n");
 for(j=0;j<4;j++)
 printf("%d",f[j]);
 getch();
}
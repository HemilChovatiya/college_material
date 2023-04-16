#include<stdio.h>

int main(){
	double double int num,r,a[11]={ 0,0,0,0,0,0,0,0,0,0,0 };
	scanf("%lld", &num);
	while(num>0)
{	r=num%10;
    num=num/10;
	
   if (r==0)
   {
	   a[r]++;
   }
   if (r==1)
   {
	   a[r]++;
   }if (r==2)
   {
	   a[r]++;
   }if (r==3)
   {
	  a[r]++;
   }if (r==4)
   {
	   a[r]++;
   }if (r==5)
   {
	   a[r]++;
   }if (r==6)
   {
	  a[r]++;
   }if (r==7)
   {
	   a[r]++;
   }if (r==8)
   {
	   a[r]++;
   }if (r==9)
   {
	   a[r]++;
	   }

}
for(int i=0;i<=9;i++)
{
	printf("%d %lld\n",i,a[i]);
}

return 0;
}


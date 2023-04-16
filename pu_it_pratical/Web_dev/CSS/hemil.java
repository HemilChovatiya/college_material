import java.util.*;
class hemil{
    public static void main(String args[])
    {   
        int a;
        a=1;
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        while(a>=1)
        {
        System.out.println(a+"H"+(a+1)+"e"+(a-2)+"m"+(a+2)+"i"+(a+4)+"l");
        a--;
        }
    }
}
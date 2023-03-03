import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the arrey value");
        int a[]=new int[5];
        int ele,i;
        boolean result=false;
        for( i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("array elements");
        for(i;a)
            {
                System.out.print(i+" ");
            }
            for(i=0;i<=a.length-1;i++)
            {
                if(ele==a[i])
                {
                    result=true;
                    break;
                }
            }
            if(result==true)
            {
                System.out.println("\n is element found in array"+(i+1));
            }
            else
            {
                System.out.println("\n is element not-found in array");
            }
    }
}

import java.util.Scanner;

public class moArray {
    public int Array(int a[],int n,int b){
        int sum=0;int power=1;
        for(int i=n-1;i>=0;i--){
            sum+=(a[i]*power)%b;
            power*=10;

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter b");
       int b=sc.nextInt();
        System.out.println("Enter "+n+" values");
       for(int i=0;i<n;i++){

          a[i]=sc.nextInt();

       }
       // System.out.println();
       moArray value=new moArray();
        System.out.println(value.Array(a,n,b));


    }
}
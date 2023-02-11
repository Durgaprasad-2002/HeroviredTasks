import java.util.Scanner;
class taskp1{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Size of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
\\1 2 4 6
        System.out.printf("Missing Elements in array are : ");
        for (int i=1;i<=arr[n-1];i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if (i==arr[j]) flag=1;
            }
            if (flag==0) System.out.printf(i+" ");
        }
    }
}
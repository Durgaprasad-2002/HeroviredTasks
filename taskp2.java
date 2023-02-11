import java.util.Scanner;
import java.util.Arrays;
class taskp2{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int n;
        n=sc.nextInt();
        System.out.println("Enter Array Elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.printf("Unique Elemtents in Array : ");
        for(int i=0;i<n;i++){
            if (arr[i]!=-1){
                for(int j=i;j<n;j++){
                    if (i!=j && arr[i]==arr[j]) arr[j]=-1;
                }
                System.out.printf(arr[i]+" ");
            }
        }
    }
}
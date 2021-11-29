import java.util.*;
public class oneWithAllCandy {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int c=0;
            int flag=0;
            while(flag==0){
                for(int i=arr.length-1;i>=0;i--){
                    if(arr[i]>0){
                        c+=1;
                        arr[i]=arr[i]-1;
                    }
                    else{
                        flag=1;
                        break;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
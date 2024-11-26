
import java.util.Scanner;
public class Main
{
    public static void binarySearch(int arr[], int ele){
        int low=0,high=arr.length-1;
        boolean found=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==ele){
                System.out.println(ele+" "+"is found at"+" "+mid);
                found=true;
                break;
            }
            else if(arr[mid]<ele){ //if condition is true then element must be in right handed side else left handed side
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(!found){
          System.out.println(ele+" "+"Element is Not Found");  
        }
    }
	public static void main(String[] args) {
	    int arr[]={11,22,33,44,55,66,77,88,99}; //array must be in sorted order while applying binary Searrch algorithm
	    Scanner sc= new Scanner(System.in);
	    int Element=sc.nextInt();
		binarySearch(arr,Element);
	}
}
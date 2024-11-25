import java.util.Scanner;
public class Main
{
    public static void linearsearch(int arr[], int ele){
        boolean found=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                System.out.println("Element Found at"+" "+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
        
        
    }
	public static void main(String[] args) {
		int arr[]={11,22,33,44,55};
		Scanner sc= new Scanner(System.in);
		int element= sc.nextInt();
		linearsearch(arr,element);
	}
}
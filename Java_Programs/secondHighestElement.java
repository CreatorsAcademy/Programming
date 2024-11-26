
import java.util.Scanner;
public class Main
{
    public static void secondHighestElement(int arr[]){
        int max=arr[0],secmax=arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(secmax<arr[i] && max!=arr[i]){
                secmax=arr[i];
            }
        }
        System.out.println(secmax);
        
       
    }
	public static void main(String[] args) {
	    int arr[]={10,90,70,40,20,60,80,30,50}; 
	    secondHighestElement(arr);
	}
}
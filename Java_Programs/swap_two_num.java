import java.util.Scanner;
public class Main
{
    public static void swap(int a, int b){
    
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" "+"b="+b);
        
    }
    public static void swapThirdVariable(int a, int b){
    
       int temp=a;
            a=b;
            b=temp;
        System.out.println("with using Third variable a="+a+" "+"b="+b);
        
    }
	public static void main(String[] args) {
	    
	    Scanner sc= new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
		swap(a,b);
		swapThirdVariable(a,b);
	}
}
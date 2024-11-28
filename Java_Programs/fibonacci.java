
import java.util.Scanner;
public class Main
{
    public static void fiboacci(int num){
        int n1=0,n2=1,n3;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2; i<num; i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
        
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
		fiboacci(num);
	}
}
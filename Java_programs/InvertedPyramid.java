class Pyramid{
    void InvertedPyramid(int rows){
        for(int i=rows; i>=1; i--){
		    for(int j=1; j<=rows-i; j++){
		        System.out.print(" ");
		    }
		    
		    for(int k=1; k<=(i*2-1); k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
    }
}

public class Main
{
	public static void main(String[] args) {
		 Pyramid p= new Pyramid();
		 p.InvertedPyramid(5);
		
		
	}
}
import java.util.Scanner;

class AtCode{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine()); 
        int questions = Integer.parseInt(scanner.nextLine()); 
        int v = 1;
        
        for (int first= v; first< students ;first++ ){
        	for (int second= first+1; second< students ;second++ ){
            	System.out.print(111);
            }
        }
    }
}
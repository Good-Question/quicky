import java.util.Scanner;

public class InputDriver{

   public static int fact(int n){
      int m = n;
      if(n == 1)
         return m;
      else
         return (m * fact(n-1));
   }
   
   public static void introduction(){
      System.out.println("Combinations Simulator");
      System.out.println("by: Christopher Berry");
      System.out.println("Out of x how many combinations of \ny can be made?");
   }
   
   public static int[] showProblem(){
      int n = (int)(Math.random()*10)+3;
      int r = (int)(Math.random()*n)+1;
      System.out.println("Number of elements in the set: " + n);
      System.out.println("Number of elements to choose from the set: " + r);
      int[] nAndR = new int[] {n, r};
      return nAndR;
   }
   
   public static int getData(){
      Scanner scan = new Scanner(System.in);
      System.out.print("How many ways can you choose? ");
      String input = scan.next();
      for(int i = 0; i < input.length(); i++){
         if(!Character.isDigit(input.charAt(i))){
            System.out.println("Only numbers are accepted.");
            return getData();
         }
      }
      int ans = Integer.parseInt(input);
      return ans;
   }
   
   public static int doCalculations(int[] nr){
      int result;
      int n = nr[0];
      int r = nr[1];
      int nFact = fact(n);
      int rFact = fact(r);
      int nrFact = fact(n-r);
      result = nFact/nrFact;
      return result;
   }
   
   public static void showResult(int n, int r, int ans, int result){
      System.out.println("There are " + result + "combinations of " + r + " items from a set of " + n + ".");
      if(result == ans)
         System.out.println("You are correct.");
      else
         System.out.println("You are incorrect.");
   }

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      char cont = 'y';
      while(cont == 'y'){
         introduction();
         int[] nr = showProblem();
         int ans = getData();
         int result = doCalculations(nr);
         showResult(nr[0], nr[1], ans, result);
         System.out.print("Another problem? (y/n): ");
         String s = scan.next();
         cont = s.charAt(0);
         System.out.println(cont);
         while(cont != 'y' && cont != 'n'){
            System.out.print("Invalid input. ");
            System.out.println("Another problem? (y/n): ");
            s = scan.next();
            cont = s.charAt(0);
         }
      }
   }
}
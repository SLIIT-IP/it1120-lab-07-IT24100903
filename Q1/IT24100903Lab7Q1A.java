import java.util.Scanner;

public class IT24100903Lab7Q1A
{

   public static void main(String[]args)
   {

         Scanner input=new Scanner(System.in);
		 
		 int marks[]=new int[4];
		 double avg;
		 String grade;
		 int sum=0;
		 int count=0;
		 
		 System.out.println("Enter marks for four subjects:");
		 
		 while(count<4)
		 {  
	          count++;
		      System.out.print("Enter Subject Mark "+count+": ");
			  count-=1;
		      marks[count]=input.nextInt();
		      sum=sum+marks[count];
		      count+=1;
		 }
		 
		
		 avg=sum/4.0;
		
		 if(avg>75)
		 {
			 grade="Distinction";
		 }
		 else if(avg>50)
		 {
			 grade="Credit";
		 }
		 else
		 {
			 grade="Fail";
		 }
		 
		 System.out.println("Average is : "+avg);
		 System.out.println("Overall Grade is : "+grade);
		 
   }
}   
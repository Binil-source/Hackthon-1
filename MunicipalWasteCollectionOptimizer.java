import java.util.Scanner;
public class MunicipalWasteCollectionOptimizer{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
  System.out.println("enter the Vehicle number ");
 int vehiclenumber = scanner.nextInt();
System.out.println("enter the waste collected in kg");
double wastecollected = scanner.nextDouble();
System.out.println("enter the collection points ");
int points = scanner.nextInt();
System.out.println("enter vehicle status");
char vehiclestatus = scanner.next().charAt(0); 
}
}
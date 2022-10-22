import java.util.Scanner;

public class Practice1{
    public static void main( String[] args){
        
        Scanner obj= new Scanner(System.in);

        System.out.println("ENTER NAME, AGE, SALARY");

        String name=obj.nextLine();

        int age= obj.nextInt();

        double salary= obj.nextDouble();

        System.out.println("NAME: "+ name);

        System.out.println("AGE: " + age);

        System.out.println("SALARY: "+ salary);

    }







}
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
    
    function getSecondLargest(nums) {
  // Sort the array in descending order
  nums.sort((a, b) => b - a);

  // Traverse the sorted array and return the second element
  for (let i = 1; i < nums.length; i++) {
    if (nums[i] !== nums[0]) {
      return nums[i];
    }
  }

  // If there is no second largest element, return null
  return null;
}

}

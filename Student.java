import java.util.Scanner;
class Student{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects = ");
        int n = sc.nextInt();
        int[] subject = new int[n];
        int count = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            System.out.println("Enter subject "+(i+1)+" marks");
            subject[i] = sc.nextInt();
            sum += subject[i];
            count++;
        }
        double average = (double)sum/count;
        System.out.println("Total Marks = "+sum);
        System.out.println("Average Percentage = "+average);
        if(average>=90){
            System.out.println("Grade = A");
        }
        else if(average>=80){
            System.out.println("Grade = B");
        }
        else if(average>=70)
        {
            System.out.println("Grade = C");
        }
        else if(average>=60){
            System.out.println("Grade = D");
        }
        else
            System.out.println("Grade = F");
        sc.close();

    }
}
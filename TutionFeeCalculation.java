
import java.util.Scanner;

public class TutionFeeCalculation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student grade:");
        int grade = input.nextInt();
        System.out.println("Enter base tuition fee:");
        int tuitionfee = input.nextInt();
        System.out.println("Is the student topper(yes/no): ");
        String topper=input.next();
        boolean isTopper = topper.equalsIgnoreCase("yes");
        double discount=0;
        if((grade>=9)&&(grade<=12)){
            if(isTopper){
                discount=20;
            }
            else{
                discount=10;
            }
        }
        else if ((grade>=6)&&(grade<=8)) {
           discount=5; 
        }
        else{
            discount=0;
        }
        if (grade==10){
            discount+=3;
        }       
        if(grade==12){
            discount+=5;
        }
        double discountAmount=(discount/100) * tuitionfee;
        double finalfee= tuitionfee-discountAmount;     
        System.out.println("Student's grade level: " +grade);
        System.out.println("Base Tuition fee: " +tuitionfee);
        System.out.println("Discount percentage: "+discount+"%");
        System.out.println("Discount amount: "+discountAmount);
        System.out.println("final fee: "+finalfee);
    }
}
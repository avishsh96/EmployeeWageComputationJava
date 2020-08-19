import java.util.Scanner;

public class EmpWageComputationMultipleCompany {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Welcome to employee wage computation for multiple comapnies");
        while (flag == true) {
            System.out.println("\nEnter 1 to calculate wage for a company, 0 to exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting....");
                    flag=false;
                    break;
                case 1:
                    menu();
                    break;
                default:
                    System.out.println("Wrong Choice Retry");
            }
        }


    }
    public static void menu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter company name");
        String cmpy = scanner.nextLine();
        System.out.println("Please Enter Employee Rate per Hour");
        int emprateHr = scanner.nextInt();
        System.out.println("Please Enter Number of Working days");
        int numofWorkingDays = scanner.nextInt();
        System.out.println("Please Enter Max Hours");
        int maxHours = scanner.nextInt();
        calculateWage(cmpy, emprateHr, numofWorkingDays, maxHours);
    }

    public static void calculateWage(String comapny, int empratePerHour, int numofWorkingDays,
                                     int maxHours) {
        int empHrs;
        int hrs = 0;
        int totalWorkingDays = 0;

        while (hrs < maxHours && totalWorkingDays < numofWorkingDays) {
            totalWorkingDays++;
            int randomCheck = (int) (Math.random() * 10) % 3;
            //System.out.println(randomCheck);
            switch (randomCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            hrs += empHrs;
            System.out.println("empHours:" + empHrs);
        }
        int totalEmpWage = hrs * empratePerHour;
        System.out.println("Total Hours: " + hrs);

        System.out.println("Total wage for: " + comapny + " " + totalEmpWage);
    }

}

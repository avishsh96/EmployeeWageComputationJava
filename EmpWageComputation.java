//PROCEDURAL PROGRAMMING

public class EmpWageComputation{
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int EMP_WAGE_PER_HOUR=20;
    public static final int NUMBER_WORKING_DAYS=20;

    public static void main(String[] args){
        int empHrs;
        int empWage;
        int totalEmpWage=0;
        int totalMaxEmpHrs=100;
        int hrs=0;
        int totalWorkingDays=0;

        while (hrs<totalMaxEmpHrs && totalWorkingDays<NUMBER_WORKING_DAYS){
            totalWorkingDays++;
            int randomCheck = (int) (Math.random() * 10) % 3;
            System.out.println(randomCheck);
            switch (randomCheck){
                case IS_FULL_TIME:
                    System.out.println("Fulltime");
                    empHrs=8;
                    break;
                case IS_PART_TIME:
                    System.out.println("PartTime");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Absent");
                    empHrs=0;
            }
            hrs+=empHrs;
            empWage = empHrs * EMP_WAGE_PER_HOUR;
            totalEmpWage+=empWage;
            System.out.println("Employee Wage: " + empWage);
        }
        System.out.println("Total Wage: "+totalEmpWage);


    }
}

public class EmpWageComputation{
	public static final int IS_FULL_TIME=1;
    	public static final int IS_PART_TIME=2;
    	public static final int EMP_WAGE_PER_HOUR=20;
	
	public static void main(String[] args){
	int empHrs;
        int empWage;
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
            empWage = empHrs * EMP_WAGE_PER_HOUR;
            System.out.println("Employee Wage: " + empWage);

	}
}

public class EmpWageComputation{
	public static final int IS_FULL_TIME=1;
	public static final int EMP_WAGE_PER_HOUR=20;

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation on master branch");
		int empHrs;
        	int randomCheck= (int) (Math.random()*10)%2;
        	System.out.println(randomCheck);
        	if (randomCheck==IS_FULL_TIME) {
            	System.out.println("Present");
            	empHrs = 8;
            	System.out.println("Employee Wage: "+empHrs*EMP_WAGE_PER_HOUR);
        	}
        	else System.out.println("Absent");
	}
}

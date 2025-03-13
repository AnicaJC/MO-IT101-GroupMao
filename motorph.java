import java.util.Scanner;
public class motorph {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to MotorPH Payroll System");
        System.out.println(s:"Are you Admin or Employee? [A/E]: ");
        char enter = io.next().charAt(index:0);

        switch(enter) {
            case 'A': case 'a':
            System.out.println("Welcome Payroll Admin.\n");
            System.out.println(s:"What would you like to veiew? ");
            System.out.println("[1] View Employees List");
            System.out.println("[2] Manage Employees (Edit/Add)");
            System.out.println("[3] Generate Payroll");
            System.out.println("[4] View Payroll (Summary)");
            
            case 'e' : case 'E':
            System.out.println("Welcome Employee.\n");
            System.out.println(s:"What would you like to veiew? ");
            System.out.println("[1] View Employees Info");
            System.out.println("[2] View Payroll");
        }
    }
}
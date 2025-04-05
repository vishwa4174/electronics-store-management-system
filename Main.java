import java.util.Scanner;//create scanner package
// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //create  method welcome
    public void welcome() {
        Scanner scan = new Scanner(System.in);//create new scanner
        //Output design
        System.out.println("---------------------------------------------");
        System.out.println("Welcome to City Electronics Management System");
        System.out.println("---------------------------------------------");
        System.out.println("Follow the instructions correctly.\nChoose your answer by typing the index number of the command." +
                "You can exit any time from the system.\n\'Developed by: TechGen Vendors Pvt Ltd.\' ");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Loging to the system\tForgot password? - Contact us:cityele@gmail.com");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("1.Admin Login");
        System.out.println("2.Customer Login");
        System.out.println("3.Exit");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Choose who are you?");

        int val = scan.nextInt();//initialize the user input integer value to val variable
        //switch case for choosing the role
        switch (val) {
            case 1:
                Adminlog admin = new Adminlog();//create Adminlog object for handle admin
                admin.alogin();// call the alogin method in the Adminlog class
                break;

            case 2:
                Cuslog cus = new Cuslog();//create Customer object for handle customers
                cus.clogin();
                break;

            case 3:
                System.out.println("Exiting the system!");
                System.exit(0);//exit from the program
                break;
            default:
                System.out.println("Invalid input. please select 1,2 or 3");
        }

    }

    public static void main(String[] args) { //main method
       Main main = new Main();//create the object
        main.welcome();//call for the welcome method in main class



    }

}
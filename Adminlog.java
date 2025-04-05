import java.util.Scanner;//create scanner package
public class Adminlog {
    Scanner scan1 = new Scanner(System.in);//create new sanner
    //Admin login credentials initialization
    private final String ausname = "admin";//store username
    private final String apw = "123";//store password
    //initialize the attem variable
    int attem = 0;
    final int mattem = 5;//initialize maximum attemt value
    //create alogin method
    public void alogin(){

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Enter correct username and password\t Forgot password? - Contact us:cityele@gmail.com\n" +
                "Maximum attempt is 5 times");


        while(attem<mattem){//while loop for login
            System.out.println("------------------------------------------------------------------------");
            System.out.print("Admin Username:\t");

            String usname = scan1.nextLine();//get username input from the user
            System.out.print("Admin Password:\t");
            String Pw = scan1.nextLine();//get password input from the user
            if(ausname.equals(usname) && apw.equals(Pw)){//condition for validate login credentials
                System.out.println("Successfully! login to the system.");
                afterlog();//call for afterlog method
                break;
            }else{
               attem++;//increment the attempt value
               int rattem = mattem-attem;//get the remaining attemts
               System.out.println("Invalid Username & password. you have only  "+rattem+"  attempts!");
            }
            if(attem==mattem) {//condition for account blocking
                System.out.println("Warning! Your account has blocked. Please Contact It support team.");

            }

        }



    }
    //create afterlog method
    public void afterlog(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Hi "+ausname+"!"+" Welcome to Admin Dashbord.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("1.Product Management");
        System.out.println("2.All Products");
        System.out.println("3.Manage Customer Orders");
        System.out.println("4.LogOut");
        System.out.println("5.Exit");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Access your unlimited features.");
        int num = scan1.nextInt();//get user input
        switch(num){//switch case for access the features
            case 1:
                Productman pro = new Productman();//create new object
                pro.proman();
                break;

            case 2:
                Viewproducts wwi = new Viewproducts();
                wwi.view();
                break;
            case 3:
                Mngcustomer mng = new Mngcustomer();
                mng.products();
                break;
            case 4:
                Main ee = new Main();//create a object for the main class
                ee.welcome();//call to main constructor in main class
                break;
            case 5:
                exxit();//call the exxit method for exit from the system
                break;
            default:
                System.out.println("Invalid input!");
        }

    }
    public void exxit(){//create exxit method
        //System.out.println("------------------------------------------------------------------------");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Are you sure want to exit?\n1.Yes\n2.No");
        int exx = scan1.nextInt();//get user input for exit or not
        switch(exx){//switch case for exit process
            case 1:
                System.exit(0);//exit form  the sytem
                break;
            case 2:
                afterlog();//call to afterlog method
                break;
            default:
                System.out.println("Invalid Input!Try again");
                afterlog();//call to afterlog method
        }

    }

}

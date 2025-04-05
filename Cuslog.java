import java.util.Scanner;//crate scanner package
public class Cuslog {
    Scanner scan = new Scanner(System.in);//create new scanner
    private final String usname = "vishwa";//store username in private mode
    private final String pass = "123";//store password in private mode
    int attem = 0;//initialize the attempt
    final int maxattem = 5;//initialize the maximum attempt

    //create new method
    public void clogin(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Enter correct username and password\t Forgot password? - Contact us:cityele@gmail.com\n" +
                "Maximum attempt is 5 times");
        //create while loop for login process, only 5 attempts
        while(attem<maxattem){
            System.out.println("------------------------------------------------------------------------");
            System.out.print("Customer Username:\t");
            String cusname = scan.nextLine();//get the username input and store in cusname
            System.out.print("Customer Password:\t");
            String cpass = scan.nextLine();//get the password input and store in cpass

            //create if condition for validate login details
            if(usname.equals(cusname) && pass.equals(cpass)){
                System.out.println("Successfully! login to the system.");
                afterclog();//call for another method
                break;

            }else{
                attem++;//incrementation of the attemts
                int rattem = maxattem-attem;//get the remaining attempts
                System.out.println("Invalid Username & Password. You have only "+rattem+" attempts!");

            }
            if(attem==maxattem){//condition for warning message
                System.out.println("Warning! Your account has blocked. Please contact IT support team.");
            }
        }

    }

    //create afterclog method
    public void afterclog(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Hi "+usname+"!"+" Welcome to Customer Dashbord.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("1.Browse Products");
        System.out.println("2.My Orders");
        System.out.println("3.Manage My Orders");
        System.out.println("4.LogOut");
        System.out.println("5.Exit");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Access your unlimited features.");
        int val = scan.nextInt();//store the user input
        switch(val){//switch cas for access the features
            case 1:
                Browseproducts browsee = new Browseproducts();
                browsee.shows();
                break;
            case 2:
                Cusorders cco = new Cusorders();
                cco.customer();
                break;
            case 3:
                Mngorders mngo = new Mngorders();
                mngo.menue();
                break;
            case 4:
                Main ee = new Main();//create a object for the main class
                ee.welcome();//call to main constructor in main class
                break;
            case 5:
                exiit();//call for exiit method
                break;
            default:
                System.out.println("Invalid Input");


        }


    }
//create exit process method
    public void exiit(){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Are you sure want to exit?\n1.Yes\n2.No");
        int exx = scan.nextInt();//get user input for exit or not
        switch(exx){//switch case for exit process
            case 1:
                System.exit(0);//exit form  the sytem
                break;
            case 2:
                afterclog();//call to afterlog method
                break;
            default:
                System.out.println("Invalid Input!Try again");
                afterclog();//call to afterlog method
        }
    }


}

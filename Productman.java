import java.util.Scanner;//create scanner package
public class Productman {
    Scanner scan = new Scanner(System.in);//create the scanner

    //create new method proman

    public void proman() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Welcome to Product Management. You can manage all products here.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("1.Add New Product");
        System.out.println("2.Modify Products");
        System.out.println("3.Remove Products");
        System.out.println("4.Back");
        System.out.println("5.LogOut");
        System.out.println("6.Exit");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Please select one to access.");

        int val = scan.nextInt();//get user input to val variable
        //create switch case for access features
        switch (val) {
            case 1:
                addd();//call to addd method for add products
                break;
            case 2:
                modify();// call to modify method for modify products
                break;
            case 3:
                remove();

                break;
            case 4:
                Adminlog aa = new Adminlog();//object for Adminlog class to go back
                aa.afterlog();//call the afterlog method in Adminlog class.
                break;
            case 5:
                Main ee = new Main();//create a object for the main class
                ee.welcome();//call to main constructor in main class
                break;
            case 6:
                exiit();//call to exit process method
                break;
            default:
                System.out.println("Invalid Input, Error!");
                proman();//call for this method to run again this method
        }

    }

    //create method for exit process
    public void exiit() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Are you sure want to exit?\n1.Yes\n2.No");
        int exx = scan.nextInt();//get user input for exit or not
        switch (exx) {//switch case for exit process
            case 1:
                System.exit(0);//exit form  the sytem
                break;
            case 2:
                proman();//call to afterlog method
                break;
            default:
                System.out.println("Invalid Input!Try again");
                proman();//call to afterlog method
        }
    }

    //create method for add products
    public void addd() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Add product details step by step.");
        System.out.println("------------------------------------------------------------------------");
        cruditems adpro = new cruditems();
        adpro.addingproducts();
    }


    //create mathod for modify products
    public void modify() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Modify saved items.Follow those steps.First enter the ItemId that you want to modify.\nThen enter other updated details");
        System.out.println("------------------------------------------------------------------------");
        Modifyitems mm = new Modifyitems();
        mm.mody();

    }


    //create mathod for remove products
    public void remove() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("!!WARNING!! you are removing saved items.\nRemove saved Items.Follow those steps.First, enter the item ID that you want to delete\nthen press enter.");
        System.out.println("------------------------------------------------------------------------");
        removee rte = new removee();
        rte.rap();

    }
}

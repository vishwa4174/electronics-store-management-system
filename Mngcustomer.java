import java.util.Scanner;
public class Mngcustomer extends Browseproducts {
    //create the scanner
    Scanner scanner = new Scanner(System.in);

    //creating array for updating the status
   static int rows = 20;
   static int cols = 2;
   static int size = 0;
   static String[][] statuss = new String[rows][cols];

    //create the method to display the saved items
    public void products() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("All the available Products of the store are displayed here!\nYou can view the details.");
        System.out.println("------------------------------------------------------------------------");
        if (items == 0) {//check the no of items are empty or not
            System.out.println("------------------------------------------------------------------------");
            System.out.println("NO! available Items.");
            System.out.println("------------------------------------------------------------------------");
            Adminlog pro = new Adminlog();//call for the productmanage class
            pro.afterlog();//call for the proman method

        } else {//if the no of items are not empty
            System.out.println("------------------------------------------------------------------------");
            System.out.println("All saved Items are:");//show abailable saved items

            //create a loop for access the items
            for (int i = 0; i < items; i++) {
                System.out.println("**Saved -product Id:\t" + product[i][0] + " ,-Product Name is:\t" + product[i][1] + " ,-Product Prices is:\t" + product[i][2] + " ,-Product Description is:\t" + product[i][3] + " **");
            }
            System.out.println("------------------------------------------------------------------------");
            orders();//call to another method

        }
    }

    //create the method to display customer orders with the items
    public void orders() {
        if (orders == 0) {//check the no of items are empty or not
            System.out.println("------------------------------------------------------------------------");
            System.out.println("NO! available orders!");
            System.out.println("------------------------------------------------------------------------");
            Adminlog pro = new Adminlog();//call for the productmanage class
            pro.afterlog();//call for the proman method


        } else {//if the no of items are not empty
            System.out.println("------------------------------------------------------------------------");
            System.out.println("All the Customer Orders:");//show abailable saved items

            //create a loop for access the items
            for (int i = 0; i < orders; i++) {
                System.out.println("**Placed -Order Id:\t" + placeorder[i][0] + " ,-Product Id is:\t" + placeorder[i][1] + " ,-Product Name is:\t" + placeorder[i][2] + " ,-Product Price is:\t" + placeorder[i][3] + " ,-Quantity:\t" + placeorder[i][4] + " ,-Total:\t" + placeorder[i][5] + " **");
            }
            System.out.println("------------------------------------------------------------------------");


        }

        invoice();//call for another method
    }

    //create method for display the invoice details
    public void invoice() {
        if (bills == 0) {//check the no of items are empty or not
            System.out.println("------------------------------------------------------------------------");
            System.out.println("NO! available final invoices!");
            System.out.println("------------------------------------------------------------------------");
            Adminlog pro = new Adminlog();//call for the productmanage class
            pro.afterlog();//call for the proman method

        } else {//if the no of items are not empty
            System.out.println("------------------------------------------------------------------------");
            System.out.println("All the Final invoices:");//show abailable saved items

            //create a loop for access the items
            for (int i = 0; i < bills; i++) {
                System.out.println("**Final invoice -Order Id:\t" + bill[i][0] + " ,-Final Total is:\t" + bill[i][1] + " **");

            }
            System.out.println("------------------------------------------------------------------------");
//            Cuslog cc =new Cuslog();
//            cc.afterclog();
            status();//call for another method

        }
    }

    //create the method to update order status
    public void status() {
        boolean found = false;
        System.out.println("Do you need to update the order status of the customer orders? (yes/no)");
        //get the user input
        String yninput = scanner.nextLine();

        //condition
        if (yninput.equals("yes")) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Enter the Order Id?");
            String inputid = scanner.nextLine();
            //create for loop
            //search product with entered id
            for (int i = 0; i < bills; i++) {
                if (bill[i][0].equals(inputid)) {
                    found = true;
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Selected Order:");
                    System.out.println("**Order -Order Id:\t" + bill[i][0] + " ,-Final Total is:\t" + bill[i][1] + " **");
                    break;

                }
                System.out.println("------------------------------------------------------------------------");


            }

            System.out.println("Update the Status of the order. (Confirmed/Processing/Transferring/Delivered/Canceled");
            String sta = scanner.nextLine();
            for (int i = size; i < rows; i++) {
                statuss[i][0] = inputid;
                statuss[i][1] = sta;
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Successfull Updated the status!");
                System.out.println("Updated status -Order Id: " + statuss[i][0] + " -Order Status: " + statuss[i][1]);
                size++;//increment the size
                System.out.println("Do you want to update another order status? (yes/no)");
                String yn = scanner.nextLine();//get the user input yse or no
                if (!yn.equals("yes")) {//condition if not yes. the loop will break

                    Adminlog pro = new Adminlog();//call for the productmanage class
                    pro.afterlog();//call for the proman method
                    break;//break the loop

                }else{
                    orders();
                }

            }
            }else{
            Adminlog pro = new Adminlog();//call for the productmanage class
            pro.afterlog();//call for the proman method
            }
        if(!found){
            System.out.println("Not found!ERROR");
            Adminlog pro = new Adminlog();//call for the productmanage class
            pro.afterlog();//call for the proman method
        }


        }
    }


import java.util.Scanner;
public class Modifyitems extends cruditems{
    Scanner scanner = new Scanner(System.in);
    public void mody(){
        if(items ==0){
            System.out.println("No saved items! Go back and add new items");
            System.out.println("------------------------------------------------------------------------");

        }else {
            System.out.println("Saved items are:");
            System.out.println("------------------------------------------------------------------------");
            //create loop for show items
            for (int i = 0; i < items; i++) {
                System.out.println("**Saved -product Id:\t" + product[i][0] + " ,-Product Name is:\t" + product[i][1] + " ,-Product Prices is:\t" + product[i][2] + " ,-Product Description is:\t" + product[i][3] + " **");
            }
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Enter the Item Id that you want to modify?");
            String inputid = scanner.nextLine();//get the user input

            //find the item according to entered id
            boolean found = false;
            //create for loop
            for (int i = 0; i < items; i++) {
                if (product[i][0].equals(inputid)) {
                    found = true;
                    System.out.println("Enter the new Item name:");
                    String itemname = scanner.nextLine();
                    product[i][1] = itemname;//update itemname

                    System.out.println("Enter the new Item price:");
                    String itemprice = scanner.nextLine();
                    product[i][2] = itemprice;//update item price

                    System.out.println("Enter the new item Description:");
                    String itemdescription = scanner.nextLine();
                    product[i][3] = itemdescription;//update itemdescription

                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Item " + inputid + " Updated successfully!");
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("New Updated Item " + inputid + " -Item Name: " + product[i][1] + " -Item Price: " + product[i][2] + " -Item Description: " + product[i][3]);
                    break;


                }


            }
            Productman mn = new Productman();//object creation
            mn.proman();

            if (!found) {//if the item not found
                System.out.println("Item " + inputid + " is not found! please try again");
                Productman pmn = new Productman();//object creation
                pmn.proman();// call to another class
            }
        }
    }
}

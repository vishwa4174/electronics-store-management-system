import java.util.Scanner;
public class cruditems {


        Scanner addpro = new Scanner(System.in);//create the scanner
       static int rows = 20;//initialize the number of items that can add to the array
      static  int cols = 4;//initialize the attributes of a item
       static int items =0;//create variable to track the no of items that saved
        //creating the array
       static String [][] product = new String[rows][cols];//initialize the row and columns length

        public void addingproducts() {


            //create the for loop
            for (int i = items; i < rows; i++) {//loop for the row
                // for(int j = 0; j<cols; j++){//loop for the columns

                //get the user inputs
                System.out.println("1.Enter the Product ID:");
                String inputidd = addpro.nextLine();//get user input product id
                product[i][0] = inputidd;//store the product id in the array

                System.out.println("2.Enter the Product Name:");
                String inputname = addpro.nextLine();//get user input product name
                product[i][1] = inputname;//store the product name in the array

                System.out.println("3.Enter the Product Price:");
                String inputprice = addpro.nextLine();//get user input product price
                product[i][2] = inputprice;//store the product prices in the array

                System.out.println("4.Enter the Product Description:");
                String inputdes = addpro.nextLine();//get user input product description
                product[i][3] = inputdes;//store the product description in the array

                System.out.println("------------------------------------------------------------------------");
                System.out.println("Successfully saved the new product!");
                System.out.println("**Saved -product Id:\t" + product[i][0] + " , -Product Name is:\t" + product[i][1] + " ,-Product Prices is:\t" + product[i][2] + " ,-Product Description is:\t" + product[i][3] + " **");
                items++;
                // }
                //asking to add another product or not
                System.out.println("Do you want to add another product? (yes/no)");
                String anotherpro = addpro.nextLine();//get the user input yse or no
                if (!anotherpro.equals("yes")) {//condition if not yes. the loop will break

                    Productman pro = new Productman();//call for the productmanage class
                    pro.proman();//call for the proman method
                    break;//break the loop

                }


            }

        }



        }




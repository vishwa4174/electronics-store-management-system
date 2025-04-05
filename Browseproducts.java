import java.util.Scanner;
public class Browseproducts extends cruditems{
    Scanner scanner = new Scanner(System.in);
    //create the array length
    static int rows = 50;
   static int cols = 6;
    static int orders =0;
    static int orderid = 1;
    //create an array for place orders
    static String[][] placeorder = new String[rows][cols];//publish to use in public
    //create array for bill
     static int billrow =20;
    static int billcols =2;
    static int bills =0;
  static String[][]bill = new String[billrow][billcols];
    double finaltotal =0;//create the final total variable

    public void shows(){
        //buying products
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Welcome!Now You can buy our available products.you an place many orders.");

        if (items == 0) {//check the no of items are empty or not
            System.out.println("------------------------------------------------------------------------");
            System.out.println("NO! available Items.");
            System.out.println("------------------------------------------------------------------------");
            return;

        } else {//if the no of items are not empty
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Our available Items:");//show abailable saved items

            //create a loop for access the items
            for (int i = 0; i < items; i++) {
                System.out.println("**Saved -product Id:\t" + product[i][0] + " ,-Product Name is:\t" + product[i][1] + " ,-Product Prices is:\t" + product[i][2] + " ,-Product Description is:\t" + product[i][3] + " **");
            }
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Choose any product Id that you want to buy.Add to your cart.");
            String productid = scanner.nextLine();
            boolean found = false;
            //create for loop
            //search product with entered id
            for(int i=0; i<items; i++){
                if(product[i][0].equals(productid)){
                    found=true;
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Cart Item:");
                    System.out.println("Selected Item "+productid+" -Item Name: "+product[i][1]+" -Item Price: "+product[i][2]+" -Item Description: "+product[i][3]);
                    break;

                }
                System.out.println("------------------------------------------------------------------------");


            }
            if(!found){
                System.out.println("Error! Ivvalid Id.Try again");
                Cuslog clog = new Cuslog();
                clog.afterclog();
            }

            //get the quantity
            double tott =0;
            double tot1 =0;
            String iname ="";
            String iprice ="";
            System.out.println("Enter the quantity of the product?");
            String qty = scanner.nextLine();//get the quantity from the user
            for(int i=0; i<items; i++){
                if(product[i][0].equals(productid)){//get the price of the product that selected

                    double tot = Double.parseDouble(product[i][2]);//convert the data type of the price
                    iname = product[i][1];
                    iprice = product[i][2];
                    tot1 = Double.parseDouble(qty);
                    tott = tot*tot1;//multiply the price and the quantity
                    System.out.println("Total of the product is Rs. "+tott);//print the total
                   break;


                }

            }
            //create for loop for insert data
            for(int i =orders; i<rows; i++){

                System.out.println("Your Order ID is: "+orderid+" please input the order ID  to continue.");
                String inputorderid = scanner.nextLine();
                placeorder[i][0]= inputorderid;
                placeorder[i][1] = productid;
                placeorder[i][2] = String.valueOf(iname);
                placeorder[i][3] = String.valueOf(iprice);
                placeorder[i][4] = String.valueOf(tot1);
                placeorder[i][5] = String.valueOf(tott);

                System.out.println("Successfully placed the product.");
                orders++;
                break;
            }
            System.out.println("Do you want to add another item to your cart? (yes/no)");
            String yninput = scanner.nextLine();
            if(!yninput.equals("yes")){
                System.out.println("Do you want to exit?(yes/no)");
                String ex = scanner.nextLine();
                if(ex.equals("yes")){

                    if (orders == 0) {//check the no of items are empty or not
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("Has not any item in the cart!");
                        System.out.println("------------------------------------------------------------------------");
                        return;

                    } else {//if the no of items are not empty
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("Your cart:");//show the cart items



                        //create a loop for access the items
                        for (int i = 0; i < orders; i++) {

                            System.out.println("**Saved -Order Id:\t" + placeorder[i][0] + " ,-Product Id is:\t" + placeorder[i][1] + " ,-Product Name is:\t" + placeorder[i][2] + " ,-Product Price is:\t" + placeorder[i][3] +" ,-Quantity:\t"+placeorder[i][4]+" ,-Total:\t"+placeorder[i][5]+" **");

                        }
                        System.out.println("------------------------------------------------------------------------");

                        // calculate the total
                        for(int h=0; h<orders; h++){
                            if(placeorder[h][0].equals(String.valueOf(orderid))){
                                finaltotal += Double.parseDouble(placeorder[h][5]);

                            }
                        }
                        //show total bill


                        for(int k =bills; k<billrow; k++){
                            bill[k][0] = String.valueOf(orderid);
                            bill[k][1]= String.valueOf(finaltotal);
                            bills++;
                            break;
                        }

                        if (bills == 0) {//check the no of items are empty or not
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("Error!Try again");
                            System.out.println("------------------------------------------------------------------------");
                            return;

                        } else {//if the no of items are not empty
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("Your final bill is:");//show the final bill

                            //create a loop for access the items
                            for (int i = 0; i < bills; i++) {
                                System.out.println("**Final Bill -Order Id:\t" + bill[i][0] + " ,-Final Total is:\t" + bill[i][1] + " **");


                            }
                            orderid++;//increment the order id

                            System.out.println("------------------------------------------------------------------------");
                           Cuslog cus =new Cuslog();
                           cus.afterclog();

                        }






                    }

                }else{
                    shows();
                }
                Cuslog cus = new Cuslog();
                cus.afterclog();
            }
            shows();



        }


    }




}

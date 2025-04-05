import java.util.Scanner;

public class removee extends cruditems{
    public void rap(){
        Scanner scanner = new Scanner(System.in);//create the scanner
        if (items == 0) {//check the no of items are empty or not
            System.out.println("------------------------------------------------------------------------");
            System.out.println("NO! available Items.");
            System.out.println("------------------------------------------------------------------------");

        } else {//if the no of items are not empty
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Available Items are:");//show abailable saved items

            //create a loop for access the items
            for (int i = 0; i < items; i++) {
                System.out.println("**Saved -product Id:\t" + product[i][0] + " ,-Product Name is:\t" + product[i][1] + " ,-Product Prices is:\t" + product[i][2] + " ,-Product Description is:\t" + product[i][3] + " **");
            }
            System.out.println("------------------------------------------------------------------------");

            System.out.println("Enter the itemId that you want to delete!");

            String searchid = scanner.nextLine();
            boolean found = false;
            for (int i = 0; i < items; i++) {
                if (searchid.equals(String.valueOf(product[i][0]))){
                    found =true;
                    //shift the other values fulfill the space that removed from the array.
                    for(int j=1; j<items-1; j++){
                        product[j][0]=product[j+1][0];
                        product[j][1]=product[j+1][1];
                        product[j][2]=product[j+1][2];
                        product[j][3]=product[j+1][3];
                    }
                    //clear the last space by null the values
                    product[items-1][0]=null;
                    product[items-1][1]=null;
                    product[items-1][2]=null;
                    product[items-1][3]=null;

                    items--;//decrease the no of items from the array
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Successfully removed the Item"+searchid);
                    System.out.println("------------------------------------------------------------------------");
                    break;//break the loop of finding items



                }


            }
            if(!found) {
                System.out.println("------------------------------------------------------------------------");
                System.out.println("The Item " + searchid + " is not found!! Try again.");
                System.out.println("------------------------------------------------------------------------");
                Productman pp = new Productman();
                pp.proman();
            }

            if(items != 0){//after deleting the product other remaining saved products
                System.out.println("Other available items:");
                for(int i=0; i<items; i++){
                    System.out.println("**Saved -product Id:\t" + product[i][0] + " ,-Product Name is:\t" + product[i][1] + " ,-Product Prices is:\t" + product[i][2] + " ,-Product Description is:\t" + product[i][3] + " **");
                }
                System.out.println("------------------------------------------------------------------------");
            }






        }
        Productman pp = new Productman();
        pp.proman();





}
}

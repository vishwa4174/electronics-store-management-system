public class Mngorders extends Mngcustomer{

    //create method for display options
    public void menue(){

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Your Orders and their status.\nIf you unable to see your orders. Please consider that the orders are in confirming process.");
        if (size == 0) {//check the no of items are empty or not
            System.out.println("------------------------------------------------------------------------");
            System.out.println("NO! available Items.");
            System.out.println("------------------------------------------------------------------------");
            Cuslog clog = new Cuslog();
            clog.afterclog();

        } else {//if the no of orders are not empty
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Your Orders and their status:");//show the status of orders

            //create a loop for access the items
            for (int i = 0; i < size; i++) {
                System.out.println("**Orders -Order Id:\t" + statuss[i][0] + " , -Status:\t" + statuss[i][1] + " **");
            }
            System.out.println("------------------------------------------------------------------------");
            Cuslog clog = new Cuslog();
            clog.afterclog();


        }


    }

}

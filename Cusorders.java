public class Cusorders extends Browseproducts{
    public void customer(){
        if (orders == 0) {//check the no of items are empty or not
            System.out.println("------------------------------------------------------------------------");
            System.out.println("NO! available orders!");
            System.out.println("------------------------------------------------------------------------");


        } else {//if the no of items are not empty
            System.out.println("------------------------------------------------------------------------");
            System.out.println("All the Order history:");//show abailable saved items

            //create a loop for access the items
            for (int i = 0; i < orders; i++) {
                System.out.println("**Placed -Order Id:\t" + placeorder[i][0] + " ,-Product Id is:\t" + placeorder[i][1] + " ,-Product Name is:\t" + placeorder[i][2] + " ,-Product Price is:\t" + placeorder[i][3] +" ,-Quantity:\t"+placeorder[i][4]+" ,-Total:\t"+placeorder[i][5]+" **");
            }
            System.out.println("------------------------------------------------------------------------");


        }
        finalb();
    }

    public void finalb(){
        if (bills == 0) {//check the no of items are empty or not
            System.out.println("------------------------------------------------------------------------");
            System.out.println("NO! available final orders!");
            System.out.println("------------------------------------------------------------------------");
            return;

        } else {//if the no of items are not empty
            System.out.println("------------------------------------------------------------------------");
            System.out.println("All the Final Order history:");//show abailable saved items

            //create a loop for access the items
            for (int i = 0; i < bills; i++) {
                System.out.println("**Final invoice -Order Id:\t" + bill[i][0] + " ,-Final Total is:\t" + bill[i][1] + " **");

            }
            System.out.println("------------------------------------------------------------------------");
            Cuslog cc =new Cuslog();
            cc.afterclog();

        }
    }

}

public class Viewproducts extends cruditems{

        //create method
        public void view() {//get the passed value from the another class
            if (items == 0) {//check the no of items are empty or not
                System.out.println("------------------------------------------------------------------------");
                System.out.println("NO! available Items.");
                System.out.println("------------------------------------------------------------------------");
                Adminlog pp = new Adminlog();
                pp.afterlog();

            } else {//if the no of items are not empty
                System.out.println("------------------------------------------------------------------------");
                System.out.println("All saved Items are:");//show abailable saved items

                //create a loop for access the items
                for (int i = 0; i < items; i++) {
                    System.out.println("**Saved -product Id:\t" + product[i][0] + " ,-Product Name is:\t" + product[i][1] + " ,-Product Prices is:\t" + product[i][2] + " ,-Product Description is:\t" + product[i][3] + " **");
                }
                System.out.println("------------------------------------------------------------------------");
                Adminlog pp = new Adminlog();
                pp.afterlog();

            }

        }


}

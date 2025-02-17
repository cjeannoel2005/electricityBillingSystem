import java.util.ArrayList;

public class BillingAccount {

    // you must create a method in order for the for loop to work
// use the arraylist here for the customerRecords ;
    // the storage for the customerRecords
    // the print method for the customerRecords
    public static void printCustomerRecords(){
        ArrayList<Integer> customerRecords = new ArrayList<>(1000000000);
        for (int i = 0 ; i < customerRecords.size(); i++ )
        {
            System.out.println(customerRecords);
            if (customerRecords.size() == 111110) {
                System.out.println("this is the end of the billing records");
                break;

            }

        }
    }


  // the main method in the billing account
    public void main(String[] args) {

    }

}

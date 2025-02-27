import java.util.ArrayList;


public class Invoice {


    private String customerDetails;
    private Double unitsConsumed;
    private float rate;
    private int totalAmount;


    // the arraylist for the search and retrieval of the customer details

    ArrayList<Invoice> invoiceRetrieval = new ArrayList<>(10000);

    // the customerDetails getters and setters
    // getters for customerDetails.
    public String getCustomerDetails() {
        return customerDetails;
    }

    // the setters for customerDetails
    public void setCustomerDetails(String customerDetails) {
        this.customerDetails = customerDetails;
    }

    // the getter for unitsConsumed
    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    // the setters for unitsConsumed
    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;

    }

    // the getters for rate and totalAmount
    public float getRate() {
        return rate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    // the setters for the rate and totalAmount

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }



// create a new void method to sent error message

public void displayErrorMessage(){
    System.out.println("this is an error");
}
}

// create methods to search and retrieve customer invoices by the id and names
    public Double searchProduct(String customerDetails) {
        for (Invoice Invoice : InvoiceRetrieval) {
            if (Invoice.getCustomerDetails().equals(customerDetails)) {
                return unitsConsumed;
                // fix this part because the invoice should not be the return ;
            }
            else{
                displayErrorMessage();
                return null;
            }

        }
    }
}
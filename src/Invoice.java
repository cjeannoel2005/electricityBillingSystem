public class Invoice {
    private String customerDetails;
    private double unitsConsumed ;
    private  float rate;
    private int totalAmount;

    // the customerDetails getters and setters
    // getters for customerDetails.
    public String getCustomerDetails(){
        return customerDetails;
    }
    // the setters for customerDetails
    public void setCustomerDetails(String customerDetails){
        this.customerDetails = customerDetails;
    }

    // the getter for unitsConsumed
    public double getUnitsConsumed(){
        return unitsConsumed;
    }

    // the setters for unitsConsumed
    public void setUnitsConsumed(double unitsConsumed){
        this.unitsConsumed = unitsConsumed;

    }

    // the getters for rate and totalAmount
    public float getRate() {
        return rate;
    }

    public int getTotalAmount(){
        return totalAmount;
    }

    // the setters for the rate and totalAmount

    public void setTotalAmount(int totalAmount){
        this.totalAmount = totalAmount;
    }

    public void setRate(float rate){
        this.rate = rate;
    }
}

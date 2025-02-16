// can't put print statements inside the classes ( only methods )

public class Customer {
    public String name ;
    public String address ;
    private String phoneOrEmail ;
    private int paymentInformation;

}


// add the zip code
// add the city
// add a discount or tax

 class ResidentialCustomer extends Customer{
    void message(){
        System.out.println("Welcome to Residential Customer");
    }
    private double zipCode;
    private String city;
    public double residentialTax;
}

// add the company name
// add a tax
class CommercialCustomer extends Customer{
void message(){
    System.out.println("Welcome to Commercial Customer");
}
    private String companyName ;
    private float commercialTax ;

}
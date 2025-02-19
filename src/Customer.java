// can't put print statements inside the classes ( only methods )
import java.util.HashMap ;

// fix the clashing in the RSI() from TR and the RSI from rsi ( return type ????)


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
class CommercialCustomer extends Customer {
    void message() {
        System.out.println("Welcome to Commercial Customer");
    }

    private String companyName;
    private float commercialTax;
}

// use interface to combine the parent and the children class for
// the tarriffRates class

interface CustomerInterface{
    void CustomerInterfaceMessage();
}

interface ResidentialCustomerInterface{
    Void  ResidentialCustomerInterface();
}
 interface CommercialCustomerInterface{
    void commercialCustomerInterface();
 }

 // the tariffRates methods

class tariffRates implements CustomerInterface, ResidentialCustomerInterface, CommercialCustomerInterface{
    @Override
    public void CustomerInterfaceMessage() {
        System.out.println(" What is your house adress ?");
        // link  this to the address string
    }

    @Override
    public void commercialCustomerIntefrace() {
        System.out.println("What is the name of your company");

        // learn how to seperate the companies by the inc or org from the string
    }

    @Override
    public void ResidentialCustomerInterface(){
        System.out.println("What is the adress of your residence ? ");
    }

}
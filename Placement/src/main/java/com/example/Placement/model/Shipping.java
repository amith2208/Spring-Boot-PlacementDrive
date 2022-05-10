package com.example.Placement.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table 
public class Shipping {
    @Id
    // private int Purchase_id;
    // private int Customer_id;
    private String Address;
    @Column(name="city")
    private String city;
    @Column(name="pincode")
    private String Pincode;

   // @Column(name="customer_id")
     @JsonIgnore
     @OneToOne(fetch = FetchType.LAZY, optional = false)
	 @JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

    //@Column(name="purchase_id")
     @JsonIgnore
     @OneToOne(fetch = FetchType.LAZY, optional = false)
	   @JoinColumn(name = "purchase_id",  nullable = false)
	  private Purchase purchase;

	public Shipping()
	{
		
	}
    // public Shipping(Customer customer,Purchase purchase, String Address,String City,String Pincode) {
		//   this.customer=customer;
    //   this.purchase=purchase;
    //   this.Address=Address;
		//   this.city=City;
    //   this.Pincode=Pincode;
    // }
  public String getAddress() {
        return Address;
    }

    public void setAddress(String add) {
        this.Address = add;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city=city;
    }
    public String getPincode()
    {
      return Pincode;
    }
    public void setPincode(String p)
    {
      this.Pincode=p;
    }
    public Purchase getPurchase()
    {
      return purchase;
    }

    public void setPurchase(Purchase p)
    {
      this.purchase=p;
    }

    public Customer getCustomer()
    {
      return customer;
    }

    public void setCustomer(Customer c)
    {
      this.customer=c;
    }
  //   @Override
	//   public String toString() {
	// 	return "Shipping [Address=" + Address + ", City=" + City + ", Pincode=" + Pincode + ", Purchase=" + purchase
	// 			+ ", Customer=" + customer + "]";
	// }
}

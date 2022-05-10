package com.example.Placement.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table 
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Customer_id;
    private String Customer_name;
    private String Email;
    private String Mobile_number;
    private String City;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY,
				cascade = CascadeType.ALL,
				mappedBy = "customer")
	  private Purchase purchase;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY,
				cascade = CascadeType.ALL,
				mappedBy = "customer")
	  private Shipping shipping;

	public Customer()
	{
		
	}

    public Customer(String Customer_name, String Email,String Mobile_number,String City) {
		this.Customer_name=Customer_name;
		this.Email=Email;
        this.Mobile_number=Mobile_number;
        this.City=City;
    }


    public String getName() {
        return Customer_name;
    }

    public void setName(String name) {
        this.Customer_name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email=Email;
    }
    public String getMobile()
    {
      return Mobile_number;
    }
    public void serMobile(String Mobile)
    {
      this.Mobile_number=Mobile;
    }
    public String getCity()
    {
      return City;
    }
    public void setCity(String City)
    {
      this.City=City;
    }

    public Purchase getPurchase()
    {
      return purchase;
    }

    public void setPurchase(Purchase p)
    {
      this.purchase=p;
    }

    public Shipping getShipping()
    {
      return shipping;
    }

    public void setShipping(Shipping s)
    {
      this.shipping=s;
    }
    @Override
	  public String toString() {
		return "Customer [id=" + Customer_id + ", Name=" + Customer_name + ", Email=" + Email + ", Mobile_Number=" + Mobile_number
				+ ", City=" + City +  "]";
	}
}

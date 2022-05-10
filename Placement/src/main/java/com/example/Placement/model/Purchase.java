package com.example.Placement.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table 
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Purchase_id;
   // private int Customer_id;
    private String Product_name;
    private int Quantity;
    private int Pricing;
    private int MRP;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY,
				cascade = CascadeType.ALL,
				mappedBy = "purchase")
	  private Shipping shipping;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	public Purchase()
	{
		
	}
    public Purchase(Customer customer,String Product_name,int Quantity,int Pricing,int MRP) {
        this.customer=customer;
		    this.Product_name=Product_name;
		    this.Quantity=Quantity;
        this.Pricing=Pricing;
        this.MRP=MRP;
    }
  

    public String getName() {
        return Product_name;
    }

    public void setName(String name) {
        this.Product_name = name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity=Quantity;
    }
    public int getPricing()
    {
      return Pricing;
    }
    public void setPricing(int p)
    {
      this.Pricing=p;
    }
    public int getMrp()
    {
      return MRP;
    }
    public void setMrp(int M)
    {
      this.MRP=M;
    }
    public Customer getCustomer()
    {
      return customer;
    }

    public void setCustomer(Customer c)
    {
      this.customer=c;
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
		return "Purchase [id=" + Purchase_id + ", name=" + Product_name + ", Quantity=" + Quantity + ", price=" + Pricing
				+ ", MRP=" + MRP + ", Customer=" + customer + "]";
	  }
}

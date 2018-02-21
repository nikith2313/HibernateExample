package hiberanate.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Customer {
@Id
@Column (name="cust_id_PK")
@GeneratedValue(strategy = GenerationType.AUTO)
private int custid;

private String title;
@Column (name="first_name")
private String firstName;
@Column (name="last_name")
private String lastName;
private String suffix;
private String email;
private String company;
@Column (name="display_name")
private String displayName;
@Column (name="print_on_check_as")
private String printOnCheckAs;
@Column (name="billing_street")
private String billigStreet;
@Column (name="billing_city")
private String billingCity;
@Column (name="billing_state")
private String billingState;
@Column (name="billing_zip")
private int billingZip;
@Column (name="billing_country")
private String billingCountry;
@Column (name="shipping_street")
private String shippingStreet;
@Column (name="shipping_city")
private String shippingCity;
@Column (name="shipping_state")
private String shippingState;
@Column (name="shipping_zip")
private int shippingZip;
@Column (name="shipping_country")
private String shippingCountry;
@Column (name="other_details")
private String otherDetails;

@OneToMany(targetEntity=Orders.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
private List<Orders> orders;

public List<Orders> getOrders() {
	return orders;
}
public void setOrders(List<Orders> orders) {
	this.orders = orders;
}
public Customer(){
	
}
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getSuffix() {
	return suffix;
}
public void setSuffix(String suffix) {
	this.suffix = suffix;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getDisplayName() {
	return displayName;
}
public void setDisplayName(String displayName) {
	this.displayName = displayName;
}
public String getPrintOnCheckAs() {
	return printOnCheckAs;
}
public void setPrintOnCheckAs(String printOnCheckAs) {
	this.printOnCheckAs = printOnCheckAs;
}
public String getBilligStreet() {
	return billigStreet;
}
public void setBilligStreet(String billigStreet) {
	this.billigStreet = billigStreet;
}
public String getBillingCity() {
	return billingCity;
}
public void setBillingCity(String billingCity) {
	this.billingCity = billingCity;
}
public String getBillingState() {
	return billingState;
}
public void setBillingState(String billingState) {
	this.billingState = billingState;
}
public int getBillingZip() {
	return billingZip;
}
public void setBillingZip(int billingZip) {
	this.billingZip = billingZip;
}
public String getBillingCountry() {
	return billingCountry;
}
public void setBillingCountry(String billingCountry) {
	this.billingCountry = billingCountry;
}
public String getShippingStreet() {
	return shippingStreet;
}
public void setShippingStreet(String shippingStreet) {
	this.shippingStreet = shippingStreet;
}
public String getShippingCity() {
	return shippingCity;
}
public void setShippingCity(String shippingCity) {
	this.shippingCity = shippingCity;
}
public String getShippingState() {
	return shippingState;
}
public void setShippingState(String shippingState) {
	this.shippingState = shippingState;
}
public int getShippingZip() {
	return shippingZip;
}
public void setShippingZip(int shippingZip) {
	this.shippingZip = shippingZip;
}
public String getShippingCountry() {
	return shippingCountry;
}
public void setShippingCountry(String shippingCountry) {
	this.shippingCountry = shippingCountry;
}
public String getOtherDetails() {
	return otherDetails;
}
public void setOtherDetails(String otherDetails) {
	this.otherDetails = otherDetails;
}


}

package hiberanate.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Orders {
	@Id
	@Column (name="order_id_pk")
	@GeneratedValue(strategy = GenerationType.AUTO)
private int ordersId;
	//@ManyToOne
	//@JoinColumn(name="cust_id")
//private Customer customer;
	@Column (name="invoice_creation_date")
	@Temporal (TemporalType.DATE)
private Date invoiceCreationDate;
	@Column (name="payment_due_date")
	@Temporal (TemporalType.DATE)
private Date paymentDueDate;
	@Column (name="custom_message")
private String customMessage;

	@OneToMany(targetEntity=OrderProducts.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="order_id_pk") 
	private List<OrderProducts> orderProducts;
	
	public int getOrdersId() {
		return ordersId;
	}
	public List<OrderProducts> getOrderProducts() {
		return orderProducts;
	}
	public void setOrderProducts(List<OrderProducts> orderProducts) {
		this.orderProducts = orderProducts;
	}
	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	
	/*public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}*/
	public Date getInvoiceCreationDate() {
		return invoiceCreationDate;
	}
	public void setInvoiceCreationDate(Date invoiceCreationDate) {
		this.invoiceCreationDate = invoiceCreationDate;
	}
	public Date getPaymentDueDate() {
		return paymentDueDate;
	}
	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}
	public String getCustomMessage() {
		return customMessage;
	}
	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}

}

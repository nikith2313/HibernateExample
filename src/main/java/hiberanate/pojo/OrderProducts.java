package hiberanate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class OrderProducts {
@Id
@Column (name="order_product_id_PK")
@GeneratedValue(strategy = GenerationType.AUTO) 
	private int orderProductId;


public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}



	public int getOrderProductId() {
	return orderProductId;
}
public void setOrderProductId(int orderProductId) {
	this.orderProductId = orderProductId;
}
	private int quantity;
	
}

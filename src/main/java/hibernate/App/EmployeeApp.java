package hibernate.App;


import hiberanate.Dao.CustomerDao;
import hiberanate.pojo.Customer;

public class EmployeeApp {

	public static void main(String args[]) {
		Customer e = new Customer();
		/*Products p=new Products();
		OrderProducts op=new OrderProducts();
		Orders o = new Orders();
		*/
		e.setCustid(1);
		e.setFirstName("Nikith");
		e.setLastName("kumar");
		e.setCompany("IMCS");
/*		o.setCustomMessage("hi");
		
		
		List<Orders> list = new ArrayList<Orders>();
		list.add(o);
		e.setOrders(list);
		
		List<OrderProducts> listop = new ArrayList<OrderProducts>();
		op.setOrderProductId(12);
		op.setQuantity(10);
		
		
		
		
		
		p.setDescription("nothing");
		p.setName("nikit");
		p.setPrice(1200);
		List<OrderProducts> listop2 = new ArrayList<OrderProducts>();
		listop2.add(op);
		p.setOrderProducts(listop2);
		o.setOrderProducts(listop);
		listop.add(op);
		*/
		
		CustomerDao.addEmployee(e);
	e.setFirstName("nik");
		CustomerDao.updateCustomer(e);
		CustomerDao.deletCustomer(e.getCustid());
		

	}

}

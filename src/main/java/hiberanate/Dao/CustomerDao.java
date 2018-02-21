package hiberanate.Dao;




import org.hibernate.Session;
import org.hibernate.Transaction;

import hiberanate.pojo.Customer;
import hibernate.util.CustomerUtil;

public class CustomerDao {

	public static void addEmployee(Customer cust){
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		try{
		session.save(cust);
		transaction.commit();
		
		}
		catch(Exception e){
			transaction.rollback();
		}
		finally {
			session.close();
		}
		}
	
	public static void updateCustomer(Customer cust){
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		try{
			session.update(cust);
		transaction.commit();
		
		}
		catch(Exception e){
			transaction.rollback();
		}
		finally {
			if (session != null) session.close();
		}
		}
	
	public static void deletCustomer(int custid){
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
	
		try{
			Customer c=(Customer) session.get(Customer.class,custid );		
		session.delete(c);
		transaction.commit();
		
		}
		catch(Exception e){
			transaction.rollback();
		}
		finally {
			session.close();
		}
		}
	
	
	public static Session getSession(){
		return CustomerUtil.getSessionFactory().openSession();
	}

	
}

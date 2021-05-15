package com.cg.onlineadmissionsyst;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.onlineadmissionsyst.module.Application;
import com.cg.onlineadmissionsyst.module.Payment;
import com.cg.onlineadmissionsyst.service.IPaymentService;

@SpringBootTest
class PaymentTest {
	
	@Autowired
	IPaymentService payser;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setup");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");
	}
	
	@Test
//	@Disabled
	void testaddPayment() {
		LocalDate app1=LocalDate.of(1999,10,28);
		LocalDate app2=LocalDate.of(2021,10,15);		
		LocalDate app3=LocalDate.of(2021,05,10);
		
		Application app=new Application(7,"Matthew",app1,"B.E",95,"Engineer","matthew@gmail.com","Accepted",app2,"Good");
		Payment paym=new Payment(106,"matthew@gmail.com", 4000.00,"Paid",app3, "Received");
		paym.setApplication(app);
		app.setPayment(paym);
	
		Payment p = payser.addPayment(paym);
		System.out.println(p);
	    assertEquals(106, p.getPaymentId());
 }
	
	@Test
//	@Disabled
	void testviewAllPaymentDetails() {
		List<Payment>view=payser.viewAllPaymentDetails();
		for(Payment a : view) {
			System.out.println(a);
			}

 }
	
	@Test
	@Disabled
	void testgetPaymentDetailsByPaymentId() {
		Payment view = payser.getPaymentDetailsByPaymentId(110);
		System.out.println(view);
		assertEquals(110, view.getPaymentId());

	}
	
	@Test
	@Disabled
	void testgetPaymentDetailsByEmail() {
		List<Payment> view = payser.findByEmailIdOfStudent("sam@gmail.com");
		for (Payment p : view) {
			System.out.println(p);
		}
	}
	
	@Test
	@Disabled
	void testgetPaymentDetailsByStatus() {
		List<Payment> view = payser.findByPaymentStatus("Received");
		System.out.println(view);
		assertEquals(2, view.size());

	}
	
	@Test
	@Disabled
	void testupdatePaymentDetails() {
		Payment pay = new Payment();
		pay.setPaymentId(112);
		pay.setPaymentAmount(3000.00);
		pay.setEmailIdOfStudent("mark@gmail.com");
		pay.setPaymentDescription("NotPaid");
		pay.setPaymentStatus("NotReceived");

		LocalDate pay1 = LocalDate.of(2020, 05, 10);
		pay.setPaymentDate(pay1);
       
		Payment view = payser.updatePaymentDetails(110, pay);
		System.out.println(pay);
		System.out.println("PAYMENTDETAILS UPDATED");
		assertEquals(110, view.getPaymentId());
	}
	
	@Test
	@Disabled
	void testdeletePaymentById() {
		Payment view = payser.deletePaymentById(11);
		System.out.println("REMOVED BY ID");
		assertEquals(11, view.getPaymentId());
	}
	
	
	@Test
	@Disabled
	void getPaymentDetailsByApplicationIdtest() {
		List<Payment> view=payser.findByApplicationId(30);
 	    System.out.println(view);
 	    assertEquals(1,view.size());	
 	}


}

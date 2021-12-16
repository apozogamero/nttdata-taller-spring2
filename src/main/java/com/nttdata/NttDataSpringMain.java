package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.persistence.Order;
import com.nttdata.persistence.Product;
import com.nttdata.services.OrderServiceIslas;
import com.nttdata.services.OrderServicePeninsula;

@SpringBootApplication
public class NttDataSpringMain implements CommandLineRunner{

	@Autowired
	@Qualifier("peninsula")
	OrderServicePeninsula servPeninsula;
	
	@Autowired
	@Qualifier("islas")
	OrderServiceIslas servIslas;
	
	public static void main(String[] args) {
		SpringApplication.run(NttDataSpringMain.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Order o1 = new Order();
		Order o2 = new Order();
		Order o3 = new Order();
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		
		o1.setId(1);
		o1.setCustomer("Roy");
		o1.setAddress("Almería");
		o1.setPeninsula(true);
		o1.setId(2);
		o1.setCustomer("Noel");
		o1.setAddress("Valencia");
		o1.setPeninsula(true);
		o1.setId(3);
		o1.setCustomer("Lorenzo");
		o1.setAddress("Tenerife");
		o1.setPeninsula(false);
		
		p1.setId(1);
		p1.setName("Termómetro");
		p1.setPrice(30.0);
		p1.setId(2);
		p1.setName("Trípode");
		p1.setPrice(15.0);
		p1.setId(3);
		p1.setName("Linterna");
		p1.setPrice(25.0);
		p1.setId(4);
		p1.setName("Cámara");
		p1.setPrice(45.0);
		p1.setId(5);
		p1.setName("Micrófono");
		p1.setPrice(50.0);
		
		servPeninsula.addOrder(o1, p4, p1, p3);
		servPeninsula.addOrder(o2, p1, p5);
		servIslas.addOrder(o3, p5, p3, p2);
		
		System.out.println(servPeninsula.searchAll());
	}

}

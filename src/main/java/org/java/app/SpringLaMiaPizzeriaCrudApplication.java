package org.java.app;

import java.time.LocalDate;

import org.java.app.pojo.Deal;
import org.java.app.pojo.Pizza;
import org.java.app.serve.PizzaService;
import org.java.app.serve.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner {
	
	@Autowired
	private PizzaService pizzaService;
	
	@Autowired
	private DealService dealService;

	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Pizza p1 = new Pizza("p11", "overview1", "https://images.pexels.com/photos/1566837/pexels-photo-1566837.jpeg?auto=compress&cs=tinysrgb&w=400", 10.10f);
		Pizza p2 = new Pizza("p22", "overview1", "https://images.pexels.com/photos/7947152/pexels-photo-7947152.jpeg?auto=compress&cs=tinysrgb&w=400", 12.10f);
		Pizza p3 = new Pizza("p33", "overview1", "https://images.pexels.com/photos/5903262/pexels-photo-5903262.jpeg?auto=compress&cs=tinysrgb&w=400", 13.10f);
		
		pizzaService.save(p1);
		pizzaService.save(p2);
		pizzaService.save(p3);
		
		Deal d1 = new Deal(LocalDate.now(), LocalDate.parse("2024-01-01"), "super offerta!!!", p3);
		Deal d2 = new Deal(LocalDate.now(), LocalDate.parse("2024-01-01"), "super offerta!!!", p3);
		Deal d3 = new Deal(LocalDate.now(), LocalDate.parse("2024-01-01"), "super offerta!!!", p3);
		
		dealService.save(d1);
		dealService.save(d2);
		dealService.save(d3);
	}

}
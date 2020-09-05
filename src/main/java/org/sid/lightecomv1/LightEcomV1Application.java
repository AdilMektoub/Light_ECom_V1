package org.sid.lightecomv1;

import net.bytebuddy.utility.RandomString;
import org.sid.lightecomv1.dao.CategoryRepository;
import org.sid.lightecomv1.dao.ProductRepository;
import org.sid.lightecomv1.entities.Category;
import org.sid.lightecomv1.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class LightEcomV1Application implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(LightEcomV1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category comp = new Category("Computers", null, null, null);
		categoryRepository.save(comp);
		Category print = new Category("Printers",null, null, null);
		categoryRepository.save(print);
		Category sp = new Category("Smart-Phones",null, null, null);
		categoryRepository.save(sp);

		Product c1 = new Product();		Product c2 = new Product(); 	Product c3 = new Product(); 
		c1.setName("Asus ROG");	c1.setCurrentprice(1200);	c1.setCategory(comp);
		c2.setName("HP pavion");	c2.setCurrentprice(800);	c2.setCategory(comp);
		c3.setName("DELL XPS");	c3.setCurrentprice(950);	c3.setCategory(comp);
		productRepository.save(c1); productRepository.save(c2); productRepository.save(c3);

		Product s1 = new Product();		Product s2 = new Product(); 	Product s3 = new Product(); 
		s1.setName("One Plus 7t");	s1.setCurrentprice(450);	s1.setCategory(sp);
		s2.setName("iPhone");	s2.setCurrentprice(800);	s2.setCategory(sp);
		s3.setName("Samsung");	s3.setCurrentprice(950);	s3.setCategory(sp);
		productRepository.save(s1); productRepository.save(s2); productRepository.save(s3);

		Product p1 = new Product();		Product p2 = new Product(); 	Product p3 = new Product(); 
		p1.setName("ESPON");	p1.setCurrentprice(1200);	p1.setCategory(print);
		p2.setName("CANON");	p2.setCurrentprice(800);	p2.setCategory(print);
		p3.setName("HP Print");	p3.setCurrentprice(950);	p3.setCategory(print);
		productRepository.save(p1); productRepository.save(p2); productRepository.save(p3);

	}
}




























//Random rnd = new Random();
//categoryRepository.findAll().forEach(c-> {
//	for (int i=0; i <10 ; i++) {
//		Product p = new Product();
//		p.setName(RandomString.make(18));
//		p.setCurrentprice(100+rnd.nextInt(10000));
//		p.setAvailable(rnd.nextBoolean());
//		p.setPromotion(rnd.nextBoolean());
//		p.setSelected(rnd.nextBoolean());
//		p.setPhotoName("unkown.png");
//		p.setCategory(c);
//		productRepository.save(p);
//	}
//
//});
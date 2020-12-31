package com.vfcode.cursomc;

import java.util.Arrays;

import com.vfcode.cursomc.domain.Address;
import com.vfcode.cursomc.domain.Category;
import com.vfcode.cursomc.domain.City;
import com.vfcode.cursomc.domain.Client;
import com.vfcode.cursomc.domain.Product;
import com.vfcode.cursomc.domain.State;
import com.vfcode.cursomc.domain.enums.ClientType;
import com.vfcode.cursomc.repositories.AddressRepository;
import com.vfcode.cursomc.repositories.CategoryRepository;
import com.vfcode.cursomc.repositories.CityRepository;
import com.vfcode.cursomc.repositories.ClientRepository;
import com.vfcode.cursomc.repositories.ProductRepository;
import com.vfcode.cursomc.repositories.StateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private AddressRepository addressRepository;
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		Product p1 = new Product(null, "Computador", 2000.00);
		Product p2 = new Product(null, "Impressora", 800.00);
		Product p3 = new Product(null, "Mouse", 80.00);
		
		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProducts().addAll(Arrays.asList(p2));
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		State state1 = new State(null, "Minas Gerais");
		State state2 = new State(null, "São Paulo");
		
		City city1 = new City(null, "Uberlândia", state1);
		City city2 = new City(null, "São Paulo", state2);
		City city3 = new City(null, "Campinas", state2);
		
		state1.getCities().addAll(Arrays.asList(city1));
		state2.getCities().addAll(Arrays.asList(city2, city3));

		stateRepository.saveAll(Arrays.asList(state1, state2));
		cityRepository.saveAll(Arrays.asList(city1, city2, city3));

		Client client1 = new Client(null, "Alissan Kristine", "alissan.camargo@gmail.com", "42486356827", ClientType.PESSOAFISICA);

		client1.getPhones().addAll(Arrays.asList("11949999708", "11977456642"));

		Address address1 = new Address(null, "R. Estados Unidos", "195", "Apto 14, torre 4", "Guaraú", "13324220", client1, city1);
		Address address2 = new Address(null, "R. dos Bagres", "542", "Casa", "Salto de São José", "13324277", client1, city2);
	
		client1.getAddresses().addAll(Arrays.asList(address1, address2));

		clientRepository.saveAll(Arrays.asList(client1));
		addressRepository.saveAll(Arrays.asList(address1, address2));
	
	}

}

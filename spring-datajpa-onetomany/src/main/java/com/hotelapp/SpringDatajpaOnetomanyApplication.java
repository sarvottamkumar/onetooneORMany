package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.model.Category;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Item;
import com.hotelapp.model.Type;
import com.hotelapp.service.IHotelService;

@SpringBootApplication
public class SpringDatajpaOnetomanyApplication implements CommandLineRunner {
	
	@Autowired
	IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Item item1 = new Item("FriedRice",Category.FASTFOOD,"Chinese",Type.VEG,100);
		Item item2 = new Item("Mushroom Noodles",Category.FASTFOOD,"Chinese",Type.VEG,120);
		Item item3 = new Item("Vanilla Shake",Category.BEVERAGES,"Juices",Type.VEG,200);
		Set<Item> items = new HashSet<>(Arrays.asList(item1,item2,item3));
		
		Hotel hotel = new Hotel("Mainland",Type.VEG,"Hyderabad",4.5,items);
		
		hotelService.addHotel(hotel);

		Item item4 = new Item("Chicken Noodles",Category.FASTFOOD,"Chinese",Type.VEG,120);
		Item item5 = new Item("Chicken Masala",Category.STARTERS,"NI",Type.VEG,150);
		Item item6 = new Item("Chicken Biriyani",Category.BEVERAGES,"Andra",Type.VEG,250);
		Set<Item> itemList1 = new HashSet<>(Arrays.asList(item4,item5,item6));
		
		Hotel hotel2 = new Hotel("Dragon King",Type.NONVEG,"Hyderabad",4.1,itemList1);
		hotelService.addHotel(hotel2);

//		
//		hotelService.getAll().forEach(nhotel->{
//			System.out.println("Name "+nhotel.getName());
//			System.out.println("Name "+nhotel.getName());
//			nhotel.getItemList().forEach(nitem->{
//				System.out.println("ItemName "+nitem.getItemName());
//				System.out.println("Cuisine "+nitem.getCuisine());
//				System.out.println("Category "+nitem.getCategory());
//				System.out.println("Price "+nitem.getPrice());
//			});
//		});
//		
//		hotelService.getByItemNameCategory("Dosa",Category.BREAKFAST).forEach(nhotel->{
//			System.out.println("Name "+nhotel.getName());
//			System.out.println("Name "+nhotel.getName());
//			nhotel.getItemList().forEach(nitem->{
//				System.out.println("ItemName "+nitem.getItemName());
//				System.out.println("Cuisine "+nitem.getCuisine());
//				System.out.println("Category "+nitem.getCategory());
//				System.out.println("Price "+nitem.getPrice());
//			});
//		});
		

//		hotelService.getByType(Type.VEG).forEach(nhotel->{
//			System.out.println("Name "+nhotel.getName());
//			System.out.println("Name "+nhotel.getName());
//			nhotel.getItemList().forEach(nitem->{
//				System.out.println("ItemName "+nitem.getItemName());
//				System.out.println("Cuisine "+nitem.getCuisine());
//				System.out.println("Category "+nitem.getCategory());
//				System.out.println("Price "+nitem.getPrice());
//			});
//		});
//		
//		hotelService.getByCuisineAndType("Chinese",Type.NONVEG).forEach(nhotel->{
//			System.out.println("Name "+nhotel.getName());
//			System.out.println("Name "+nhotel.getName());
//			nhotel.getItemList().forEach(nitem->{
//				System.out.println("ItemName "+nitem.getItemName());
//				System.out.println("Cuisine "+nitem.getCuisine());
//				System.out.println("Category "+nitem.getCategory());
//				System.out.println("Price "+nitem.getPrice());
//			});
//		});
//		
//		hotelService.getByItemNameLessPrice("Icecream",400).forEach(nhotel->{
//			System.out.println("Name "+nhotel.getName());
//			System.out.println("Name "+nhotel.getName());
//			nhotel.getItemList().forEach(nitem->{
//				System.out.println("ItemName "+nitem.getItemName());
//				System.out.println("Cuisine "+nitem.getCuisine());
//				System.out.println("Category "+nitem.getCategory());
//				System.out.println("Price "+nitem.getPrice());
//			});
//		});
		
		hotelService.getByCuisine("SI").forEach(System.out::println);
		System.out.println();
		hotelService.getByCategory(Category.BREAKFAST).forEach(System.out::println);
		
	}

}

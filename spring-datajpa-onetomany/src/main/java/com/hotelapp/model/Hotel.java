package com.hotelapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


@Entity
@NamedQuery(name="readByCat",
            query="from Hotel h inner join h.itemList i where i.category=?1")
public class Hotel {
	
	@Id
	@GeneratedValue(generator="hotel_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="hotel_gen", sequenceName = "hotel_sequence",initialValue = 100,allocationSize = 1)
	private Integer hotelId;
	
	@Column(length=20)
	private String name;
	
	@Column(length=20)
	@Enumerated(value = EnumType.STRING)
	private Type type;
	
	@Column(length=20)
	private String city;
	
	private double rating;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="hotel_id")
	private Set<Item> itemList;

	public Hotel() {
		super();
	}

	public Hotel(String name, Type type, String city, double rating, Set<Item> itemList) {
		super();
		this.name = name;
		this.type = type;
		this.city = city;
		this.rating = rating;
		this.itemList = itemList;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Set<Item> getItemList() {
		return itemList;
	}

	public void setItemList(Set<Item> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", name=" + name + ", type=" + type + ", city=" + city + ", rating="
				+ rating + "]";
	}
	
	
	

}

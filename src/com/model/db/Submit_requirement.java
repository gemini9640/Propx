package com.model.db;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "submit_requirement", catalog = "propx")
@org.hibernate.annotations.Entity(dynamicUpdate = true, dynamicInsert = true)
public class Submit_requirement implements java.io.Serializable {
		private Integer id;
		private String buy_sell;
		private String from_place;
		private String fullname;
		private String contact;
		private String email;
		private String title_type;
		private String size;
		private String propery_type;
		private String price;
		private String bedrooms;
		private String bathrooms;
		private String parking_lot;
		public Submit_requirement() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Submit_requirement(String buy_sell, String from_place, String fullname, String contact, String email,
				String title_type, String size, String propery_type, String price, String bedrooms, String bathrooms,
				String parking_lot) {
			super();
			this.buy_sell = buy_sell;
			this.from_place = from_place;
			this.fullname = fullname;
			this.contact = contact;
			this.email = email;
			this.title_type = title_type;
			this.size = size;
			this.propery_type = propery_type;
			this.price = price;
			this.bedrooms = bedrooms;
			this.bathrooms = bathrooms;
			this.parking_lot = parking_lot;
		}

		public Submit_requirement(Integer id, String buy_sell, String from_place, String fullname, String contact,
				String email, String title_type, String size, String propery_type, String price, String bedrooms,
				String bathrooms, String parking_lot) {
			super();
			this.id = id;
			this.buy_sell = buy_sell;
			this.from_place = from_place;
			this.fullname = fullname;
			this.contact = contact;
			this.email = email;
			this.title_type = title_type;
			this.size = size;
			this.propery_type = propery_type;
			this.price = price;
			this.bedrooms = bedrooms;
			this.bathrooms = bathrooms;
			this.parking_lot = parking_lot;
		}
		@Id
		@GeneratedValue(strategy = IDENTITY)
		@javax.persistence.Column(name = "id")
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		@javax.persistence.Column(name = "buy_sell")
		public String getBuy_sell() {
			return buy_sell;
		}
		public void setBuy_sell(String buy_sell) {
			this.buy_sell = buy_sell;
		}
		
		@javax.persistence.Column(name = "from_place")
		public String getFrom_place() {
			return from_place;
		}
		public void setFrom_place(String from_place) {
			this.from_place = from_place;
		}
		
		@javax.persistence.Column(name = "fullname")
		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		
		@javax.persistence.Column(name = "contact")
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		
		@javax.persistence.Column(name = "email")
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		@javax.persistence.Column(name = "title_type")
		public String getTitle_type() {
			return title_type;
		}
		public void setTitle_type(String title_type) {
			this.title_type = title_type;
		}
		
		@javax.persistence.Column(name = "size")
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		
		@javax.persistence.Column(name = "propery_type")
		public String getPropery_type() {
			return propery_type;
		}
		public void setPropery_type(String propery_type) {
			this.propery_type = propery_type;
		}
		
		@javax.persistence.Column(name = "price")
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		
		@javax.persistence.Column(name = "bedrooms")
		public String getBedrooms() {
			return bedrooms;
		}
		public void setBedrooms(String bedrooms) {
			this.bedrooms = bedrooms;
		}
		
		@javax.persistence.Column(name = "bathrooms")
		public String getBathrooms() {
			return bathrooms;
		}
		public void setBathrooms(String bathrooms) {
			this.bathrooms = bathrooms;
		}
		
		@javax.persistence.Column(name = "parking_lot")
		public String getParking_lot() {
			return parking_lot;
		}
		public void setParking_lot(String parking_lot) {
			this.parking_lot = parking_lot;
		}
		@Override
		public String toString() {
			return "Submit_requirement [id=" + id + ", buy_sell=" + buy_sell + ", from_place=" + from_place
					+ ", fullname=" + fullname + ", contact=" + contact + ", email=" + email + ", title_type="
					+ title_type + ", size=" + size + ", propery_type=" + propery_type + ", price=" + price
					+ ", bedrooms=" + bedrooms + ", bathrooms=" + bathrooms + ", parking_lot=" + parking_lot + "]";
		}
		
		
}

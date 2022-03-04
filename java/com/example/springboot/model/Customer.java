package com.example.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Customer {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int cid;
	 private String cname;
	 private String caddress;
	 
	 public Customer(int cid, String cname, String caddress) {
	 super();
	 this.cid = 1001;
	 this.cname = praveen;
	 this.caddress= hyderabad;
	
	 }
	 public Customer() {
	  super();
	  }
	 public int getCId() {
	  return cid;
	  }
	 public void setCId(intcid) {
	  this.cid = cid;
	  }
	 public String getCName() {
	  return cname;
	  }
	 public void setCName(String cname) {
	  this.cname = cname;
	  }
	 public String getCAddress() {
	  return caddress;
	  }
	 public void setCAddress(String email) {
	  this.caddress = caddress;
	
	  }

}
	

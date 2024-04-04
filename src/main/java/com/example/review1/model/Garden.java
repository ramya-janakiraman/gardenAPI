package com.example.review1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Garden {
     @Id
     private int eid;
     public int getEid() {
      return eid;
    }
    public void setEid(int eid) {
      this.eid = eid;
    }
    private String fname;
     private String lname;
     private String email;
     private String gardenname;
     private int price;
     private String product;
     private String address;
     private int phno ;
     private int pincode;
    public Garden() {
    }
    public Garden(int eid, String fname, String lname, String email, String gardenname, int price, String product,
        String address, int phno, int pincode) {
      this.eid = eid;
      this.fname = fname;
      this.lname = lname;
      this.email = email;
      this.gardenname = gardenname;
      this.price = price;
      this.product = product;
      this.address = address;
      this.phno = phno;
      this.pincode = pincode;
    }
    public String getFname() {
      return fname;
    }
    public void setFname(String fname) {
      this.fname = fname;
    }
    public String getLname() {
      return lname;
    }
    public void setLname(String lname) {
      this.lname = lname;
    }
    public String getEmail() {
      return email;
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public String getGardenname() {
      return gardenname;
    }
    public void setGardenname(String gardenname) {
      this.gardenname = gardenname;
    }
    public int getPrice() {
      return price;
    }
    public void setPrice(int price) {
      this.price = price;
    }
    public String getProduct() {
      return product;
    }
    public void setProduct(String product) {
      this.product = product;
    }
    public String getAddress() {
      return address;
    }
    public void setAddress(String address) {
      this.address = address;
    }
    public int getPhno() {
      return phno;
    }
    public void setPhno(int phno) {
      this.phno = phno;
    }
    public int getPincode() {
      return pincode;
    }
    public void setPincode(int pincode) {
      this.pincode = pincode;
    }
    
    
}
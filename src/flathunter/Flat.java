/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flathunter;

/**
 *
 * @author tylnesh
 */
public class Flat {
    private int price;
    private String desc;
    private String address;
    private int area;
    private String urlAddress;

    public Flat() {
        this.price = 0;
        this.desc = "";
        this.address = "";
        this.area = 0;
        this.urlAddress = "";
    }
    
    public Flat(String address, int price, int area, String desc, String urlAddress) {
        this.address = address;
        this.price = price;
        this.area = area;
        this.desc = desc;
        this.urlAddress = urlAddress;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getUrlAddress() {
        return urlAddress;
    }

    public void setUrlAddress(String urlAddress) {
        this.urlAddress = urlAddress;
    }
    
            
}

package com.maid_coffee.entity;

public class Shop {
    private Integer shopId;
    private String shopName;
    private String slogn;
    private String address;
    private String location;
    private String tel;
    private String openTime;
    private int price;
    private boolean shopusing;
    
    public Integer getShopId() {
        return shopId;
    }
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public String getSlogn() {
        return slogn;
    }
    public void setSlogn(String slogn) {
        this.slogn = slogn;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getOpenTime() {
        return openTime;
    }
    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public boolean isShopusing() {
        return shopusing;
    }
    public void setShopusing(boolean shopusing) {
        this.shopusing = shopusing;
    }

    
}

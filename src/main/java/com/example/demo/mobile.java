package com.example.demo;

public class mobile {
	
private int mobileId;
private String mobileName;
private String mobileCompany;
private int mobilePrice;
public mobile(int mobileId, String mobileName, String mobileCompany, int mobilePrice) {
	super();
	this.mobileId = mobileId;
	this.mobileName = mobileName;
	this.mobileCompany = mobileCompany;
	this.mobilePrice = mobilePrice;
}
public int getMobileId() {
	return mobileId;
}
public void setMobileId(int mobileId) {
	this.mobileId = mobileId;
}
public String getMobileName() {
	return mobileName;
}
public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}
public String getMobileCompany() {
	return mobileCompany;
}
public void setMobileCompany(String mobileCompany) {
	this.mobileCompany = mobileCompany;
}
public int getMobilePrice() {
	return mobilePrice;
}
public void setMobilePrice(int mobilePrice) {
	this.mobilePrice = mobilePrice;
}
@Override
public String toString() {
	return "mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileCompany=" + mobileCompany
			+ ", mobilePrice=" + mobilePrice + "]";
}

}

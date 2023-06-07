package org.example.entities;

public class Customer {
  private int customerId;
  private String customerName;
  private String address;
  private String electricMeterCode;

  public Customer() {
  }

  public Customer(int customerId, String customerName, String address, String electricMeterCode) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.address = address;
    this.electricMeterCode = electricMeterCode;
  }

  public Customer(String customerName, String address, String electricMeterCode) {
    this.customerName = customerName;
    this.address = address;
    this.electricMeterCode = electricMeterCode;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getElectricMeterCode() {
    return electricMeterCode;
  }

  public void setElectricMeterCode(String electricMeterCode) {
    this.electricMeterCode = electricMeterCode;
  }

  @Override
  public java.lang.String toString() {
    return "Customer{" +
        "customerId=" + customerId +
        ", customerName='" + customerName + '\'' +
        ", address='" + address + '\'' +
        ", electricMeterCode='" + electricMeterCode + '\'' +
        '}';
  }
}
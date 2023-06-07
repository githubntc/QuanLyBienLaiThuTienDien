package org.example.entities;

public class Receipt {
  private int receiptId;
  private String electricMeterCode;
  private double oldIndex;
  private double newIndex;
  private double pay;

  public Receipt() {
  }

  public Receipt(int receiptId, String electricMeterCode, double oldIndex, double newIndex,
      double pay) {
    this.receiptId = receiptId;
    this.electricMeterCode = electricMeterCode;
    this.oldIndex = oldIndex;
    this.newIndex = newIndex;
    this.pay = pay;
  }

  public Receipt(String electricMeterCode, double oldIndex, double newIndex, double pay) {
    this.electricMeterCode = electricMeterCode;
    this.oldIndex = oldIndex;
    this.newIndex = newIndex;
    this.pay = pay;
  }

  public int getReceiptId() {
    return receiptId;
  }

  public void setReceiptId(int receiptId) {
    this.receiptId = receiptId;
  }

  public String getElectricMeterCode() {
    return electricMeterCode;
  }

  public void setElectricMeterCode(String electricMeterCode) {
    this.electricMeterCode = electricMeterCode;
  }

  public double getOldIndex() {
    return oldIndex;
  }

  public void setOldIndex(double oldIndex) {
    this.oldIndex = oldIndex;
  }

  public double getNewIndex() {
    return newIndex;
  }

  public void setNewIndex(double newIndex) {
    this.newIndex = newIndex;
  }

  public double getPay() {
    return pay;
  }

  public void setPay(double pay) {
    this.pay = pay;
  }

  @Override
  public String toString() {
    return "Receipt{" +
        "receiptId=" + receiptId +
        ", electricMeterCode='" + electricMeterCode + '\'' +
        ", oldIndex=" + oldIndex +
        ", newIndex=" + newIndex +
        ", pay=" + pay +
        '}';
  }
}

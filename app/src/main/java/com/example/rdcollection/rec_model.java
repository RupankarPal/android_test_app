package com.example.rdcollection;

public class rec_model {

    private String Customername;
    private String Amount;
    private String DueAmount;
    private String prev1;
    private String prev2;
    private String prev3;
    private String pres1;
    private String pres2;

    public void setCustomername(String customername) {
        Customername = customername;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public void setDueAmount(String dueAmount) {
        DueAmount = dueAmount;
    }

    public void setPrev1(String prev1) {
        this.prev1 = prev1;
    }

    public void setPrev2(String prev2) {
        this.prev2 = prev2;
    }

    public void setPrev3(String prev3) {
        this.prev3 = prev3;
    }

    public void setPres1(String pres1) {
        this.pres1 = pres1;
    }

    public void setPres2(String pres2) {
        this.pres2 = pres2;
    }

    public void setPres3(String pres3) {
        this.pres3 = pres3;
    }

    public String getCustomername() {
        return Customername;
    }

    public String getAmount() {
        return Amount;
    }

    public String getDueAmount() {
        return DueAmount;
    }

    public String getPrev1() {
        return prev1;
    }

    public String getPrev2() {
        return prev2;
    }

    public String getPrev3() {
        return prev3;
    }

    public String getPres1() {
        return pres1;
    }

    public String getPres2() {
        return pres2;
    }

    public String getPres3() {
        return pres3;
    }

    private String pres3;

    public rec_model(String Customername, String Amount, String DueAmount, String prev1, String prev2, String prev3,
                     String pres1, String pres2, String pres3) {
        this.Customername = Customername;
        this.Amount = Amount;
        this.DueAmount = DueAmount;
        this.prev1 = prev1;
        this.prev2 = prev2;
        this.prev3 = prev3;
        this.pres1 = pres1;
        this.pres2 = pres2;
        this.pres3 = pres3;
    }
}

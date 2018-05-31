public enum Values {

    PAY_PAL("PayPalPayment"),
    CASH("CashPayment"),
    VISA("VisaPayment");

    private String value;

    Values(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}

public abstract class Medicine {
    //attributes
    private String medicineName;
    private String companyName;
    private String companyEmail;
    private double price;
    private int quantity;
    private int expirationYear;
    Type myType;
    enum Type {
        PILLS,
        SYRUP,
        INHALER
    }

    //constructors

    public Medicine() {
    }

    public Medicine(String medicineName, String companyName, String companyEmail, double price, int quantity, int expirationYear,Type myType) throws InvalidEmailAddressException {
        setMedicineName(medicineName);
        setCompanyName(companyName);
        setCompanyEmail(companyEmail);
        setPrice(price);
        setQuantity(quantity);
        setExpirationYear(expirationYear);
        setMyType(myType);
    }
//setters

    public void setMedicineName(String medicineName) {
              this.medicineName = medicineName.toUpperCase();
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyEmail(String companyEmail) throws InvalidEmailAddressException
    {
        if(companyEmail.startsWith("@"))
            throw new InvalidEmailAddressException(companyEmail,1);
       if(companyEmail.endsWith("@"))
            throw new InvalidEmailAddressException(companyEmail,2);
         if(!companyEmail.contains("@"))
            throw new InvalidEmailAddressException(companyEmail,3);
        if(!companyEmail.split("@")[1].contains("."))
             throw new InvalidEmailAddressException(companyEmail,4);
        this.companyEmail = companyEmail;
        }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setMyType(Type myType) {
        this.myType = myType;
    }
//getters

    public String getMedicineName() {
        return medicineName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public Type getMyType() {
        return myType;
    }

    public String toString() {
        return "medicine-name: " + medicineName + " company-name: " + companyName + " company-email: " + companyEmail + " price: " + price + " quantity: " + quantity + " expiration-year: " + expirationYear + " Type: "+ myType;
    }

    public abstract int totalInventory();

    public  boolean inStock()
    {
        if(this.quantity>0)
            return true;
        else return false;

    }
}

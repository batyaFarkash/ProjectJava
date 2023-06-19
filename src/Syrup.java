public class Syrup extends  Medicine {
    //attributes
    private int bottleContent;
    //constructors

    public Syrup() {
    }



    public Syrup(String medicineName, String companyName, String companyEmail, double price, int quantity, int expirationYear,Type myType ,int bottleContent) throws InvalidEmailAddressException {
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear,myType);
        setBottleContent(bottleContent);
    }

//setter

    public void setBottleContent(int bottleContent) {
        this.bottleContent = bottleContent;
    }

    //getter


    public int getBottleContent() {
        return bottleContent;
    }

    @Override
    public String toString() {
        return super.toString()+ " bottleContent: "+bottleContent;
    }

    @Override
    public int totalInventory() {
       return this.getBottleContent() * this.getQuantity();

    }
}

public class Pills extends Medicine {
    //attribute
    private int numOfPillsInBox;
    //constructors

    public Pills() {
    }

    public Pills(String medicineName, String companyName, String companyEmail, double price, int quantity, int expirationYear,Type myType, int numOfPillsInBox) throws InvalidEmailAddressException {
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear,myType);
        setNumOfPillsInBox(numOfPillsInBox);
    }

    //setter
    public void setNumOfPillsInBox(int numOfPillsInBox) {
        this.numOfPillsInBox = numOfPillsInBox;
    }

    //getter
    public int getNumOfPillsInBox() {
        return numOfPillsInBox;
    }

    @Override
    public String toString() {
        return super.toString()+" numOfPillsInBox: "+numOfPillsInBox;
    }

    @Override
    public int totalInventory() {
        return this.getNumOfPillsInBox()* this.getQuantity();

    }
}

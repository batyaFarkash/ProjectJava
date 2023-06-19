public class Inhaler  extends  Medicine{
    //attributes
    private int amountOfClick;

    public Inhaler() {
    }

    public Inhaler(String medicineName, String companyName, String companyEmail, double price, int quantity, int expirationYear, Type myType, int amountOfClick) throws InvalidEmailAddressException {
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear,myType);
        setAmountOfClick(amountOfClick);
    }

    public void setAmountOfClick(int amountOfClick) {
        this.amountOfClick = amountOfClick;
    }

    public int getAmountOfClick() {
        return amountOfClick;
    }

    @Override
    public String toString() {
        return super.toString()+" amountOfClick: "+amountOfClick;
    }

    @Override
    public int totalInventory() {
        return this.getAmountOfClick()*this.getQuantity();

    }
}

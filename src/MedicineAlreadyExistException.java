public class MedicineAlreadyExistException extends Exception {
    public  MedicineAlreadyExistException(String nameMedicine)
    {
        //super(e);
        System.out.println("ERROR: "+ nameMedicine.toUpperCase()+ " is exist in the inventory");
    }
}

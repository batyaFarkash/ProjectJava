public class MedicineDoesNotExistException extends Exception{
    public  MedicineDoesNotExistException(String medicineName)
    {
        System.out.println("ERROR: medicine  "+medicineName.toUpperCase() + " doesn't exist in the inventory" );
    }
}

import java.util.ArrayList;

public class Inventory {
    ArrayList<Medicine> arrMedicine=new ArrayList<Medicine>();

   //function add new medicine get object
    public void addMedicine(Medicine medicine) throws MedicineAlreadyExistException
    { //for to check if the name exist
        for (Medicine m:arrMedicine) {
                    if (m.getMedicineName() == medicine.getMedicineName())
                    throw new MedicineAlreadyExistException(medicine.getMedicineName());
        }
        arrMedicine.add(medicine);
        System.out.println(medicine.getMedicineName() + " add to invetory");
    }
    //function search Medicine by name get name return object
 public Medicine searchMedicineByName(String nameMedicine) throws MedicineDoesNotExistException
 {
     for ( Medicine m:arrMedicine ) {
         if(m.getMedicineName().equalsIgnoreCase(nameMedicine))
             return m;
     }
     throw new MedicineDoesNotExistException(nameMedicine);
 }

 //function search medicine  by type get type of medicine return arraylist
 public ArrayList<Medicine> searchMedicineByType(Medicine.Type t)
 {
     ArrayList<Medicine> arrMedicineByType= new ArrayList<Medicine>();
     for (Medicine m:arrMedicine) {
         if(m.getMyType()==t)
             arrMedicineByType.add(m);
     }
     return arrMedicineByType;
 }

 public ArrayList<Medicine> getMedicinesInStock()
 {
     ArrayList<Medicine> arrMedicineInStock = new ArrayList<Medicine>();
     for (Medicine m:arrMedicine) {
         if(m.inStock())
             arrMedicineInStock.add(m);

     }
     return arrMedicineInStock;
 }

 }

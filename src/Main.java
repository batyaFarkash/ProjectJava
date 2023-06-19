import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
        Inventory myInventory=new Inventory();
        Medicine m=null;

        // create 3 medicines of each types add them to the inventory
        Pills p1=null,p2=null,p3=null;
        Syrup s1=null,s2=null,s3=null;
        Inhaler i1=null,i2=null,i3=null;
        try {
            p1 = new Pills("Acamol", "Teva", "teva@gmail.com", 28, 50, 2025, Medicine.Type.PILLS, 30);
            p2 = new Pills("rafapen", "Teva", "teva@gmail.com", 15.5, 20, 2023, Medicine.Type.PILLS, 30);
            p3 = new Pills("moxivite forte", "vitamed", "smedicine@vitamed.com", 16.5, 12, 2025, Medicine.Type.PILLS, 20);
            s1 = new Syrup("Acamoli forte", "Teva", "teva@gmail.com", 20, 3, 2027, Medicine.Type.SYRUP, 500);
            s2 = new Syrup("novimol", "cts", "tiptipot@cts.co.il", 23, 0, 2024, Medicine.Type.SYRUP, 300);
            s3 = new Syrup("optalgin", "Teva", "teva@gmail.co.il", 25, 25, 2026, Medicine.Type.SYRUP, 100);
            i1 = new Inhaler("ventolin", "refael", "refael@refael.com", 10.5, 6, 2022, Medicine.Type.INHALER, 6);
            i2 = new Inhaler("sodium 9%", "braun", "medicine@braun.com", 3.5, 60, 2025, Medicine.Type.INHALER, 10);
            i3 = new Inhaler("hyperaz 3%", "teva", "teva@gmail.com", 5.5, 0, 2022, Medicine.Type.INHALER, 10);

        }

          catch (InvalidEmailAddressException e) {
          }

        try {
            myInventory.addMedicine(s1);
            myInventory.addMedicine(s2);
            myInventory.addMedicine(s3);

            myInventory.addMedicine(p1);
            myInventory.addMedicine(p2);
            myInventory.addMedicine(p3);

            myInventory.addMedicine(i1);
            myInventory.addMedicine(i2);
            myInventory.addMedicine(i3);
            }
        catch (MedicineAlreadyExistException maee) {
        }

       // search for a specific medicine by name
        System.out.println();
        try {
           m= myInventory.searchMedicineByName("acamol");
            System.out.println(m.getMedicineName()+" exist in the inventory " + m.totalInventory());
            System.out.println();
             }
        catch (MedicineDoesNotExistException mdnee) {

        }
        //search for all medicines by type
        System.out.println();
        ArrayList<Medicine> ArrMedicine= new ArrayList<>();
        ArrMedicine=myInventory.searchMedicineByType(Medicine.Type.PILLS);
        System.out.println("The "+Medicine.Type.PILLS +" medicine are:");
        for (Medicine mt:ArrMedicine) {
            System.out.print(mt.getMedicineName()+" , ");
            System.out.print(mt.getMedicineName()+" , ");
        }

        //prints all medicines in stock
        System.out.println();
        System.out.println();
        System.out.println("The medicine in the stock:");
        ArrMedicine=myInventory.getMedicinesInStock();
        for (Medicine ms:ArrMedicine) {
            System.out.print(ms.getMedicineName()+" , ");
        }
        System.out.println();
        System.out.println();

        // try to add an existing Medicine to the Inventory
        try
        {
            myInventory.addMedicine(i3);
        } catch (MedicineAlreadyExistException maee) {
        }
        System.out.println();

        //Search for a non-existing Medicine
        try {
          m= myInventory.searchMedicineByName("ferripel");
        } catch (MedicineDoesNotExistException mdnee) {

        }
        System.out.println();

        //Try to add a medicine with an incorrect e-mail
        try {
            Pills  p = new Pills("Acamol", "Teva", "teva.gmail@com", 28, 50, 2025, Medicine.Type.PILLS, 30);
        } catch (InvalidEmailAddressException ieae) {
        }

    }
}


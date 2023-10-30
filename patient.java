class BloodData {
    String bloodType;
    char rhFactor;

    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = '+';
    }

    public BloodData(String bloodType, char rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public char getRhFactor() {
        return rhFactor;
    }
}

class Patient {
    int ID;
    int age;
    BloodData B1;

    public Patient() {
        this.ID = 0;
        this.age = 0;
        this.B1 = new BloodData();
    }

    public Patient(int ID, int age, BloodData B1) {
        this.ID = ID;
        this.age = age;
        this.B1 = B1;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return B1;
    }
}

public class patient {
    public static void main(String[] args) {
        // Create a default patient
        Patient patient1 = new Patient();
        System.out.println("Patient 1 - Default Constructor:");
        System.out.println("ID: " + patient1.getID());
        System.out.println("Age: " + patient1.getAge());
        System.out.println("Blood Type: " + patient1.getBloodData().getBloodType());
        System.out.println("Rh Factor: " + patient1.getBloodData().getRhFactor());
        System.out.println();

        // Create a patient with specific values
        BloodData B12 = new BloodData("A", '-');
        Patient patient2 = new Patient(12345, 30, B12);
        System.out.println("Patient 2 - Overloaded Constructor:");
        System.out.println("ID: " + patient2.getID());
        System.out.println("Age: " + patient2.getAge());
        System.out.println("Blood Type: " + patient2.getBloodData().getBloodType());
        System.out.println("Rh Factor: " + patient2.getBloodData().getRhFactor());
    }
}


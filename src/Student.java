import java.util.Scanner;

public class Student {
    String fullName;
    String phoneNumber;
    String address;
    float bankAccount;

    public String getFullName() { return fullName;}
    public void setFullName(String fullName) { this.fullName = fullName;    }
    public String getPhoneNumber() { return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber;}
    public String getAddress() { return address;}
    public void setAddress(String address) { this.address = address;}
    public float getBankAccount() { return bankAccount;}
    public void setBankAccount(float bankAccount) { this.bankAccount = bankAccount;}

    public void liveln(Apartment[] apartments, Student[] students){
        Apartment apartment = new Apartment();
        float[] floats = apartment.payPerMonth(students, apartments);
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].fullName+" - ");
            if(i > students.length/2) System.out.println((int)students[i].bankAccount / (int)floats[1] + " aй гана жашай алат");
            else System.out.println((int)students[i].bankAccount / (int)floats[0] + " ай гана жашай алат");
        }
    }
    public void changeInfo(Student[] students){
        System.out.println("""
                Кайсыл студенттин данныйларын озгортууну каалайсыз?
                1. Gulumkan
                2. Aizat
                3. Datka
                4. Aijamal
                5. Ainazik
                6. Aliaskar            
                Cан аркылуу танданыз!     
                                """);
        int yourChoice = new Scanner(System.in).nextInt();
        for (int i = 0; i < students.length; i++) {
            if(i+1 == yourChoice){
                System.out.println(STR."""
                        1. \{students[i].getFullName()}
                        2. \{students[i].getPhoneNumber()}
                        3. \{students[i].getAddress()}
                        4. \{students[i].getBankAccount()}
                        Kaйсыл данныйын озгортууну каалайсыз?
                        Суураныч сан аркылуу танданыз!
                        """);
            }
        }
        int yourChoice2 = new Scanner(System.in).nextInt();
        System.out.print("Жааны маанини бениз: ");
        String yourChoice3 = new Scanner(System.in).nextLine();
        switch (yourChoice2){
            case 1: students[yourChoice].setFullName(yourChoice3); break;
            case 2: students[yourChoice].setPhoneNumber(yourChoice3); break;
            case 3: students[yourChoice].setAddress(yourChoice3); break;
            case 4: students[yourChoice].setBankAccount(Float.parseFloat(yourChoice3)); break;
        }
        System.out.println(STR."""
                        1. \{students[yourChoice].getFullName()}
                        2. \{students[yourChoice].getPhoneNumber()}
                        3. \{students[yourChoice].getAddress()}
                        4. \{students[yourChoice].getBankAccount()}
                        Данный игиликтуу ишке ашты!
                        """);
    }

}

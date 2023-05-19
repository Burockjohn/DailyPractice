package day39_DailyReviews.phoneTask;

import java.util.ArrayList;

public class Contacts {

    public ArrayList<PhoneNumber> phoneNumbers = new ArrayList<>();

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public void removePhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.remove(phoneNumber);
    }

    /*

    public void addPhoneNumber(String firstName,String lastName,String phoneNumber){
        phoneNumbers.add(new PhoneNumber(firstName,lastName,phoneNumber));
    }

    public void removePhoneNumber(String firstName){
        phoneNumbers.removeIf(i->i.firstName.equals(firstName));

    }

     */

    public void call(int num) {
        System.out.println("calling " + phoneNumbers.get(num).firstName + "\n" + phoneNumbers.get(num).PhoneNumber);
    }

    public String toString() {
        return "Contacts{" +
                "phoneNumbers=" + phoneNumbers +
                '}';
    }
}

/*

Create a class named Contacts
Instance variables: phoneNumbers (ArrayList of  PhoneNumber)
Default constructor is enough
Actions:addPhoneNumber,removePhoneNumber,call,toString

 */
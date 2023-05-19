package day39_DailyReviews.phoneTask;

import java.util.Arrays;

public class MyPhone {

    public static void main(String[] args) {

        PhoneNumber contact1 = new PhoneNumber("Burak", "Can", 5074560868L);
        PhoneNumber contact2 = new PhoneNumber("Burak", "Yılmaz", 1234567890L);
        PhoneNumber contact3 = new PhoneNumber("Yunus", "Kulcu", 9087654321L);
        PhoneNumber contact4 = new PhoneNumber("Çağlar", "Engin", 51023456789L);
        PhoneNumber contact5 = new PhoneNumber("Ayşe", "Pek", 4321056789L);
        PhoneNumber contact6 = new PhoneNumber("Tuğba", "Bayar", 9876501234L);

        Contacts contacts = new Contacts();
        contacts.addPhoneNumber(contact1);
        contacts.addPhoneNumber(contact2);
        contacts.addPhoneNumber(contact3);
        contacts.addPhoneNumber(contact4);
        contacts.addPhoneNumber(contact5);
        contacts.addPhoneNumber(contact6);

        contacts.call(2);

    }
}

/*

Create a class named MyPhone with a main method

Create a Contacts object and add 6 Phone number in it.

Show user all phone numbers with their order numbers and take an input (order number) from user to call the number

 */
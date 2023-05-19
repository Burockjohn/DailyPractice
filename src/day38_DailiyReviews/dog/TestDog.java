package day38_DailiyReviews.dog;

public class TestDog {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Kuço", 'M', 4);
        Dog dog2 = new Dog("Lucy", 'F', 2);
        Dog dog3 = new Dog("Haydo", 'M', 8);
        Dog dog4 = new Dog("Leo", 'F', 6);
        Dog dog5 = new Dog("Rocky", 'M', 12);
        Dog dog6 = new Dog("Mayk", 'M', 3);

        Dog dogs[] = {dog1, dog2, dog3, dog4, dog5, dog6};

        for (Dog dog : dogs) {
            if (dog.age > 6) {
                dog.bark();
            }

            if (dog.gender == 'F') System.out.println(dog);
        }

    }
}

/*

Create a class named TestDog with a main method
Create an arrayList of Dog objects and add 6 dog objects into arrayList
Call bark method for each dog objects which are older than 6 year old.
Print all female dogs

 */
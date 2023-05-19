package day39_DailyReviews.computer;

import java.util.ArrayList;
import java.util.Arrays;

public class TestComputer {

    public static void main(String[] args) {

        Computer pc1 = new Computer("Huawei", "i7", 25000);
        Computer pc2 = new Computer("Sony", "i3", 25000);
        Computer pc3 = new Computer("Dell", "i7", 25000);
        Computer pc4 = new Computer("Lenovo", "i5", 25000);
        Computer pc5 = new Computer("Monster", "i7", 25000);

        Computer computers[] = {pc1, pc2, pc3, pc4, pc5}; //computers.forEach(Computer::open) -> ArrayList

        System.out.println(Arrays.toString(computers));

        for (Computer computer : computers) {
            computer.open();
            if (computer.cpu.equals("i3")) computer.close();
        }

        Arrays.stream(computers).filter(p -> p.isOpened).forEach(System.out::println);

        System.out.println(pc2);


    }

}

/*

Create a class named TestComputer with a main method

Create 5 Computer objects and open all of them
And then close ones which has i3 cpu
Print opened computers

 */
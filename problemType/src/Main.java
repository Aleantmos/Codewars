import fundamentals.BuildATower;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String[] strings = BuildATower.buildPyramidTower(6);

        for (int i = 0; i < strings.length; i++) {

            System.out.println(strings[i]);

        }
    }
}

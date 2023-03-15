package fundamentals;


public class BuildATower {

    public static String[] buildPyramidTower(int numFloors) {
        String[] tower = new String[numFloors];
        for (int i = 0; i < numFloors; i++) {

            StringBuilder floor = new StringBuilder();

            for (int j = 0; j < numFloors - i - 1; j++) {
                floor.append(" ");
            }

            for (int j = 0; j < i * 2 + 1; j++) {
                floor.append("*");
            }
            tower[i] = floor.toString();
        }

        return tower;
    }
}

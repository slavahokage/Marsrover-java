package company.Mars;

public class MarsRover {

    private int position = 0;
    private int speed = 1;
    private int minNumberOfInstructions;
    private int numberOfInstructions;
    private boolean reverse = false;
    private final int MAX_ITERATIONS = 10000000;

    public int getMinCountOfInstructions(int endPosition) {
        System.out.println("This may take some time, wait plz :)");
        minNumberOfInstructions = firstWay(endPosition);
        for (int i = 0; i < MAX_ITERATIONS; i++) {
            int option = bogoWay(endPosition);
            if (option < minNumberOfInstructions) {
                minNumberOfInstructions = option;
            }
        }

        return minNumberOfInstructions;
    }

    private int bogoWay(int endPosition) {
        while (position != endPosition) {
            long whatToDo = Math.round(Math.random());
            if (whatToDo == 1) {
                speedUp();
            } else {
                rollOver();
            }

            if (numberOfInstructions > minNumberOfInstructions) {
                resetValues();
                return Integer.MAX_VALUE;
            }
        }

        int numberOfInstructionsBogo = numberOfInstructions;
        resetValues();

        return numberOfInstructionsBogo;
    }

    private int firstWay(int endPosition) {
        while (position != endPosition) {
            while (endPosition > position) {
                speedUp();
            }

            if (position > endPosition) {
                rollOver();
                while (position > endPosition) {
                    speedUp();
                }
            }

            if (endPosition > position) {
                rollOver();
            }
        }

        int numberOfInstructionsFirst = numberOfInstructions;
        resetValues();

        return numberOfInstructionsFirst;
    }


    private void resetValues() {
        numberOfInstructions = 0;
        position = 0;
        speed = 1;
    }

    private void speedUp() {
        position += speed;
        speed *= 2;
        numberOfInstructions++;
    }

    private void rollOver() {
        if (!reverse) {
            reverse = true;
            speed = -1;
        } else {
            reverse = false;
            speed = 1;
        }

        numberOfInstructions++;
    }
}
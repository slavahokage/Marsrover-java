package company;

import company.Mars.MarsRover;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MarsRover marsRover = new MarsRover();
        Scanner in = new Scanner(System.in);
        System.out.print("Input end position: ");
        int endPosition = in.nextInt();
        System.out.println("Min count of instructions = "+marsRover.getMinCountOfInstructions(endPosition));
    }
}

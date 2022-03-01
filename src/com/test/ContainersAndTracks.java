package com.test;

import java.util.Scanner;

public class ContainersAndTracks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the track capasity of containers");
        int a = scanner.nextInt()+1;
        System.out.println("Enter the container capasity of boxes");
        int b = scanner.nextInt()+1;
        System.out.println("Enter the box counts");
        int c = scanner.nextInt();
        allVariants(a, b, c);
    }


    public static void allVariants(int trackCapasityContainers, int containerCapasityBoxes, int boxCount) {
        int trackNumber = 1;
        int containerNumber = 1;
        int boxNubmer = 1;

        for (int i = boxCount; i > 0; i--) {
            if (boxNubmer % containerCapasityBoxes == 0)
                containerNumber++;
            if (containerNumber % trackCapasityContainers == 0)
                trackNumber++;

            System.out.println("Track #" + trackNumber);
            System.out.println("Container #" + containerNumber);
            System.out.println("Box #" + boxNubmer);
            System.out.println("____________________________");
            boxNubmer++;

        }
    }
}

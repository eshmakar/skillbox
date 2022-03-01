package com.test;

public class StringManipulations {
    private static final float[] patients = new float[30];
    private static float average = .0f;
    private static int healthy = 0;
    private static float minTemper = .0f;
    private static float maxTemper = .0f;

    public static void main(String[] args) {
        for (int i = 0; i < patients.length; i++) {
            String randomTemperature = String.format("%.2f", (Math.random() * 9 + 32)).replaceAll(",", ".");
            patients[i] = Float.parseFloat(randomTemperature);
        }

        System.out.print("Температуры пациентов: ");
        for (float pacient : patients) {
            System.out.print(pacient + " ");
            average += pacient;
            if (pacient > 36.2 && pacient < 36.9)
                healthy++;
            if (minTemper == .0f)
                minTemper = pacient;
            minTemper = Math.min(minTemper, pacient);
            maxTemper = Math.max(maxTemper, pacient);
        }

        System.out.println("\nСредняя температура: " + String.valueOf(average / 30).substring(0, 5));
        System.out.println("Количество здоровых: " + healthy);
        System.out.println("Минимальная температура: " + minTemper);
        System.out.println("Максимальная температура: " + maxTemper);


    }
}

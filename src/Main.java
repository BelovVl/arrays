import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Задача 1.1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(weight[i]);
        }

        System.out.println(" ");
        System.out.println("Задача 1.2");
        double[] weights = {1.57D, 7.654D, 9.986D};
        for (int n = 0; n < weights.length; n++) {
            System.out.println(weights[n]);
        }

        System.out.println(" ");
        System.out.println("Задача 1.3");
        int[] yearBirthCaesar = {12, 7, 100};
        for (int z = 0; z < yearBirthCaesar.length; z++) {
            System.out.println(yearBirthCaesar[z]);
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задача 2");
        for (int i = 0; i < 3; i++) {
            if (i == weight.length - 1) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }

        for (int n = 0; n < weights.length; n++) {
            if (n == weights.length - 1) {
                System.out.print(weights[n]);
                break;
            }
            System.out.print(weights[n] + ", ");
        }


        for (int z = 0; z < yearBirthCaesar.length; z++) {
            if (z == yearBirthCaesar.length - 1) {
                System.out.println(yearBirthCaesar[z]);
                break;
            }
            System.out.print(weights[z] + ", ");
        }
        System.out.println(" ");
        System.out.println("Задача 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int n = weights.length - 1; n >= 0; n--) {
            System.out.print(weights[n]);
            if (n > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int z = yearBirthCaesar.length - 1; z >= 0; z--) {
            System.out.print(yearBirthCaesar[z]);
            if (z > 0) {
                System.out.print(", ");
            }
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задача 4");
        for (int i = 0; i < 3; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] = weight[i] + 1;
            }
        }
        System.out.println(Arrays.toString(weight));

        //Урок 2
        System.out.println(" ");
        System.out.println("Урок 2");
        System.out.println("Задача 1");
        int[] Payments = {12500, 35200, 11000, 500, 10000};
        int sum = 0;
        for (int tools : Payments) {
            sum += tools;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println(" ");
        System.out.println("Задача 2");
        int[] weeklyPayments = {12500, 35200, 11000, 500, 10000};
        int maxPayments = -1;
        for (final int current : weeklyPayments) {
            if (current > maxPayments){
                maxPayments=current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayments + " рублей");
        int minPayments= 100000;
        for(final int current : weeklyPayments){
            if(current < minPayments){
                minPayments=current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayments + " рублей");

        System.out.println(" ");
        System.out.println("Задача 3");
        sum=0;
        for (int tools : Payments) {
            sum += tools;
        }
        sum /= Payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");
    }
}

package acb.week1.additional;

import java.util.Scanner;

public class home12 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Скорость ветра");
        int speed = sv.nextInt();

        if (speed >= 1 && speed <= 4) {
            System.out.println("Ветер: слабый");
        } else if (speed >= 5 && speed <= 10){
            System.out.println("Ветер: умеренный");
        } else if (speed >= 9 && speed <=18) {
            System.out.println("Ветер: сильный");
        } else if (speed >= 19){
            System.out.println("Ветер: ураганный");
        }
    }
}
package com.teachmeskills.lesson3;

public class ConditionalStatement {
    public final static String WINTER = "Зима";
    public final static String SPRING = "Весна";
    public final static String SUMMER = "Лето";
    public final static String AUTUMN = "Осень";
    public final static String INCORRECT = "Вы ввели неверное значение";
    public final static String EVEN_NUMBER = "Четное";
    public final static String ODD_NUMBER = "Нечетное";
    public final static String WARM = "Тепло";
    public final static String FINE = "Нормально";
    public final static String COLD = "Холодно";
    public final static String RED = "Красный";
    public final static String ORANGE = "Оранжевый";
    public final static String YELLOW = "Желтый";
    public final static String GREEN = "Зеленый";
    public final static String SKYBLUE = "Голубой";
    public final static String BLUE = "Синий";
    public final static String PURPLE = "Фиолетовый";

    public void findSeasonByMonthNumberSwitch(int enteredSeason){
        switch (enteredSeason){
            case 3,4,5:
                System.out.println(SPRING);
                break;
            case 6,7,8:
                System.out.println(SUMMER);
                break;
            case 9,10,11:
                System.out.println(AUTUMN);
                break;
            case 12,1,2:
                System.out.println(WINTER);
                break;
            default:
                System.out.println(INCORRECT);
        }
    }

    public void findSeasonByMonthNumberIf(int enteredSeason){
        if (enteredSeason >= 3 && enteredSeason <= 5){
            System.out.println(SPRING);
        } else if (enteredSeason >= 6 && enteredSeason <= 8) {
            System.out.println(SUMMER);
        } else if (enteredSeason >= 9 && enteredSeason <= 11) {
            System.out.println(AUTUMN);
        } else if (enteredSeason == 12 || enteredSeason <= 2 && enteredSeason >= 1) {
            System.out.println(WINTER);
        }
        else {
            System.out.println(INCORRECT);
        }
    }

    public void oddOrEvenNumber(int testNum){
        String result = testNum % 2 == 0 ? EVEN_NUMBER : ODD_NUMBER;
        System.out.print(result + '\n');
    }

    public void warmOrCold(int temperature){
        if (temperature > -5){
            System.out.println(WARM);
        } else if (temperature > -20 ){
            System.out.println(FINE);
        } else if (temperature < -20) {
            System.out.println(COLD);
        }
    }

    public void findRainbowColor(int colorNum){
        switch (colorNum){
            case 1:
                System.out.println(RED);
                break;
            case 2:
                System.out.println(ORANGE);
                break;
            case 3:
                System.out.println(YELLOW);
                break;
            case 4:
                System.out.println(GREEN);
                break;
            case 5:
                System.out.println(SKYBLUE);
                break;
            case 6:
                System.out.println(BLUE);
                break;
            case 7:
                System.out.println(PURPLE);
                break;
            default:
                System.out.println(INCORRECT);
        }
    }
}

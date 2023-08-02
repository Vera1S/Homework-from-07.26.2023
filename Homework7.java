package Homework;

public class Homework7 {
    public static void main(String[] args) {

// Задание 1.
//Напишите программу на Java, чтобы поменять местами значения, хранящиеся в двух переменных,
// без использования третьей переменной.
        // Метод №1
        String var1 = "Hi1";
        String var2 = "Hi2";

        System.out.println("Переменные до обмена: " + var1 + " " + var2 + " Смена мест переменных: " + var2 + " " + var1);

//        Метод №2
        int a = 2;
        int b = 1;
        System.out.println("До обмена: " + " a = " + a + "; b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("После обмена:" + "a = " + a + "; b = " + b);

//        Задание 2.
//Создайте класс WorldState.
//В классе WorldState создайте 7 переменных типа boolean, которые характеризуют "состояние мира".
// В классе WorldState напишите метод isWorldNegativelyGood, который определит с помощью логических
// операторов && || ! и созданных boolean-переменных состояние мира в негативном свете, и вернёт
// boolean-значение(либо выведет).
//В классе WorldState напишите метод isWorldPositivelyGood, который определит с помощью логических
// операторов && || ! и созданных boolean-переменных состояние мира в позитивном свете, и вернёт
// boolean-значение(либо выведет).
//Вызовите этим методы из класса Main.

        WorldState7 worldState7 = new WorldState7(false, false, false, true, true, true, false);



                boolean isNegativelyGood = worldState7.isWorldNegativelyGood();
                boolean isPositivelyGood = worldState7.isWorldPositivelyGood();

                System.out.println("Состояние мира в негативном свете: " + isNegativelyGood);
                System.out.println("Состояние мира в позитивном свете: " + isPositivelyGood);
            }
        }








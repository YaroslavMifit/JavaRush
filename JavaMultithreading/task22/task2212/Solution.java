package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {

            boolean is = false;
            // проверка на null
            if (telNumber == null)
            {
                return false;
            }
            // проверка на состав и окончание
            //ограничиваем состав: отсекаем все, что содержит нецифры, нескобки и не минус, а также проверка на окончание цифрой;
            if (!telNumber.matches("[\\d,\\+,\\(,\\),-]+[\\d]$"))
            {
                return false;
            }

            // проверка - на начальный символ и количество цифирь
            if (telNumber.matches("\\+.*")) { //если начинается с + - считаем цифири
                String tmp = telNumber.replaceAll("\\D", "");
                if (tmp.length() != 12) {

                    return false;
                }
            }
            else if (telNumber.matches("\\(|\\d.*")) { //если начинается с "(" или цифры - считаем цифири
                String tmp = telNumber.replaceAll("\\D", "");
                if (tmp.length() != 10) {

                    return false;
                }
            }
            // возвращаем false если ничего из вышеперечисленного не подошло и номер не начинается с "-"
            // цифры для номера, начинающегося с "-" не считаю, т.к в условии не известно, сколько их.
            else if (!telNumber.matches("^\\-.*"))
            {
                return false;
            }

            // сюда поступает только номер с нормальным началом, окончанием и количеством цифр.
            //Здесь будем разбираться с внутренностями.
            if (telNumber.matches("\\+?\\d*(\\(\\d{3}\\))?\\d?-?\\d+-?\\d*")) {
                is = true;
            }
            return is;
        }

    public static void main(String[] args) {
        System.out.println(checkTelNumber("+380501234567"));
        System.out.println(checkTelNumber("+38(050)1234567"));
        System.out.println(checkTelNumber("+38050123-45-67"));
        System.out.println(checkTelNumber("050123-4567"));
        System.out.println(checkTelNumber("+38)050(1234567"));
        System.out.println(checkTelNumber("+38(050)1-23-45-6-7"));
        System.out.println(checkTelNumber("050ххх4567"));
        System.out.println(checkTelNumber("050123456"));
        System.out.println(checkTelNumber("(0)501234567"));

        System.out.println(checkTelNumber("+38(050)12-34-567"));
    }
}

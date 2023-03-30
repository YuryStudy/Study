package ru.javalang.module03;

public class UserException {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("Генерация исключения");
        }
        catch (NullPointerException e) {
            System.out.println("перехватили исключение: " + e);
            throw e;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(" Задание 1,2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = " Ivanov Ivan Ivanovich";
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника " + fullName.toUpperCase());

        System.out.println(" Задача 3");
        String fullNameTwo = " Иванов Семён Семёнович";
        fullNameTwo = fullNameTwo.replace("ё", "е");
        System.out.println(fullNameTwo);


    }
}
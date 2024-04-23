import java.util.*;

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    List<String> listA = new ArrayList<>();
    List<String> listB = new ArrayList<>();

    System.out.println("Введите 5 строк для списка А:");
    for (int i = 0; i < 5; i++) {
        String line = scanner.nextLine();
        listA.add(line);
    }

    // Отображаем список А
    System.out.println("Список А:");
    System.out.println(listA);

    // Считываем еще 5 строк от пользователя и сохраняем их в список Б
    System.out.println("\nВведите 5 строк для списка Б:");
    for (int i = 0; i < 5; i++) {
        String line = scanner.nextLine();
        listB.add(line);
    }

    // Отображаем список Б
    System.out.println("Список Б:");
    System.out.println(listB);

    // Объединяем списки А и Б в список С
    List<String> listC = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
        listC.add(listA.get(i));
        listC.add(listB.get(4 - i));
    }


    System.out.println("\nСписок С после объединения:");
    System.out.println(listC);


    Collections.sort(listC, Comparator.comparingInt(String::length));


    System.out.println("\nОтсортированный список С:");
    System.out.println(listC);

    scanner.close();
}
}

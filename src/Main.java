import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> rList = new ArrayList<>();
        List<Integer> nList = new ArrayList<>();
        Random randomNum = new Random();
//        task1(rList, nList, randomNum);
        task2(rList, randomNum);
    }


    static void task1(List<Integer> list1, List<Integer> list2, Random randomNumber) {
        //Пусть дан произвольный список целых чисел, удалить из него четные числа
        for (int i = 0; i < 10; i++) {
            list1.add(randomNumber.nextInt(100));
        }
        System.out.println("Оригинальный список " + list1);
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                list2.add(list1.get(i));
                list1.remove(i);
                i--;
            }
        }
        System.out.println("Фильтрованный список " + list1);
        System.out.println("Удалённые числы из списка " + list2);
    }

    static void task2(List<Integer> list1, Random randomNumber) {
        /*
        Задан целочисленный список ArrayList.Найти минимальное, максимальное и среднее арифметическое из этого списка.
        Collections.max()
         */
        Scanner getOperation = new Scanner(System.in);
        System.out.println("Введите операцию(min, max или average ... ");
        String stringTerminal = getOperation.next();
        for (int i = 0; i < 10; i++) {
            list1.add(randomNumber.nextInt(100));
        }
        if (stringTerminal.equals("min")) {
            int minN = Collections.min(list1);
            System.out.println("Минимальное число из списка " + list1);
            System.out.println(minN);
        } else if (stringTerminal.equals("max")) {
            System.out.println("Максимальное число из списка " + list1);
            int maxN = Collections.max(list1);
            System.out.println(maxN);
        } else if (stringTerminal.equals("average")) {
            double averageN = 0;
            for (int i = 0; i < list1.size(); i++) {
                averageN += list1.get(i);
            }
            averageN = averageN / list1.size();
            System.out.println("Среднее Арифметическое число из списка " + list1);
            System.out.println(averageN);
        }

    }
}
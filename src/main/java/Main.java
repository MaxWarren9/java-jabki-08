
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1а. Вывести элементы списка из динамического массива размером 5.
        List<Integer> arrayList = new ArrayList<>(5);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(25);
        arrayList.add(90);
        arrayList.add(130);
        printListWithSemicolon(arrayList);

        //1б. Вывести элементы списка из связанного массива размером 5.
        List<Integer> linkedList = new LinkedList<>(arrayList);
        linkedList.removeFirst();
        linkedList.addFirst(7);
        linkedList.removeLast();
        linkedList.addLast(42);
        printListWithSemicolon(linkedList);

        // 2. Выведите 3 элемент списка
        System.out.println(arrayList.get(2));
        System.out.println(linkedList.get(2));

        // 3.Удалите второй элемент списка и выведите оставшиеся
        arrayList.remove(1);
        linkedList.remove(1);
        printListWithSemicolon(arrayList);
        printListWithSemicolon(linkedList);

        // 4. Найдите сумму всех чисел в списке
        System.out.println(sumAllElements(arrayList));

        // 5. Подсчитайте, сколько раз в списке встречается число 7
        System.out.println(findCountOfInt7(arrayList));

        // 6. Проверьте, содержится ли число 42 в списке
        System.out.println(arrayList.contains(42));

        // 7. Найдите и выведите минимальное и максимальное число в списке
        System.out.println(Collections.min(arrayList));
        System.out.println(Collections.min(linkedList));

        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.max(linkedList));

        // 8. Удалите из списка все числа, делящиеся на 2.
        arrayList.removeIf(element -> element % 2 == 0);
        linkedList.removeIf(element -> element % 2 == 0);

        // 9. Создайте список из массива
        int[] arr = {1, 2, 3, 4};
        List<Integer> arrayList2 = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        arrayList2.add(1);
        printListWithSemicolon(arrayList2);

        // 10. Найдите количество элементов, больше чем число N
        printListWithSemicolon(arrayList);
        System.out.println(findAmountOfElementsBiggerThanGivenNumber(10, arrayList));


        // 11. Создайте список строк. Выведите строки, длина которых больше 5
        List<String> stringList = new ArrayList<>();
        stringList.add("Обь");
        stringList.add("Лена");
        stringList.add("Хуанхэ");
        stringList.add("Нева");
        stringList.add("Москва-река");
        stringList.add("Амур");
        for (String str : stringList) {
            if (str.length() > 5) {
                System.out.println(str);
            }
        }

        // 12. Напишите метод, который возвращает список в обратном порядке
        reverseList(arrayList);

        // 13. Даны два списка. Объедините их в один, не добавляя повторы
        printListWithSemicolon(joinTwoLists(stringList, arrayList));

        // 14. Считайте List<Integer> и посчитайте сумму только нечётных чисел
        sumAllEvenElements(arrayList);

        // 15. Дан список строк. Верните новый список, содержащий только строки, начинающиеся с буквы "А"
        createListWithAWords(stringList);

    }

    public static void printListWithSemicolon(List<?> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.getLast());
    }

    public static int sumAllElements(List<Integer> list) {
        int sum = 0;
        for (int e : list) {
            sum += e;
        }
        return sum;
    }

    public static int findCountOfInt7(List<Integer> list) {
        int count = 0;
        for (int e : list) {
            if (e == 7) {
                count++;
            }
        }
        return count;
    }

    public static int findAmountOfElementsBiggerThanGivenNumber(int num, List<Integer> list) {
        int amount = 0;
        for (int e : list) {
            if (e > num) {
                amount++;
            }
        }
        return amount;
    }

    public static void reverseList(List<Integer> list) {
        Collections.reverse(list);
        printListWithSemicolon(list);
    }

    public static void sumAllEvenElements(List<Integer> list) {
        int sum = 0;
        for (int e : list) {
            if (e % 2 != 0) {
                sum += e;
            }
        }
        System.out.println(sum);
    }

    public static List<String> createListWithAWords(List<String> stringList) {
        List<String> filteredList = new ArrayList<>();
        for (String str : stringList) {
            if (str.startsWith("А")) {
                filteredList.add(str);
                System.out.println(str);
            }
        }
        return filteredList;
    }

    public static List<?> joinTwoLists(List<?> list, List<?> list2) {
        HashSet<Object> uniqueSet = new HashSet<>(list);
        for (Object object: list2) {
           uniqueSet.add(object);
        }
        return uniqueSet.stream().toList();
    }
}


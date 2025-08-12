import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    public void allTestsForIntegerArray() {
        ArrayList<Integer> arrayList = new ArrayList<>(3);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(25);
        Assertions.assertEquals(3, arrayList.size());
        Assertions.assertEquals(5, arrayList.get(1));
        arrayList.remove(1);
        Assertions.assertEquals(2, arrayList.size());
        Assertions.assertEquals(25, arrayList.get(1));
        Assertions.assertEquals(26, Main.sumAllElements(arrayList));
        Assertions.assertEquals(0, Main.findCountOfInt7(arrayList));
        Assertions.assertEquals(1, Main.findAmountOfElementsBiggerThanGivenNumber(10, arrayList));
    }

    @Test
    public void allTestsOnStringArray() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Обь");
        stringList.add("Лена");
        List<String> stringList2 = new ArrayList<>();
        stringList.add("Хуанхэ");
        stringList.add("Нева");
        stringList.addAll(stringList2);
        Assertions.assertTrue(stringList.contains("Нева"));
        Assertions.assertEquals(0, Main.createListWithAWords(stringList).size());
    }
}

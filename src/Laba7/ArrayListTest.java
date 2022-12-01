package Laba7;
import java.util.ArrayList;

public class ArrayListTest{
    public static void maim(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Турция");
        states.add("Россия");
        states.add("мексика");
        states.add("Финляндия");
        states.add("Испания");
        states.add(1, "Франция");
        for (String state : states) {
            System.out.print(state + " ");
        }
        System.out.println(states.get(1));
        states.set(1, "Белоруссия");
        states.remove("мексика");
        if(states.contains("Франция")){
            System.out.println("список содержит государство Франция");
        }

    }
}

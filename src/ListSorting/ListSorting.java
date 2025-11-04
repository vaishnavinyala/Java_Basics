package ListSorting;
import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Violet");
        colors.add("Pink");
        Collections.sort(colors);
        System.out.println(colors);
        for(String color : colors){
            System.out.println(color);
        }


    }
}

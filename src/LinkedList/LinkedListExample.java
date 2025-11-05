package LinkedList;


import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        var animals = new LinkedList<String>();
        animals.add("Elephant");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Goat");
        System.out.println(animals);
        for(String animal : animals){
            System.out.println(animal);
        }
        animals.addFirst("Dog");
        animals.addLast("Cat");
        System.out.println("After adding elements:"+animals);
        animals.removeFirst();
        animals.removeLast();

        System.out.println("After removing elements: " + animals);
        animals.add(animals.getFirst());
        animals.add(animals.getLast());
        animals.remove(animals);




    }
}

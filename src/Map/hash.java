package Map;
import java.util.HashMap;
    public class hash {
        public static  void main(String[] args) {
            HashMap<String,Integer> fruits =new HashMap<String,Integer>();
            fruits.put( "apple",1);
            fruits.put("banana",23);
            fruits.put("mango",81);
            System.out.println(fruits);
            fruits.remove("apple",1);
            System.out.println(fruits);
            fruits.clear();
            System.out.println(fruits);
            fruits.size();
            System.out.println(fruits);
        }

    }




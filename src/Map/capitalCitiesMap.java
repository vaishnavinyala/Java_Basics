package Map;

import java.util.LinkedHashMap;

public class capitalCitiesMap {
    public static void main(String[] args) {
        LinkedHashMap<String,String> capitalCities=new LinkedHashMap<>();
        capitalCities.put(" USA","washingtong");
        capitalCities.put("india"," new dehli");
        capitalCities.put("England"," londan");
        System.out.println(capitalCities);
        for(String key:capitalCities.keySet()){
            System.out.println(capitalCities.get(key));
        }
        capitalCities.remove("USA");
        System.out.println(capitalCities);
        capitalCities.clear();
        System.out.println(capitalCities);
        capitalCities.get("USA");
        System.out.println(capitalCities);
    }
}

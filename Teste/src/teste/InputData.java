package teste;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class InputData {

    protected static List<Item> items = Arrays.asList(new Item("Aventura"), new Item("Autoajuda"), new Item("Biografia"), new Item("Horror"), new Item("Aventura"), new Item("Epico"), new Item("Conto"), new Item("Algum outro que ninguem se importa"));

    public static Map<Usuario, HashMap<Item, Double>> initializeData(int numberOfUsers) {
        Map<Usuario, HashMap<Item, Double>> data = new HashMap<>();
        HashMap<Item, Double> newUser;
        Set<Item> newRecommendationSet;
        for (int i = 0; i < numberOfUsers; i++) {
            newUser = new HashMap<Item, Double>();
            newRecommendationSet = new HashSet<>();
            for (int j = 0; j < 3; j++) {
                newRecommendationSet.add(items.get((int) (Math.random() * 5)));
            }
            for (Item item : newRecommendationSet) {
                newUser.put(item, Math.random());
            }
            data.put(new Usuario("Usuario " + i), newUser);
        }
        return data;
    }

}


package train;

import java.util.HashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {
        // UC3: Track Unique Bogie IDs (Set – HashSet)
        Set<String> bogieIds = new HashSet<>();
        
        System.out.println("============================");
        System.out.println(" UC3 - Track Unique Bogie IDs");
        System.out.println("============================\n");
        
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");
        
        // Add duplicates
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds + "\n");
        
        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");
        
        System.out.println("UC3 uniqueness validation completed...");
    }
}

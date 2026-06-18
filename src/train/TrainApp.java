package train;

import java.util.LinkedHashSet;

public class TrainApp {

    public static void main(String[] args) {
        // UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();
        
        System.out.println("======================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies");
        System.out.println("======================================\n");
        
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        
        // Add duplicate
        trainFormation.add("Sleeper");
        
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation + "\n");
        
        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.\n");
        
        System.out.println("UC5 formation setup completed...");
    }
}

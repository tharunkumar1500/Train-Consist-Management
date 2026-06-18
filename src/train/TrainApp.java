package train;

import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {
        // UC1: Initialize Train and Display Consist Summary
        List<String> trainConsist = new ArrayList<>();
        
        System.out.println("======================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("======================================\n");
        
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist + "\n");
        
        System.out.println("System ready for operations...");
    }
}

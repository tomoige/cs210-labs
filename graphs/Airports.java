import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class Airports {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        // Read csv file and store in graph
        graph = readCsv("airports.csv");
        System.out.println(graph);
    }

    public static Map<String, List<String>> readCsv(String path){
        Map<String, List<String>> graph = new HashMap<>();
        try {
            // Read the entire content of the file
            String text = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8).toLowerCase();
            
            // Process the CSV data (assuming it's comma-separated)
            String[] lines = text.split("\n");
            
            // Example of parsing each line (assuming airport code pairs represent directed edges in the graph)
            for (String line : lines) {
                String[] columns = line.split(",");  // Split by comma
                
                if (columns.length >= 2) {
                    String airport1 = columns[0].trim(); // Take the first airport code
                    String airport2 = columns[1].trim(); // Take the second airport code
                    
                    // Add to the graph, only the direct relationship (airport1 -> airport2)
                    graph.computeIfAbsent(airport1, k -> new ArrayList<>()).add(airport2);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return graph;
    }

}
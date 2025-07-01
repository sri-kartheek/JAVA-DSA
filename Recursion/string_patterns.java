
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> inputByLine = new ArrayList<String>();
        try {
            // Get the object of DataInputStream
            InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            while ((line = br.readLine()) != null) {
                inputByLine.add(line.toString());
            }
            
            // Process each input line
            for (String line2 : inputByLine) {
                processCharacterGrouping(line2);
            }
            isr.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    // Method to process character grouping
    public static void processCharacterGrouping(String word) {
        // First line: Group consecutive identical characters
        List<String> groups = new ArrayList<>();
        if (word.length() > 0) {
            StringBuilder currentGroup = new StringBuilder();
            currentGroup.append(word.charAt(0));
            
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) == word.charAt(i-1)) {
                    // Same character as previous, add to current group
                    currentGroup.append(word.charAt(i));
                } else {
                    // Different character, save current group and start new one
                    groups.add(currentGroup.toString());
                    currentGroup = new StringBuilder();
                    currentGroup.append(word.charAt(i));
                }
            }
            // Add the final group
            groups.add(currentGroup.toString());
        }
        
        // Print first line (consecutive character groups)
        System.out.println(String.join(",", groups));
        
        // Second line: Count each character in alphabetical order
        Map<Character, Integer> charCounts = new TreeMap<>();
        for (char c : word.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        
        // Build second line output
        List<String> countStrings = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            countStrings.add(entry.getKey() + ":" + entry.getValue());
        }
        
        // Print second line (character counts)
        System.out.println(String.join(",", countStrings));
    }
}


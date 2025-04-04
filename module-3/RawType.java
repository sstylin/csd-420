//Steve Stylin module 3: Raw Generic Types for Backward Compatibility
public class RawType {
    public static void main(String[] args) {
        Box rawBox = new Box(); // Raw type
        rawBox.setItem("No compile-time error, but unsafe"); 
        String item = (String) rawBox.getItem(); // Requires casting
        System.out.println(item);
    }
}

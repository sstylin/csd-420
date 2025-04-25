// Steve Stylin Module 8 DIscussion Board
public class StringExample {
    public static void main(String[] args) {
        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Module 8");
        stringBuilder.append(" Discussion Board!");
        System.out.println("StringBuilder: " + stringBuilder.toString());

        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Module 8");
        stringBuffer.append(" Discussion Board!");
        System.out.println("StringBuffer: " + stringBuffer.toString());
    }
}

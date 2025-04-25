// Steve Stylin Module 8: Discussion Board
public class StringPerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        // Testing StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("Module 8 DIscussion Board");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder execution time: " + (endTime - startTime) + " ns");

        // Testing StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("Module 8 Discussion Board");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer execution time: " + (endTime - startTime) + " ns");
    }
}

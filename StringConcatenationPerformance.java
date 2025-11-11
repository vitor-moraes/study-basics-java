public class StringConcatenationPerformance{
    public static void main(String[] args){ 
        String slowConcat = "Hello";
        long startTimeToSlowConcat = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            slowConcat += "Hello";
        }
        long durationToSlowConcat = System.currentTimeMillis() - startTimeToSlowConcat;
        long startTimeToFastConcat = System.currentTimeMillis();  
        StringBuilder sb = new StringBuilder("Hello");
        for(int i = 0; i < 10000; i++){
            sb.append("Hello");
        }
        long durationToFastConcat = System.currentTimeMillis() - startTimeToFastConcat;

        System.out.println("String concatenation time: " + durationToSlowConcat + " ms.");
        System.out.println("StringBuilder concatenation time: " + durationToFastConcat + " ms.");
    }
}
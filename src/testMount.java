import java.util.HashMap;

public class testMount {
    public static void   testMap() {
        HashMap<String, HashMap<Integer, Integer>> testMount = new HashMap<>();
        HashMap<Integer, Integer> testDays = new HashMap<>();

        testDays.put(1, 3000);
        testDays.put(2, 2000);
        testDays.put(3, 5000);
        testDays.put(4, 9000);
        testDays.put(5, 12000);
        testDays.put(6, 15000);
        testDays.put(7, 12000);
        testDays.put(8, 8000);
        testDays.put(9, 7000);
        testDays.put(10, 20000);
        testDays.put(11, 1000);

        testMount.put("Январь", testDays);
        StepTracker.resultStep = testMount;
    }
}

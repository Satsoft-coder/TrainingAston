package by.pleshki.model;

import java.util.ArrayList;
import java.util.List;

public class Arhive {
    static List<TestResult>testResults=new ArrayList<>();

    public static void addArhive (TestResult result) {
        testResults.add(result);
    }

    public static List<TestResult> getTestResults() {
        return testResults;
    }
}

package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maxForTwo = 0;
        maxForTwo = first > second ? first: second;
        int result = 0;
        result = maxForTwo > third ? maxForTwo: third;
        System.out.println(result);

    }
}


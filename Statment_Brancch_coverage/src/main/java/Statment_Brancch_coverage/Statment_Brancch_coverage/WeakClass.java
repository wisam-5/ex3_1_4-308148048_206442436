package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	
    public static int WeakMethod1(int x, int y) {
        return x / y; // תזרוק ArithmeticException במקרה של חלוקה באפס
    }
    
    public static int WeakMethod2(int x, int y) {
        if (x > 5) {
            return x + 10;
        } else {
            return x / y; 
        }
    }
    
}




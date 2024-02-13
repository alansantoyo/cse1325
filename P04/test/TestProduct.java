/* This solution is NOT mine; solution by Professor George Rice */
package test;
import store.Product;
import store.Plant;
import store.Tool;
import store.Exposure;

public class TestProduct {
    public static void main(String[] args) {
        int vector = 1;
        int result = 0;

        // TEST VECTOR: Throws IllegalArgumentException on negative price
        try {
            Plant p = new Plant("Bad", -1,Exposure.SUN);
            System.err.println("FAIL: Plant accepted negative price");
            result |= vector;
        } catch(IllegalArgumentException e) {
        } catch(Exception e) {
            System.err.println("FAIL: Plant threw wrong exception on negative price:\n" + e);
            result |= vector;
        }
        vector <<= 1;

        // TEST VECTOR: Creates correct stock numbers
        Plant p1 = new Plant("Valiant Apricot Vinca", 1195,Exposure.PARTSUN);
        Plant p2 = new Plant("Valiant Lilac Vinca", 1295,Exposure.SHADE);
        if(p1.getStockNumber() != 0 || p2.getStockNumber() != 1) {
            System.err.println("FAIL: Incorrect Plant stock number "
                             + p1.getStockNumber() + " (0 expected) or "
                             + p2.getStockNumber() + " (1 expected)");
            result |= vector;
        }
        vector <<= 1;

        // TEST VECTOR: Returns correct prices
        if(p1.getPrice() != 1195 || p2.getPrice() != 1295) {
            System.err.println("FAIL: Incorrect Plant price "
                             + p1.getPrice() + " (1195 expected) or "
                             + p2.getPrice() + " (1295 expected)");
            result |= vector;
        }
        vector <<= 1;

        // TEST VECTOR: Creates correct String representation
        String p1Expected = "Valiant Apricot Vinca          $   11.95";
        if(!p1.toString().equals(p1Expected)) {
            System.err.println("FAIL: Incorrect Plant toString:");
            System.err.println("  returned '" + p1 + "'");
            System.err.println("  expected '" + p1Expected + "'");
            result |= vector;
        }

        if(result != 0) {
            System.err.println("\nFAILED with error code " + result);
            System.exit(result);
        }
    }
}

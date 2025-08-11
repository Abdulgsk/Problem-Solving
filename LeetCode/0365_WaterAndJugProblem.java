public class Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        // If target is greater than the sum of both jugs, it's impossible
        if (jug1Capacity + jug2Capacity < targetCapacity) {
            return false;
        }
        
        // If target is 0, it's always possible (both jugs are empty)
        if (targetCapacity == 0) {
            return true;
        }
        
        // If target is equal to any of the jugs, it's possible
        if (targetCapacity == jug1Capacity || targetCapacity == jug2Capacity) {
            return true;
        }
        
        // If target is the sum of both jugs, it's possible
        if (targetCapacity == jug1Capacity + jug2Capacity) {
            return true;
        }
        
        // The problem reduces to checking if target is divisible by the GCD of the two jugs
        return targetCapacity % gcd(jug1Capacity, jug2Capacity) == 0;
    }
    
    // Helper method to calculate GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

public class Main0 {
    // Generic method to find the maximum of two values
    public static <T extends Comparable<T>> T findMax(T a, T b) {
        return (a.compareTo(b) > 0) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(findMax(3, 5));          // Works for integers
        System.out.println(findMax(3.5, 7.5));      // Works for doubles
        System.out.println(findMax("apple", "pear")); // Works for strings
    }
}

public class BitManipulationExample {
    public static void main(String[] args) {
        int a = 0b10101010; // Binary representation of 170
        int b = 0b11001100; // Binary representation of 204

        // Bitwise AND
        int resultAnd = a & b;

        // Bitwise OR
        int resultOr = a | b;

        // Bitwise XOR
        int resultXor = a ^ b;

        // Bitwise NOT
        int resultNotA = ~a;

        // Left Shift
        int leftShifted = a << 2; // Shift a two positions to the left

        // Right Shift
        int rightShifted = b >> 3; // Shift b three positions to the right

        System.out.println(Integer.toBinaryString(resultAnd)); // Prints '10001000'
        System.out.println(Integer.toBinaryString(resultOr)); // Prints '11101110'
        System.out.println(Integer.toBinaryString(resultXor)); // Prints '1100110'
        System.out.println(Integer.toBinaryString(resultNotA)); // Prints '11111111111111111111111101010101' (32 bits)
        System.out.println(Integer.toBinaryString(leftShifted)); // Prints '1010101000'
        System.out.println(Integer.toBinaryString(rightShifted)); // Prints '11'
    }
}

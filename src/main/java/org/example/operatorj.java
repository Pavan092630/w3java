package org.example;

public class operatorj {
    public static void main(String[] args) {
        //bitwise And Operator
        int a = 5;      // Binary: 0101
        int b = 3;      // Binary: 0011

        a &= b;         // a = a & b
// Binary: 0101 & 0011 = 0001
// a is now 1

       System.out.println(a); // Output: 1


        //bitwise OR Operator
//        int a = 5;      // Binary: 0101
//        int b = 3;      // Binary: 0011
//
//        a |= b;         // a = a | b
//        // a = 0101 | 0011 = 0111 (decimal 7)
//
//        System.out.println(a); // Output: 7



        //XOR operator
//        int a = 5;  // Binary: 0101
//        int b = 3;  // Binary: 0011
//
//        a ^= b; // a = a ^ b
//
//        System.out.println("a = " + a); // Output: a = 6 (Binary: 0110)


        //Xand Operator
//        public class XandExample {
//            public static void main(String[] args) {
//                boolean a = true;
//                boolean b = true;
//                boolean result = !(a ^ b); // Using XOR and NOT to simulate XAND
//                System.out.println("XAND of " + a + " and " + b + " is: " + result); // Output: true
//
//                a = true;
//                b = false;
//                result = !(a ^ b);
//                System.out.println("XAND of " + a + " and " + b + " is: " + result); // Output: false
//
//                a = false;
//                b = false;
//                result = !(a ^ b);
//                System.out.println("XAND of " + a + " and " + b + " is: " + result); // Output: true
//            }
//        }

//        public class UnsignedRightShiftAssignment {
//            public static void main(String[] args) {
//                int a = -8; // Binary representation: 11111111 11111111 11111111 11111000
//                a >>>= 2;  // Unsigned right shift by 2 bits
//                // a is now 1073741822 (Binary: 00111111 11111111 11111111 11111110)
//                System.out.println(a); // Output: 1073741822
//
//                int b = 16; // Binary representation: 00000000 00000000 00000000 00010000
//                b >>>= 3;  // Unsigned right shift by 3 bits
//                // b is now 2 (Binary: 00000000 00000000 00000000 00000010)
//                System.out.println(b); // Output: 2
//            }
//        }


//        public class LeftShiftAssignment {
//            public static void main(String[] args) {
//                int a = 5; // Binary representation: 00000101
//                int b = 2;
//
//                a <<= b; // Equivalent to a = a << b
//                // Shifts the bits of 'a' to the left by 2 positions
//                // 00000101 becomes 00010100, which is 20 in decimal
//
//                System.out.println(a); // Output: 20
//            }
//        }
    }
}

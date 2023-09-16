import java.util.*;

// 1 print the Pattern 
// Solid Rectrngle 
/*public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for (int i = 1; i < n; i++) { // n = row
            for (int j = 1; j < m; j++) { // j = col
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) { // n = row
            for (int j = 1; j < m; j++) { // j = col
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) { // n = row
            for (int j = 1; j < m; j++) { // j = col
                System.out.print(i + " ");
            }
            System.out.println();
        }
        // char ch = 'A';
        // for (int i = 1; i < n; i++) { // n = row
        //     for (int j = 1; j < m; j++) { // j = col
        //         System.out.print(ch + " ");
        //         ch = (char) (ch + 1);
        //     }
        //     System.out.println();
        // }

        
        for (int i = 1; i < n; i++) { // n = row
            char ch = 'A';
            for (int j = 1; j < m; j++) { // j = col
                System.out.print(ch + " ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }

    }
}

 */

/*
// 2. print the pattern
// Hollow Rectangle

// Boundri track
public class Patterns {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                // cell -> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                // cell -> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                // cell -> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }

        // outer loop
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            // inner loop
            for (int j = 1; j <= m; j++) {
                // cell -> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print(ch + " ");
                    ch = (char) (ch + 1);
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }

    }
}

 */

/*
// 3. print the pattern
// Half pyramid
public class Patterns {
    public static void main(String[] args) {
        int n = 4;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // for (int i = n; i >= 1; i--) { // Inverted Half Pyramid
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();

        }

        // outer loop
        for (int i = 1; i <= n; i++) {
            // for (int i = n; i >= 1; i--) { // Inverted Half Pyramid
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();

        }

    }
}


/*
  // 5. print the pattern
  // (rotated by 180 deg)
  public class Patterns {
  public static void main(String[] args) {
  int n = 4;
  // outer loop
  for (int i = 1; i <= n; i++) {
  // Inner Loop -> space print
  for (int j = 1; j <= n - i; j++) {
  System.out.print(" ");
  }
  // inner loop -> print star
  for (int j = 1; j <= i; j++) {
  System.out.print("*");
  }
  
  System.out.println();
  }
  }
  
  }
 */

/*
  // 6.print the Pattern
  // Half Pyramid With Numbers
  
  public class Patterns {
  public static void main(String[] args) {
  int n = 5;
  // outer loop
  for (int i = 1; i <= n; i++) {
  for (int j = 1; j <= i; j++) {
  System.out.print(j + " ");
  }
  System.out.println();
  }
  
  }
  
  }
 */

/*
  // 7. print the pattern
  // .Inverted Half pyramid with numbrs
  
  public class Patterns {
  public static void main(String[] args) {
  int n = 5;
  // outer loop
  for (int i = 1; i <= n; i++) {
  for (int j = 1; j <= n - i + 1; j++) {
  System.out.print(j + " ");
  }
  System.out.println();
  }
  
  }
  
  }
 */

/*
  // 8. Floyd's Triangle
  public class Patterns {
  public static void main(String[] args) {
  // logic : jitane row no hai utane hi value print ho rahe hai
  int n = 5;
  int Number = 1;
  // outer loop
  for (int i = 1; i <= n; i++) { // total number of row
  for (int j = 1; j <= i; j++) { // count number of row
  System.out.print(Number + " ");
  Number++;// Number = Number + 1
  }
  System.out.println();
  }
  
  }
  
  }
 */

/* 
// 9. Triangle
public class Patterns {
   public static void main(String[] args) {
       int n = 5;
       // Outer loops
       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
               int sum = i + j;
               if (sum % 2 == 0) {
                   System.out.print("1 ");
               } else {
                   System.out.print("0 ");
               }
           }
           System.out.println();
       }

   }
}
*/

//   // 10. Butterfly pattern
//   public class Patterns {
//   public static void main(String[] args) {
//   int n = 5;
//   // upper half
//   for (int i = 1; i <= n; i++) {
//   // first part
//   for (int j = 1; j <= i; j++) {
//   System.out.print("*");
//   }
//   // Spaces
//   int Spaces = 2 * (n - i);
//   for (int j = 1; j <= Spaces; j++) {
//   System.out.print(" ");
//   }
//   // 2nd part
//   for (int j = 1; j <= i; j++) {
//   System.out.print("*");

//  }
//   System.out.println();
//   }

//   // Lower half
//   for (int i = n; i >= 1; i--) {
//   // first part
//   for (int j = 1; j <= i; j++) {
//   System.out.print("*");
//   }
//   // Spaces
//   int Spaces = 2 * (n - i);
//   for (int j = 1; j <= Spaces; j++) {
//   System.out.print(" ");
//   }
//   // 2nd part
//   for (int j = 1; j <= i; j++) {
//   System.out.print("*");

//   }
//   System.out.println();
//   }

//   }
//   }

//   // 11. Soid Rhombus
//   public class Patterns {
//   public static void main(String[] args) {
//   int n = 5;
//   // Outer loops
//   for (int i = 1; i <= n; i++) {
//   // Spaces
//   for (int j = 1; j <= n - i; j++) {
//   System.out.print(" ");
//   }
//   // stars
//   for (int j = 1; j <= n; j++) {
// System.out.print("*");
//   }
//   System.out.println();
//   }
//   }
//   }

//   //
//   public class Patterns {
//   public static void main(String[] args) {
//   int n = 5;
//   // Outer loops
//   for (int i = 1; i <= n; i++) {
//   // Spaces
//   for (int j = i; j >= 1; j--) {
//   System.out.print(" ");
//  }
//   // numbers -> print row no, row no times
//   for (int j = 1; j <= i; j++) {
//   System.out.print(i + " ");
//   }
//   System.out.println();
//   }
//   }
//   }

//   // 13. Palindromic pattern
//   public class Patterns {
//   public static void main(String[] args) {
//   int n = 5;
//  // Outer loops
//   for (int i = 1; i <= n; i++) {
//   // Spaces // 2-1
//  for (int j = 1; j <= n - i; j++) {
//   System.out.print(" ");
//  }
//   // 1st half number backword = sapose i = 4 -> 4,3,2,1 .
//   for (int j = i; j >= 1; j--) {
//   System.out.print(j);
//   }
//   // 2nd half number
//   for (int j = 2; j <= i; j++) {
//   System.out.print(j);
//   }
//   System.out.println();
//   }
//   }
//   }

// 14. Diamond pattern
public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        // Upper half
        for (int i = 1; i <= n; i++) {
            // Spaces // 2-1
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // Lower half
        for (int i = n; i >= 1; i--) {
            // Spaces // 2-1
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}

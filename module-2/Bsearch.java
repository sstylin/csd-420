// Steve Stylin Module 2: Binary search using recursion.
public class Bsearch {
    public Bsearch() {
    }
 
    public static int Bsearch(int[] var0, int var1, int var2, int var3) {
       if (var2 >= var1) {
          int var4 = var1 + (var2 - var1) / 2;
          if (var0[var4] == var3) {
             return var4;
          } else {
             return var0[var4] > var3 ? Bsearch(var0, var1, var4 - 1, var3) : Bsearch(var0, var4 + 1, var2, var3);
          }
       } else {
          return -1;
       }
    }
 
    public static void main(String[] var0) {
       int[] var1 = new int[]{8, 3, 9, 10, 40};
       byte var2 = 10;
       int var3 = Bsearch(var1, 0, var1.length - 1, var2);
       if (var3 == -1) {
          System.out.println("Element not found in the array.");
       } else {
          System.out.println("Element found at index: " + var3);
       }
 
    }
 }
 
package Arrays._2DArrays;
// ye sqaure matrix ke liye he..agar r or c alag hian to unhe alag se lo or condition har loop ko chalane se phle check kro..isme condtion sirf ek baar check ho rhi he
public class SpirelPrintMatrix {
        public static void printSpiral(int[][] arr, int n) {
            int toprow = 0, bottrow = n - 1;
            int leftcol = 0, rightcol = n - 1;

            while (toprow <= bottrow && leftcol <= rightcol) {
                // Top row: left → right
                for (int i = leftcol; i <= rightcol; i++) {
                    System.out.print(arr[toprow][i] + " ");
                }
                toprow++;

                // Right column: top → bottom
                for (int i = toprow; i <= bottrow; i++) {
                    System.out.print(arr[i][rightcol] + " ");
                }
                rightcol--;

                // Bottom row: right → left
                if (toprow <= bottrow) {
                    for (int i = rightcol; i >= leftcol; i--) {
                        System.out.print(arr[bottrow][i] + " ");
                    }
                    bottrow--;
                }

                // Left column: bottom → top
                if (leftcol <= rightcol) {
                    for (int i = bottrow; i >= toprow; i--) {
                        System.out.print(arr[i][leftcol] + " ");
                    }
                    leftcol++;
                }
            }
        }

        public static void main(String[] args) {
            int[][] arr = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9,10,11,12},
                    {13,14,15,16}
            };
            int n = arr.length;
            printSpiral(arr, n);
        }
    }



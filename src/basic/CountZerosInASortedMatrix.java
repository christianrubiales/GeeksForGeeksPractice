package basic;

public class CountZerosInASortedMatrix {

    int countZeros(int A[][], int n)
    {
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 0) {
                    c++;
                }
            }
        }
        
        return c;
    }
}

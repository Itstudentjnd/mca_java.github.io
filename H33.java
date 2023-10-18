//two dimentional array
public class H33 {
    public static void main(String[] args) {
        int a[][] = new int[5][3];
        int k = 1;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = k++;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}

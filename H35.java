public class H35 {
    public static void main(String[] args) {
        int a[][] = new int[3][];
        int no = 1,c;
        for(int i=0;i<a.length;i++){
            System.out.print("Enter"+(i+1)+"Row column Size :");
            c = Integer.parseInt(System.console().readLine());
            a[i] = new int[c];
            for(int j=0;j<a[i].length;j++){
                a[i][j] = no++;
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

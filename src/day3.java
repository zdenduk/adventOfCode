import java.util.ArrayList;

public class day3 {
    public static void main(String[] args) {
        System.out.println(solve());
    }

    private static int solve() {
        String[] trio = getTriangles().split("\n");
        int[] params = new int[3];
        for (String i : trio) {
            System.out.println(i);
            String[] arr = i.split("[^0-9]");
            
            params[0] = Integer.parseInt(arr[0]);
            params[1] = Integer.parseInt(arr[1]);
            params[2] = Integer.parseInt(arr[2]);

            if (params[0] + params[1] > params[3]) {

            }
        }
        return 0;
    }


    private static String getTriangles() {
        return "5 10 25";
    }
}

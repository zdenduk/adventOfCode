public class day1 {
    public static void main(String[] args) {
        System.out.println(getTiles());
    }

    private static int getTiles() {
        int top = 0;
        int right = 0;
        int direction = 1;

        String[] arr = getMoves().split(", ");
        for (String turn : arr) {
            if (turn.charAt(0) == 'R') {
                if (direction == 4) {
                    direction = 1;
                } else {
                    direction++;
                }
            } else {
                if (direction == 1) {
                    direction = 4;
                } else {
                    direction--;
                }
            }
            if (direction == 1) {
                top += Integer.parseInt(turn.substring(1));
            }
            if (direction == 2) {
                right += Integer.parseInt(turn.substring(1));
            }
            if (direction == 3) {
                top -= Integer.parseInt(turn.substring(1));
            }
            if (direction == 4) {
                right -= Integer.parseInt(turn.substring(1));
            }
            System.out.println("Moving " + turn.substring(1) + " blocks " + direction + "(" + turn.charAt(0) + ")" + "top: " + top + ",right: " + right);
        }
        return Math.abs(top) + Math.abs(right);
    }

    private static String getMoves() {
        return "R5, R4, R2, L3, R1, R1, L4, L5, R3, L1, L1, R4, L2, R1, R4, R4, L2, L2, R4, L4, R1, R3, L3, L1, L2, R1, R5, L5, L1, L1, R3, R5, L1, R4, L5, R5, R1, L185, R4, L1, R51, R3, L2, R78, R1, L4, R188, R1, L5, R5, R2, R3, L5, R3, R4, L1, R2, R2, L4, L4, L5, R5, R4, L4, R2, L5, R2, L1, L4, R4, L4, R2, L3, L4, R2, L3, R3, R2, L2, L3, R4, R3, R1, L4, L2, L5, R4, R4, L1, R1, L5, L1, R3, R1, L2, R1, R1, R3, L4, L1, L3, R2, R4, R2, L2, R1, L5, R3, L3, R3, L1, R4, L3, L3, R4, L2, L1, L3, R2, R3, L2, L1, R4, L3, L5, L2, L4, R1, L4, L4, R3, R5, L4, L1, L1, R4, L2, R5, R1, R1, R2, R1, R5, L1, L3, L5, R2";
    }
}

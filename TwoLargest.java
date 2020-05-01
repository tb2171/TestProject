public class TwoLargest {

    public static void main(String[] args) {
        double end = IO.readDouble();
        double no1 = Double.MIN_VALUE, no2 = Double.MIN_VALUE;
        double x;
        int count = 0;
        while (true) {
            x = IO.readDouble();
            if (x == end) {
                if(count < 2) {
                    IO.reportBadInput();
                    System.out.println("Enter atleast 2 numbers.");
                    continue;
                } else {
                    break;
                }
            }
            if (x >= no1) {
                no2 = no1;
                no1 = x;
            } else if (x >= no2) {
                no2 = x;
            }
            count++;
        }
        IO.outputDoubleAnswer(no1);
        IO.outputDoubleAnswer(no2);
    }

}
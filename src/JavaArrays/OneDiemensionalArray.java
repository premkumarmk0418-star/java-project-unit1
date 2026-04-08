package JavaArrays;

public class OneDiemensionalArray {
    public static void main(String[] args) {

        String[] names = new String[5];
        names[0] = "prem";
        names[1] = "kumar";
        names[2] = "naveen";
        names[3] = "kumar";
        names[4] = "raghul";

        for(String item : names) {
            System.out.println("item====>" + item);
        }
    }
}


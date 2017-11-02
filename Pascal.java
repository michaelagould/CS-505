public class Main {

    public static void main(String[] args) {

        int n = args.length == 1 ? Integer.parseInt(args[0]) : 1;

        for (int i = 1; i <= n; ++i) {
            int[] arr = Pascal.triangle(i);
            System.out.print((i < 10 ? " " : "") + i + ": ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class Pascal {

    public static int[] triangle(int n) {

        if(n == 1)
            return new int[1]{1};

        int[] result = triangle(n-1);
        int[] other = new int[n];
        result[0] = 1;
        results[n-1] = 1;

        for(int i = 1; i < n; i++)
            result[i] = other[i] + other[i-1];

        return result;
    }
}

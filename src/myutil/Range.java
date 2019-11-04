package myutil;

public class Range {
    public static int[] range(int n)
    {
        int [] result = new int[n];
        for (int i = 0; i < n ; i++) {
            result[i] = i;
        }
        return result;
    }

    public static int[] range(int start, int end)
    {
        int [] result = new int[end - start];
        for (int i = 0; i < result.length ; i++) {
            result[i] = start + i;
        }
        return result;
    }

    public static int[] range(int start, int end, int step)
    {
        int [] result = new int[(end - start)/step];
        for (int i = 0; i < result.length ; i++) {
            result[i] = start + (i*step);
        }
        return result;
    }
}

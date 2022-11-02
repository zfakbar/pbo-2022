class Comparator {
    public static int max(int a, int b)
    {
        if( a > b)
            return a;
        else
            return b;
    }
    public static String max(String a, String b)
    {
        if( a.compareTo (b) > 0)
            return a;
        else
            return b;
    }
}
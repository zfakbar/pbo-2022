class MyClass {
    public static void main(String args[])
    {
        String s1 = "Melbourne";
        String s2 = "Sydney";
        String s3 = "Adelaide";
        int a = 10;
        int b = 20;
        System.out.println(Comparator.max(a, b)); // which number is big
        System.out.println(Comparator.max(s1, s2)); // which city is big
        System.out.println(Comparator.max(s1, s3)); // which city is big
    }
}
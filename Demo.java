class classLearn {

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }

}

public class Demo {
    public static void main(String a[]) {
        int n1 = 5;
        int n2 = 5;
        classLearn calc = new classLearn();
        int result = calc.add(n1, n2);
        System.out.println(result);
    }
}

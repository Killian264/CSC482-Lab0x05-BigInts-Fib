package killiandebacker.com;




public class Main {

    public static void main(String[] args) {
	    String str = "123";

	    MyBigDecimalInt a = new MyBigDecimalInt("999");
        MyBigDecimalInt b = new MyBigDecimalInt("1");

        a.plus(b);

        System.out.println(a.value);
    }
}

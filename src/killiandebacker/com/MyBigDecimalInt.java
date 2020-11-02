package killiandebacker.com;

import java.util.ArrayList;

public class MyBigDecimalInt {

    public String value;

    public int N;

    public MyBigDecimalInt(String value){
        this.N = value.length();
        this.value = value;
    }

    public MyBigDecimalInt plus( MyBigDecimalInt x ){
        String result = "";

        // Reverse Strings
        String value1 = new StringBuilder(this.value).reverse().toString();
        String value2 = new StringBuilder(x.value).reverse().toString();

        int len_value1 = value1.length();
        int len_value2 = value2.length();

        // Swap strings to simplify later steps
        if(len_value1 < len_value2){
            String temp = value1;
            value1 = value2;
            value2 = temp;

            len_value1 = value1.length();
            len_value2 = value2.length();
        }

        int carry_over = 0;
        int i = 0;

        // Add string 2 to string 1
        for(i = 0; i < len_value2; i++){
            char chr_a = value1.charAt(i);
            char chr_b = value2.charAt(i);
            int a = Character.getNumericValue(chr_a);
            int b = Character.getNumericValue(chr_b);

            int sum = a + b + carry_over;

            carry_over = (sum >= 10) ? 1 : 0;

            result += (char)(sum % 10 + '0');
        }


        // Finish moving over string 1 and deal with carry over
        for(; i < len_value1; i++){
            char chr_a = value1.charAt(i);

            int a = Character.getNumericValue(chr_a);

            int sum = a + carry_over;

            carry_over = (sum >= 10) ? 1 : 0;

            result += (char)(sum % 10 + '0');
        }

        // Final carry over
        if(carry_over == 1){
            result += '1';
        }

        // Reverse string
        String result_reversed = new StringBuilder(result).reverse().toString();

        return new MyBigDecimalInt(result_reversed);
    }

    // Negative numbers are NOT supported
    public MyBigDecimalInt minus( MyBigDecimalInt x ){
        String result = "";

        // Reverse Strings
        String value1 = new StringBuilder(this.value).reverse().toString();
        String value2 = new StringBuilder(x.value).reverse().toString();

        int len_value1 = value1.length();
        int len_value2 = value2.length();

        int carry_over = 0;
        int i = 0;

        // Add string 2 to string 1
        for(i = 0; i < len_value2; i++){
            char chr_a = value1.charAt(i);
            char chr_b = value2.charAt(i);
            int a = Character.getNumericValue(chr_a);
            int b = Character.getNumericValue(chr_b);

            int sum = a - b - carry_over;

            carry_over = (sum < 0) ? 1 : 0;

            sum = sum < 0 ? sum + 10 : sum;

            result += (char)(sum % 10 + '0');
        }


        // Finish moving over string 1 and deal with carry over
        for(; i < len_value1; i++){
            char chr_a = value1.charAt(i);

            int a = Character.getNumericValue(chr_a);

            int sum = a - carry_over;

            carry_over = (sum < 0) ? 1 : 0;

            sum = sum < 0 ? sum + 10 : sum;

            result += (char)(sum % 10 + '0');
        }

        // Reverse string
        String result_reversed = new StringBuilder(result).reverse().toString();

        i = 0;
        for(; i < result_reversed.length(); i++){
            if(result_reversed.charAt(i) != '0'){
                break;
            }
        }

        result_reversed = result_reversed.substring(i, result_reversed.length());

        if(result_reversed.length() == 0){
            result_reversed = "0";
        }

        return new MyBigDecimalInt(result_reversed);
    }

    public boolean greaterThan( MyBigDecimalInt x ){

        String result = "";

        // Reverse Strings
        String value1 = this.value;
        String value2 = x.value;

        int len_value1 = value1.length();
        int len_value2 = value2.length();

        if(len_value1 != len_value2){
            return len_value1 > len_value2;
        }

        for(int i = 0; i < len_value1; i++){
            char chr_a = value1.charAt(i);
            char chr_b = value2.charAt(i);
            int a = Character.getNumericValue(chr_a);
            int b = Character.getNumericValue(chr_b);

            if( a == b ){
                continue;
            }

            return a > b;

        }

        return false;
    }

    public MyBigDecimalInt times( MyBigDecimalInt x ){
        // Reverse Strings
        String value1 = new StringBuilder(this.value).reverse().toString();
        String value2 = new StringBuilder(x.value).reverse().toString();

        int len_value1 = value1.length();
        int len_value2 = value2.length();

        // This is unneeded but whatever
        if(len_value1 < len_value2){
            String temp = value1;
            value1 = value2;
            value2 = temp;

            len_value1 = value1.length();
            len_value2 = value2.length();
        }

        ArrayList<MyBigDecimalInt> line_products = new ArrayList<MyBigDecimalInt>();

        // Add string 2 to string 1
        for(int i = 0; i < len_value2; i++){
            char chr_b = value2.charAt(i);
            int b = Character.getNumericValue(chr_b);

            String line_product = generateZeroString(i);

            int carry_over = 0;
            for(int j = 0; j < len_value1; j++){
                char chr_a = value1.charAt(j);
                int a = Character.getNumericValue(chr_a);

                int product = a * b + carry_over;

                carry_over = product / 10;

                line_product += (char)(product % 10 + '0');

            }

            if(carry_over != 0){
                line_product += (char)(carry_over + '0');
            }

            String line_product_reversed = new StringBuilder(line_product).reverse().toString();
            line_products.add(new MyBigDecimalInt(line_product_reversed));
        }


        MyBigDecimalInt result = new MyBigDecimalInt("");

        for(MyBigDecimalInt product : line_products){
            result = result.plus(product);
        }

        return result;

    }

    private String generateZeroString(int n){
        String result = "";

        for(int i = 0; i < n; i++){
            result += '0';
        }
        return result;
    }
}

package Service;

/**
 * Created by lishuode on 16/6/26.
 */
public class AddNumber {

    public static int addNum(String a ,String b){
        Integer result = 0;

        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);

        result = a1 + b1;

        return result;
    }
}

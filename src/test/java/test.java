import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaopan on 1/18/17.
 */
public class test {
    public static void main(String[] args){
        List<List<String>> res = numDecodings("1206413");
        for(List<String> way: res){
            for(String s: way){
                System.out.print(s+ " ");
            }
            System.out.println("");
        }

    }

    public static List<List<String>> numDecodings(String s) {
        List<List<String>>  res = new ArrayList<>();
        helper(s, 0, new ArrayList<>(), res);

        return res;
    }

    public static void helper(String s, int index, List<String> cur, List<List<String>>  res){
        if(index > s.length())
            return;
        if(index == s.length()){
            res.add(new ArrayList<String>(cur));
            return;
        }
        int one = Integer.valueOf(s.substring(index, index+1));
        int two = 0;
        if(index < s.length() - 1)
            two = Integer.valueOf(s.substring(index, index + 2));
        if(one != 0){
            cur.add(String.valueOf(one));
            helper(s, index + 1, cur, res);
            cur.remove(cur.size() - 1);
        }
        if(two <=26 && two >= 10){
            cur.add(String.valueOf(two));
            helper(s, index + 2, cur, res);
            cur.remove(cur.size() - 1);
        }
    }
}


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNumber {
    public ArrayList<Integer> numsCheck(String args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d{3,}");
        Matcher matcher = pattern.matcher(args);
        while (matcher.find()) {
            String result = args.substring(matcher.start(), matcher.end());
            nums.add(Integer.parseInt(result));
        }
        return nums;
    }
}

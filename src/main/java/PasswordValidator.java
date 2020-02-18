
public class PasswordValidator {
    private static int validationCounter = 0;
    public boolean passwordValidate(String password) {
        char[] chars = password.toCharArray();
        for(int n = 0; n < chars.length; n++) {
            char symbol = chars[n];
            if(symbol >= '0' && symbol <= '9') validationCounter++;
            if(symbol == '_') validationCounter++;
            if(symbol >= 'A' && symbol <= 'Z') validationCounter++;
        }
        if (validationCounter > 5) return true;
        return false;
    }
}

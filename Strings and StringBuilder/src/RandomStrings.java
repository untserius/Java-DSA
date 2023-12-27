import java.util.Random;

public class RandomStrings {
    static String generate(int size){
        StringBuffer sb = new StringBuffer();

        Random random = new Random();

        for(int i = 0; i < size; i++){
            int randomChar = 97 + (int)(26 * random.nextFloat());
            sb.append((char)randomChar);
        }
        return sb.toString();
    }
}

import java.security.Key;
import java.util.Base64;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AesEncryption {
    private static final String ALGO = "AES";
    private static final byte[] keyValue = new byte[]{
            'P', 'i', '@', 'a', 'T', 'o', 'm', '#', '1', '2', '3'};

    public static void main(String[] args) {
        decrypt("JAA742aa7lK1Gs7c0wq+Ow==");
        encrypt("261");
    }

    public static String decrypt(String encryptedData) {
        try {
            if (Pattern.compile("_").matcher(encryptedData).find()) {
                encryptedData = encryptedData.replaceAll("_", "/");
            }
            Key key = generateKey();
            Cipher c = Cipher.getInstance(ALGO);
            c.init(Cipher.DECRYPT_MODE, key);
            byte[] decordedValue = Base64.getDecoder().decode(encryptedData);
            byte[] decValue = c.doFinal(decordedValue);
            System.out.println("Decrypt data is here===>" + new String(decValue));
            return new String(decValue);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Key generateKey() throws Exception {
        return new SecretKeySpec(keyValue, ALGO);
    }

    public static void encrypt(String data) {
        try {
            Key key = generateKey();
            Cipher c = Cipher.getInstance(ALGO);
            c.init(Cipher.ENCRYPT_MODE, key);
            byte[] encVal = c.doFinal(data.getBytes());
            String encodeToString = Base64.getEncoder().encodeToString(encVal);
            if (Pattern.compile("\\/").matcher(encodeToString).find()) {
                encodeToString = encodeToString.replaceAll("/", "_");
            }
            System.out.println("Encrypt data is here===>" + encodeToString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
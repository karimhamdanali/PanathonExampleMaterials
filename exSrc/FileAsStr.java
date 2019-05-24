import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class FileAsStr {

	public static void main(String[] args) throws NoSuchAlgorithmException, IOException {

                String msg = getSHA256();
                System.out.println("Encoded message is: "+msg);

    }
    
	private static String getSHA256() throws IOException, NoSuchAlgorithmException
    {
	String msgInstance = getInstanceStringFromFile();
	msgInstance = msgInstance.replace("\n", "");
	System.out.print("Using algorithm: "+msgInstance+"\n");
        MessageDigest md = MessageDigest.getInstance(msgInstance);

	String messagePlain = "Hello World!";
	byte[] messagePlainBytes = messagePlain.getBytes();
        md.update(messagePlainBytes);
        byte[] result = md.digest();
        String sb = new String(result);
        return sb;
    }

    private static String getInstanceStringFromFile() throws IOException{
	String st = "";
	Path path = Paths.get("./../resources/msgInst.txt");
	if(Files.exists(path)){
	    st = new String(Files.readAllBytes(path));
	}else{
	    System.out.println("No such file: ./resources/msgInst.txt");
	}
    	return st;

    }
}

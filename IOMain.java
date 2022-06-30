import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.print.DocFlavor.STRING;

// java IOMain <src> <dest>
// java IOMain myFile myFile.dup


public class IOMain {
    
    public static void main(String[] args) {

    String srcfile = args[0];
    String dstfile = args[1];

    // 1k byte buffer
    byte [] buff = new byte[1024];

    try {
        InputStream is = new FileInputStream(srcfile);
        System.out.printf("%s file opened\n", srcfile);


        is.close();
    } catch (FileNotFoundException ex) {
        System.err.printf(format, args)
        

    }

    }

    

    }
}

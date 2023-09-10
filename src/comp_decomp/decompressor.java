package comp_decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class decompressor {
    public static  void  method(File file) throws IOException{
        String fileDirectory = file.getParent();
        FileInputStream fileInputStream = new FileInputStream(file);
        //bytes are compressed already
        GZIPInputStream gzipInputStream = new GZIPInputStream(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream(fileDirectory+"/DecompressedFile");

        byte[] buffer = new byte[1024];
        int len;
        while((len=gzipInputStream.read(buffer))!=-1){
            fileOutputStream.write(buffer,0,len);
        }
        gzipInputStream.close();
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static void main(String[] args) throws  IOException{
        File path = new File("C:");
        method(path);
    }
}

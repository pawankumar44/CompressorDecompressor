package comp_decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class compressor {
    public  static  void method(File file) throws IOException {
        //store the path of the selected file
        String fileDirectory = file.getParent();
        //File Input stream to read the bits of the file
        FileInputStream fileInputStream = new FileInputStream(file);
        //save file in the file directory
        FileOutputStream fileOutputStream = new FileOutputStream(fileDirectory+"/CompressedFile.gz");
        //we want output file to be compressed
        //what ever sending output file those need to be compressed, fileOutStream to be passed
        GZIPOutputStream gzip = new  GZIPOutputStream(fileOutputStream);

        //read bytes
        //with the help of this buffer array, we read the data then write it to output file
        byte [] buffer = new byte[1024];
        int len;
        while((len=fileInputStream.read(buffer))!=-1){
            //take buffer as data and start from 0 to len
            gzip.write(buffer,0,len);
        }
        //close all the streams
        gzip.close();
        fileOutputStream.close();
        fileInputStream.close();
    }

    public  static  void main(String[] args) throws  IOException{
        File path = new File("C:");
        //passing the path of the file
        method(path);
    }
}

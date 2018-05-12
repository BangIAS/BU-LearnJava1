import java.io.*;

public class BacaKeyboard{
    public static String bacaString(){
        int karakter;
        String str="";
        boolean selesai = false;

        while(!selesai){
            try{
                karakter = System.in.read();
                if(karakter < 0 || (char) karakter== '\n') 
                    selesai = true;
                else if((char) karakter != '\r')
                    str = str+(char) karakter;
            }
            catch(java.io.IOException e){
                System.err.println("Ada Kesalahan");
                selesai = true;
            }
        }
        return str;
    }
}
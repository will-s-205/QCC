package core;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class GetCode{
    
    int getRespond(String uri){
        int response = 0;
        try {
            URL url = new URL(uri);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            response = connection.getResponseCode();
        } catch (IOException e){
            System.out.print(e);
        }
    return response;
    }
     
    public static void main(String[] args){
        System.out.println(new GetCode().getRespond("https://www.amazon.com"));
        System.out.println(new GetCode().getRespond("https://www.facebook.com"));
        System.out.println(new GetCode().getRespond("https://www.google.com"));
    }
}
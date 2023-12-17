package Sanjeevani.utility;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;

//this class implements the interface SenderInterface to send otp. similarly we will making another class which would implement the same interface but to send otp. the outer structure is same but inside code is different. we are using polymorphism here. 

public class OtpSender implements SenderInterface {

    @Override
    public boolean send(String mobNo, String data) throws UnirestException{
        Unirest.setTimeouts(0,0);
        int otp = Integer.parseInt(data);
        String url = "https://2factor.in/API/V1/31ba4100-b448-11ed-813b-0200cd936042/SMS/" + mobNo +"/" +otp+"/OTP1";
        System.out.println("otp is: "+ otp);
        GetRequest gr = Unirest.get(url);
        HttpResponse<String> response = gr.asString();
        String result = response.getBody();
        return result.contains("Success");
    }
}

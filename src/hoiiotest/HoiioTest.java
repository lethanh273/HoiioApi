/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoiiotest;

import com.hoiio.sdk.Hoiio;
import com.hoiio.sdk.exception.HoiioException;
import com.hoiio.sdk.objects.sms.Sms;
import com.hoiio.sdk.objects.sms.SmsHistory;
import com.hoiio.sdk.objects.sms.SmsTxn;

/**
 *
 * @author thanhle
 */
public class HoiioTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hoiio hoiio = new Hoiio("76SS00hYZvv9NjUh", "qZGF7VRxAFwtqb4C");

        try {
            String dest = "+6583555492";
            String msg = "Hello world";
            // Send an sms
            SmsTxn smsTxn = hoiio.getSmsService().send(dest, msg);

            // Get the response from Hoiio
            System.out.println(smsTxn.getTxnRef());

      
        } catch (HoiioException e) {
            // This is thrown when the request doesn't return success_ok
            System.out.println(e.getStatus().toString());
            System.out.println(e.getContent());
        }
    }
}

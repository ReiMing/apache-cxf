package wlsdtest2.wlsdtest2;

import wlsdtest2.ArrayOfString;
import wlsdtest2.TranslatorWebService;
import wlsdtest2.TranslatorWebServiceSoap;

public class Test2 {

    public static void main(String[] args) {
        TranslatorWebService request = new TranslatorWebService();
        TranslatorWebServiceSoap soap = request.getTranslatorWebServiceSoap();
        ArrayOfString arrayOfString =  soap.getEnCnTwoWayTranslator("word");
        System.out.println(arrayOfString.getString());

    }
}

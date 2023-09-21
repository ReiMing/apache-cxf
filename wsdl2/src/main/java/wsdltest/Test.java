package wsdltest;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Test {
    public static void main(String[] args) {
        System.out.println("start");

//        String address = "http://www.webxml.com.cn/WebServices/IpAddressSearchWebService.asmx?wsdl";
//
//        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//        // 设置代理地址
//        jaxWsProxyFactoryBean.setAddress(address);
//
//        // 设置接口类型
//        jaxWsProxyFactoryBean.setServiceClass(IpAddressSearchWebServiceHttpGet.class);
//        //IpAddressSearchWebService service = new IpAddressSearchWebService();
//        IpAddressSearchWebServiceHttpGet service = (IpAddressSearchWebServiceHttpGet)jaxWsProxyFactoryBean.create();
//
//        GetCountryCityByIp ip = new GetCountryCityByIp();
//        ip.setTheIpAddress("11.1.1.1");
//        ArrayOfString result=service.getCountryCityByIp(ip);
        //System.out.println(result.getString());

        IpAddressSearchWebService service = new IpAddressSearchWebService();
        IpAddressSearchWebServiceSoap soap = service.getIpAddressSearchWebServiceSoap();
        ArrayOfString array = soap.getCountryCityByIp("11.1.1.1");
        System.out.println(array.getString());
    }
}

package wlsdtest2;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.3
 * 2023-09-21T23:13:23.865+08:00
 * Generated source version: 4.0.3
 *
 */
@WebService(targetNamespace = "http://WebXml.com.cn/", name = "TranslatorWebServiceHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TranslatorWebServiceHttpGet {

    /**
     * <br /><h3>获得中文<->英文双向翻译 String()</h3><p>输入参数：中文或英文单词；返回数据：一个一维字符串数组 String(1)，String(0) 中文为[拼音][国标码 部首 笔画 笔顺]，英文为[音标]；String(1) 译文 多个条目中间用 | 隔开，英文还包括单词属性</p><br />
     */
    @WebMethod
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString getEnCnTwoWayTranslator(

        @WebParam(partName = "Word", name = "Word", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String word
    );

    /**
     * <br /><h3>Hello! WebXml.com.cm</h3><br /><br />
     */
    @WebMethod(operationName = "HelloWebXml")
    @WebResult(name = "string", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public java.lang.String helloWebXml()
;
}

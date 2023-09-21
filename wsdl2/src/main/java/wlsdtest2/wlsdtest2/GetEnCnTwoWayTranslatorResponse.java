
package wlsdtest2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getEnCnTwoWayTranslatorResult" type="{http://WebXml.com.cn/}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getEnCnTwoWayTranslatorResult"
})
@XmlRootElement(name = "getEnCnTwoWayTranslatorResponse")
public class GetEnCnTwoWayTranslatorResponse {

    protected ArrayOfString getEnCnTwoWayTranslatorResult;

    /**
     * 获取getEnCnTwoWayTranslatorResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetEnCnTwoWayTranslatorResult() {
        return getEnCnTwoWayTranslatorResult;
    }

    /**
     * 设置getEnCnTwoWayTranslatorResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetEnCnTwoWayTranslatorResult(ArrayOfString value) {
        this.getEnCnTwoWayTranslatorResult = value;
    }

}

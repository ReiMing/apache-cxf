
package wlsdtest2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡgetEnCnTwoWayTranslatorResult���Ե�ֵ��
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
     * ����getEnCnTwoWayTranslatorResult���Ե�ֵ��
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

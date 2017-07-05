
package client.zt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>createMemberDiscountPaymentTotal complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="createMemberDiscountPaymentTotal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="memberDiscountTotal" type="{http://soap.bonus.kasly.com/}MEMBERDISCOUNTTOTAL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMemberDiscountPaymentTotal", propOrder = {
    "memberDiscountTotal"
})
public class CreateMemberDiscountPaymentTotal {

    protected MEMBERDISCOUNTTOTAL memberDiscountTotal;

    /**
     * 获取memberDiscountTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MEMBERDISCOUNTTOTAL }
     *     
     */
    public MEMBERDISCOUNTTOTAL getMemberDiscountTotal() {
        return memberDiscountTotal;
    }

    /**
     * 设置memberDiscountTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MEMBERDISCOUNTTOTAL }
     *     
     */
    public void setMemberDiscountTotal(MEMBERDISCOUNTTOTAL value) {
        this.memberDiscountTotal = value;
    }

}

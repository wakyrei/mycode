
package client.zt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>createMemberDiscountPaymentTotal complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmemberDiscountTotal���Ե�ֵ��
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
     * ����memberDiscountTotal���Ե�ֵ��
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

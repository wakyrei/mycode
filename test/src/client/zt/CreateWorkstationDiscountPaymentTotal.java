
package client.zt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>createWorkstationDiscountPaymentTotal complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="createWorkstationDiscountPaymentTotal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workstationDiscountTotal" type="{http://soap.bonus.kasly.com/}WORKSTATIONDISCOUNTTOTAL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createWorkstationDiscountPaymentTotal", propOrder = {
    "workstationDiscountTotal"
})
public class CreateWorkstationDiscountPaymentTotal {

    protected WORKSTATIONDISCOUNTTOTAL workstationDiscountTotal;

    /**
     * ��ȡworkstationDiscountTotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WORKSTATIONDISCOUNTTOTAL }
     *     
     */
    public WORKSTATIONDISCOUNTTOTAL getWorkstationDiscountTotal() {
        return workstationDiscountTotal;
    }

    /**
     * ����workstationDiscountTotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WORKSTATIONDISCOUNTTOTAL }
     *     
     */
    public void setWorkstationDiscountTotal(WORKSTATIONDISCOUNTTOTAL value) {
        this.workstationDiscountTotal = value;
    }

}

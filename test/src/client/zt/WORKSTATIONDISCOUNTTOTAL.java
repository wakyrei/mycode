
package client.zt;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WORKSTATIONDISCOUNTTOTAL complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WORKSTATIONDISCOUNTTOTAL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BATCHNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOTALNUMBER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TOTALVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WORKSTATIONDISCOUNTTOTAL", propOrder = {
    "batchno",
    "totalnumber",
    "totalvalue"
})
public class WORKSTATIONDISCOUNTTOTAL {

    @XmlElement(name = "BATCHNO")
    protected String batchno;
    @XmlElement(name = "TOTALNUMBER")
    protected BigDecimal totalnumber;
    @XmlElement(name = "TOTALVALUE")
    protected BigDecimal totalvalue;

    /**
     * ��ȡbatchno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATCHNO() {
        return batchno;
    }

    /**
     * ����batchno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATCHNO(String value) {
        this.batchno = value;
    }

    /**
     * ��ȡtotalnumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALNUMBER() {
        return totalnumber;
    }

    /**
     * ����totalnumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALNUMBER(BigDecimal value) {
        this.totalnumber = value;
    }

    /**
     * ��ȡtotalvalue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALVALUE() {
        return totalvalue;
    }

    /**
     * ����totalvalue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALVALUE(BigDecimal value) {
        this.totalvalue = value;
    }

}


package client.zt;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WORKSTATIONDISCOUNTTOTAL complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取batchno属性的值。
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
     * 设置batchno属性的值。
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
     * 获取totalnumber属性的值。
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
     * 设置totalnumber属性的值。
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
     * 获取totalvalue属性的值。
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
     * 设置totalvalue属性的值。
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

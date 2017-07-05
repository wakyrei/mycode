
package client.zt;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WORKSTATIONDISCOUNT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WORKSTATIONDISCOUNT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BATCHNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WORKSTATIONNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BONUSVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WORKSTATIONDISCOUNT", propOrder = {
    "batchno",
    "workstationno",
    "bonusvalue"
})
public class WORKSTATIONDISCOUNT {

    @XmlElement(name = "BATCHNO")
    protected String batchno;
    @XmlElement(name = "WORKSTATIONNO")
    protected String workstationno;
    @XmlElement(name = "BONUSVALUE")
    protected BigDecimal bonusvalue;

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
     * 获取workstationno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWORKSTATIONNO() {
        return workstationno;
    }

    /**
     * 设置workstationno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWORKSTATIONNO(String value) {
        this.workstationno = value;
    }

    /**
     * 获取bonusvalue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBONUSVALUE() {
        return bonusvalue;
    }

    /**
     * 设置bonusvalue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBONUSVALUE(BigDecimal value) {
        this.bonusvalue = value;
    }

}

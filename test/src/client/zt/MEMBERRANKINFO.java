
package client.zt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MEMBERRANKINFO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MEMBERRANKINFO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BATCHNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USERNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USERRANK" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="STARRANK" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MAXSTARRANK" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="COMFLAG" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEMBERRANKINFO", propOrder = {
    "batchno",
    "userno",
    "userrank",
    "starrank",
    "maxstarrank",
    "comflag"
})
public class MEMBERRANKINFO {

    @XmlElement(name = "BATCHNO")
    protected String batchno;
    @XmlElement(name = "USERNO")
    protected String userno;
    @XmlElement(name = "USERRANK")
    protected Integer userrank;
    @XmlElement(name = "STARRANK")
    protected Integer starrank;
    @XmlElement(name = "MAXSTARRANK")
    protected Integer maxstarrank;
    @XmlElement(name = "COMFLAG")
    protected Integer comflag;

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
     * 获取userno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERNO() {
        return userno;
    }

    /**
     * 设置userno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERNO(String value) {
        this.userno = value;
    }

    /**
     * 获取userrank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUSERRANK() {
        return userrank;
    }

    /**
     * 设置userrank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUSERRANK(Integer value) {
        this.userrank = value;
    }

    /**
     * 获取starrank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSTARRANK() {
        return starrank;
    }

    /**
     * 设置starrank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSTARRANK(Integer value) {
        this.starrank = value;
    }

    /**
     * 获取maxstarrank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAXSTARRANK() {
        return maxstarrank;
    }

    /**
     * 设置maxstarrank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAXSTARRANK(Integer value) {
        this.maxstarrank = value;
    }

    /**
     * 获取comflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCOMFLAG() {
        return comflag;
    }

    /**
     * 设置comflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCOMFLAG(Integer value) {
        this.comflag = value;
    }

}

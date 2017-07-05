
package client.zt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>createMemberExperiencePointsTotal complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="createMemberExperiencePointsTotal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="memberExperiencePointsTotal" type="{http://soap.bonus.kasly.com/}MEMBEREXPERIENCEPOINTSTOTAL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMemberExperiencePointsTotal", propOrder = {
    "memberExperiencePointsTotal"
})
public class CreateMemberExperiencePointsTotal {

    protected MEMBEREXPERIENCEPOINTSTOTAL memberExperiencePointsTotal;

    /**
     * 获取memberExperiencePointsTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MEMBEREXPERIENCEPOINTSTOTAL }
     *     
     */
    public MEMBEREXPERIENCEPOINTSTOTAL getMemberExperiencePointsTotal() {
        return memberExperiencePointsTotal;
    }

    /**
     * 设置memberExperiencePointsTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MEMBEREXPERIENCEPOINTSTOTAL }
     *     
     */
    public void setMemberExperiencePointsTotal(MEMBEREXPERIENCEPOINTSTOTAL value) {
        this.memberExperiencePointsTotal = value;
    }

}

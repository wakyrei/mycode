
package client.zt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>createMemberExperiencePointsTotal complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmemberExperiencePointsTotal���Ե�ֵ��
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
     * ����memberExperiencePointsTotal���Ե�ֵ��
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

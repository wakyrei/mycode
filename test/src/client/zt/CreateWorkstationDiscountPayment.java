
package client.zt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>createWorkstationDiscountPayment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="createWorkstationDiscountPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workstationDiscount" type="{http://soap.bonus.kasly.com/}WORKSTATIONDISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createWorkstationDiscountPayment", propOrder = {
    "workstationDiscount"
})
public class CreateWorkstationDiscountPayment {

    protected List<WORKSTATIONDISCOUNT> workstationDiscount;

    /**
     * Gets the value of the workstationDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workstationDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkstationDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WORKSTATIONDISCOUNT }
     * 
     * 
     */
    public List<WORKSTATIONDISCOUNT> getWorkstationDiscount() {
        if (workstationDiscount == null) {
            workstationDiscount = new ArrayList<WORKSTATIONDISCOUNT>();
        }
        return this.workstationDiscount;
    }

}

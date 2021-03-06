package client.zt;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-07-05T13:39:43.706+08:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://soap.bonus.kasly.com/", name = "IBonusReqResource")
@XmlSeeAlso({ObjectFactory.class})
public interface IBonusReqResource {

    @RequestWrapper(localName = "createMemberExperiencePoints", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateMemberExperiencePoints")
    @WebMethod
    @ResponseWrapper(localName = "createMemberExperiencePointsResponse", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateMemberExperiencePointsResponse")
    public void createMemberExperiencePoints(
        @WebParam(name = "memberExperiencePoints", targetNamespace = "")
        java.util.List<client.zt.MEMBEREXPERIENCEPOINTS> memberExperiencePoints
    );

    @RequestWrapper(localName = "createMemberRankInfo", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateMemberRankInfo")
    @WebMethod
    @ResponseWrapper(localName = "createMemberRankInfoResponse", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateMemberRankInfoResponse")
    public void createMemberRankInfo(
        @WebParam(name = "memberRankInfo", targetNamespace = "")
        java.util.List<client.zt.MEMBERRANKINFO> memberRankInfo
    );

    @RequestWrapper(localName = "executeJob", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.ExecuteJob")
    @WebMethod
    @ResponseWrapper(localName = "executeJobResponse", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.ExecuteJobResponse")
    public void executeJob();

    @RequestWrapper(localName = "createMemberExperiencePointsTotal", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateMemberExperiencePointsTotal")
    @WebMethod
    @ResponseWrapper(localName = "createMemberExperiencePointsTotalResponse", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateMemberExperiencePointsTotalResponse")
    public void createMemberExperiencePointsTotal(
        @WebParam(name = "memberExperiencePointsTotal", targetNamespace = "")
        client.zt.MEMBEREXPERIENCEPOINTSTOTAL memberExperiencePointsTotal
    );

    @RequestWrapper(localName = "createWorkstationDiscountPayment", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateWorkstationDiscountPayment")
    @WebMethod
    @ResponseWrapper(localName = "createWorkstationDiscountPaymentResponse", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateWorkstationDiscountPaymentResponse")
    public void createWorkstationDiscountPayment(
        @WebParam(name = "workstationDiscount", targetNamespace = "")
        java.util.List<client.zt.WORKSTATIONDISCOUNT> workstationDiscount
    );

    @RequestWrapper(localName = "createMemberDiscountPayment", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateMemberDiscountPayment")
    @WebMethod
    @ResponseWrapper(localName = "createMemberDiscountPaymentResponse", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateMemberDiscountPaymentResponse")
    public void createMemberDiscountPayment(
        @WebParam(name = "memberDiscount", targetNamespace = "")
        java.util.List<client.zt.MEMBERDISCOUNT> memberDiscount
    );

    @RequestWrapper(localName = "createMemberDiscountPaymentTotal", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateMemberDiscountPaymentTotal")
    @WebMethod
    @ResponseWrapper(localName = "createMemberDiscountPaymentTotalResponse", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateMemberDiscountPaymentTotalResponse")
    public void createMemberDiscountPaymentTotal(
        @WebParam(name = "memberDiscountTotal", targetNamespace = "")
        client.zt.MEMBERDISCOUNTTOTAL memberDiscountTotal
    );

    @RequestWrapper(localName = "createWorkstationDiscountPaymentTotal", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateWorkstationDiscountPaymentTotal")
    @WebMethod
    @ResponseWrapper(localName = "createWorkstationDiscountPaymentTotalResponse", targetNamespace = "http://soap.bonus.kasly.com/", className = "client.zt.CreateWorkstationDiscountPaymentTotalResponse")
    public void createWorkstationDiscountPaymentTotal(
        @WebParam(name = "workstationDiscountTotal", targetNamespace = "")
        client.zt.WORKSTATIONDISCOUNTTOTAL workstationDiscountTotal
    );
}

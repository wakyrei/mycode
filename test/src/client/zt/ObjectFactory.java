
package client.zt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client.zt package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateMemberDiscountPayment_QNAME = new QName("http://soap.bonus.kasly.com/", "createMemberDiscountPayment");
    private final static QName _CreateMemberDiscountPaymentResponse_QNAME = new QName("http://soap.bonus.kasly.com/", "createMemberDiscountPaymentResponse");
    private final static QName _CreateMemberDiscountPaymentTotal_QNAME = new QName("http://soap.bonus.kasly.com/", "createMemberDiscountPaymentTotal");
    private final static QName _CreateMemberDiscountPaymentTotalResponse_QNAME = new QName("http://soap.bonus.kasly.com/", "createMemberDiscountPaymentTotalResponse");
    private final static QName _CreateMemberExperiencePoints_QNAME = new QName("http://soap.bonus.kasly.com/", "createMemberExperiencePoints");
    private final static QName _CreateMemberExperiencePointsResponse_QNAME = new QName("http://soap.bonus.kasly.com/", "createMemberExperiencePointsResponse");
    private final static QName _CreateMemberExperiencePointsTotal_QNAME = new QName("http://soap.bonus.kasly.com/", "createMemberExperiencePointsTotal");
    private final static QName _CreateMemberExperiencePointsTotalResponse_QNAME = new QName("http://soap.bonus.kasly.com/", "createMemberExperiencePointsTotalResponse");
    private final static QName _CreateMemberRankInfo_QNAME = new QName("http://soap.bonus.kasly.com/", "createMemberRankInfo");
    private final static QName _CreateMemberRankInfoResponse_QNAME = new QName("http://soap.bonus.kasly.com/", "createMemberRankInfoResponse");
    private final static QName _CreateWorkstationDiscountPayment_QNAME = new QName("http://soap.bonus.kasly.com/", "createWorkstationDiscountPayment");
    private final static QName _CreateWorkstationDiscountPaymentResponse_QNAME = new QName("http://soap.bonus.kasly.com/", "createWorkstationDiscountPaymentResponse");
    private final static QName _CreateWorkstationDiscountPaymentTotal_QNAME = new QName("http://soap.bonus.kasly.com/", "createWorkstationDiscountPaymentTotal");
    private final static QName _CreateWorkstationDiscountPaymentTotalResponse_QNAME = new QName("http://soap.bonus.kasly.com/", "createWorkstationDiscountPaymentTotalResponse");
    private final static QName _ExecuteJob_QNAME = new QName("http://soap.bonus.kasly.com/", "executeJob");
    private final static QName _ExecuteJobResponse_QNAME = new QName("http://soap.bonus.kasly.com/", "executeJobResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client.zt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateMemberDiscountPayment }
     * 
     */
    public CreateMemberDiscountPayment createCreateMemberDiscountPayment() {
        return new CreateMemberDiscountPayment();
    }

    /**
     * Create an instance of {@link CreateMemberDiscountPaymentResponse }
     * 
     */
    public CreateMemberDiscountPaymentResponse createCreateMemberDiscountPaymentResponse() {
        return new CreateMemberDiscountPaymentResponse();
    }

    /**
     * Create an instance of {@link CreateMemberDiscountPaymentTotal }
     * 
     */
    public CreateMemberDiscountPaymentTotal createCreateMemberDiscountPaymentTotal() {
        return new CreateMemberDiscountPaymentTotal();
    }

    /**
     * Create an instance of {@link CreateMemberDiscountPaymentTotalResponse }
     * 
     */
    public CreateMemberDiscountPaymentTotalResponse createCreateMemberDiscountPaymentTotalResponse() {
        return new CreateMemberDiscountPaymentTotalResponse();
    }

    /**
     * Create an instance of {@link CreateMemberExperiencePoints }
     * 
     */
    public CreateMemberExperiencePoints createCreateMemberExperiencePoints() {
        return new CreateMemberExperiencePoints();
    }

    /**
     * Create an instance of {@link CreateMemberExperiencePointsResponse }
     * 
     */
    public CreateMemberExperiencePointsResponse createCreateMemberExperiencePointsResponse() {
        return new CreateMemberExperiencePointsResponse();
    }

    /**
     * Create an instance of {@link CreateMemberExperiencePointsTotal }
     * 
     */
    public CreateMemberExperiencePointsTotal createCreateMemberExperiencePointsTotal() {
        return new CreateMemberExperiencePointsTotal();
    }

    /**
     * Create an instance of {@link CreateMemberExperiencePointsTotalResponse }
     * 
     */
    public CreateMemberExperiencePointsTotalResponse createCreateMemberExperiencePointsTotalResponse() {
        return new CreateMemberExperiencePointsTotalResponse();
    }

    /**
     * Create an instance of {@link CreateMemberRankInfo }
     * 
     */
    public CreateMemberRankInfo createCreateMemberRankInfo() {
        return new CreateMemberRankInfo();
    }

    /**
     * Create an instance of {@link CreateMemberRankInfoResponse }
     * 
     */
    public CreateMemberRankInfoResponse createCreateMemberRankInfoResponse() {
        return new CreateMemberRankInfoResponse();
    }

    /**
     * Create an instance of {@link CreateWorkstationDiscountPayment }
     * 
     */
    public CreateWorkstationDiscountPayment createCreateWorkstationDiscountPayment() {
        return new CreateWorkstationDiscountPayment();
    }

    /**
     * Create an instance of {@link CreateWorkstationDiscountPaymentResponse }
     * 
     */
    public CreateWorkstationDiscountPaymentResponse createCreateWorkstationDiscountPaymentResponse() {
        return new CreateWorkstationDiscountPaymentResponse();
    }

    /**
     * Create an instance of {@link CreateWorkstationDiscountPaymentTotal }
     * 
     */
    public CreateWorkstationDiscountPaymentTotal createCreateWorkstationDiscountPaymentTotal() {
        return new CreateWorkstationDiscountPaymentTotal();
    }

    /**
     * Create an instance of {@link CreateWorkstationDiscountPaymentTotalResponse }
     * 
     */
    public CreateWorkstationDiscountPaymentTotalResponse createCreateWorkstationDiscountPaymentTotalResponse() {
        return new CreateWorkstationDiscountPaymentTotalResponse();
    }

    /**
     * Create an instance of {@link ExecuteJob }
     * 
     */
    public ExecuteJob createExecuteJob() {
        return new ExecuteJob();
    }

    /**
     * Create an instance of {@link ExecuteJobResponse }
     * 
     */
    public ExecuteJobResponse createExecuteJobResponse() {
        return new ExecuteJobResponse();
    }

    /**
     * Create an instance of {@link MEMBEREXPERIENCEPOINTS }
     * 
     */
    public MEMBEREXPERIENCEPOINTS createMEMBEREXPERIENCEPOINTS() {
        return new MEMBEREXPERIENCEPOINTS();
    }

    /**
     * Create an instance of {@link MEMBERRANKINFO }
     * 
     */
    public MEMBERRANKINFO createMEMBERRANKINFO() {
        return new MEMBERRANKINFO();
    }

    /**
     * Create an instance of {@link MEMBEREXPERIENCEPOINTSTOTAL }
     * 
     */
    public MEMBEREXPERIENCEPOINTSTOTAL createMEMBEREXPERIENCEPOINTSTOTAL() {
        return new MEMBEREXPERIENCEPOINTSTOTAL();
    }

    /**
     * Create an instance of {@link WORKSTATIONDISCOUNT }
     * 
     */
    public WORKSTATIONDISCOUNT createWORKSTATIONDISCOUNT() {
        return new WORKSTATIONDISCOUNT();
    }

    /**
     * Create an instance of {@link MEMBERDISCOUNT }
     * 
     */
    public MEMBERDISCOUNT createMEMBERDISCOUNT() {
        return new MEMBERDISCOUNT();
    }

    /**
     * Create an instance of {@link WORKSTATIONDISCOUNTTOTAL }
     * 
     */
    public WORKSTATIONDISCOUNTTOTAL createWORKSTATIONDISCOUNTTOTAL() {
        return new WORKSTATIONDISCOUNTTOTAL();
    }

    /**
     * Create an instance of {@link MEMBERDISCOUNTTOTAL }
     * 
     */
    public MEMBERDISCOUNTTOTAL createMEMBERDISCOUNTTOTAL() {
        return new MEMBERDISCOUNTTOTAL();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMemberDiscountPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createMemberDiscountPayment")
    public JAXBElement<CreateMemberDiscountPayment> createCreateMemberDiscountPayment(CreateMemberDiscountPayment value) {
        return new JAXBElement<CreateMemberDiscountPayment>(_CreateMemberDiscountPayment_QNAME, CreateMemberDiscountPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMemberDiscountPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createMemberDiscountPaymentResponse")
    public JAXBElement<CreateMemberDiscountPaymentResponse> createCreateMemberDiscountPaymentResponse(CreateMemberDiscountPaymentResponse value) {
        return new JAXBElement<CreateMemberDiscountPaymentResponse>(_CreateMemberDiscountPaymentResponse_QNAME, CreateMemberDiscountPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMemberDiscountPaymentTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createMemberDiscountPaymentTotal")
    public JAXBElement<CreateMemberDiscountPaymentTotal> createCreateMemberDiscountPaymentTotal(CreateMemberDiscountPaymentTotal value) {
        return new JAXBElement<CreateMemberDiscountPaymentTotal>(_CreateMemberDiscountPaymentTotal_QNAME, CreateMemberDiscountPaymentTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMemberDiscountPaymentTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createMemberDiscountPaymentTotalResponse")
    public JAXBElement<CreateMemberDiscountPaymentTotalResponse> createCreateMemberDiscountPaymentTotalResponse(CreateMemberDiscountPaymentTotalResponse value) {
        return new JAXBElement<CreateMemberDiscountPaymentTotalResponse>(_CreateMemberDiscountPaymentTotalResponse_QNAME, CreateMemberDiscountPaymentTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMemberExperiencePoints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createMemberExperiencePoints")
    public JAXBElement<CreateMemberExperiencePoints> createCreateMemberExperiencePoints(CreateMemberExperiencePoints value) {
        return new JAXBElement<CreateMemberExperiencePoints>(_CreateMemberExperiencePoints_QNAME, CreateMemberExperiencePoints.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMemberExperiencePointsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createMemberExperiencePointsResponse")
    public JAXBElement<CreateMemberExperiencePointsResponse> createCreateMemberExperiencePointsResponse(CreateMemberExperiencePointsResponse value) {
        return new JAXBElement<CreateMemberExperiencePointsResponse>(_CreateMemberExperiencePointsResponse_QNAME, CreateMemberExperiencePointsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMemberExperiencePointsTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createMemberExperiencePointsTotal")
    public JAXBElement<CreateMemberExperiencePointsTotal> createCreateMemberExperiencePointsTotal(CreateMemberExperiencePointsTotal value) {
        return new JAXBElement<CreateMemberExperiencePointsTotal>(_CreateMemberExperiencePointsTotal_QNAME, CreateMemberExperiencePointsTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMemberExperiencePointsTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createMemberExperiencePointsTotalResponse")
    public JAXBElement<CreateMemberExperiencePointsTotalResponse> createCreateMemberExperiencePointsTotalResponse(CreateMemberExperiencePointsTotalResponse value) {
        return new JAXBElement<CreateMemberExperiencePointsTotalResponse>(_CreateMemberExperiencePointsTotalResponse_QNAME, CreateMemberExperiencePointsTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMemberRankInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createMemberRankInfo")
    public JAXBElement<CreateMemberRankInfo> createCreateMemberRankInfo(CreateMemberRankInfo value) {
        return new JAXBElement<CreateMemberRankInfo>(_CreateMemberRankInfo_QNAME, CreateMemberRankInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMemberRankInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createMemberRankInfoResponse")
    public JAXBElement<CreateMemberRankInfoResponse> createCreateMemberRankInfoResponse(CreateMemberRankInfoResponse value) {
        return new JAXBElement<CreateMemberRankInfoResponse>(_CreateMemberRankInfoResponse_QNAME, CreateMemberRankInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateWorkstationDiscountPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createWorkstationDiscountPayment")
    public JAXBElement<CreateWorkstationDiscountPayment> createCreateWorkstationDiscountPayment(CreateWorkstationDiscountPayment value) {
        return new JAXBElement<CreateWorkstationDiscountPayment>(_CreateWorkstationDiscountPayment_QNAME, CreateWorkstationDiscountPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateWorkstationDiscountPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createWorkstationDiscountPaymentResponse")
    public JAXBElement<CreateWorkstationDiscountPaymentResponse> createCreateWorkstationDiscountPaymentResponse(CreateWorkstationDiscountPaymentResponse value) {
        return new JAXBElement<CreateWorkstationDiscountPaymentResponse>(_CreateWorkstationDiscountPaymentResponse_QNAME, CreateWorkstationDiscountPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateWorkstationDiscountPaymentTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createWorkstationDiscountPaymentTotal")
    public JAXBElement<CreateWorkstationDiscountPaymentTotal> createCreateWorkstationDiscountPaymentTotal(CreateWorkstationDiscountPaymentTotal value) {
        return new JAXBElement<CreateWorkstationDiscountPaymentTotal>(_CreateWorkstationDiscountPaymentTotal_QNAME, CreateWorkstationDiscountPaymentTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateWorkstationDiscountPaymentTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "createWorkstationDiscountPaymentTotalResponse")
    public JAXBElement<CreateWorkstationDiscountPaymentTotalResponse> createCreateWorkstationDiscountPaymentTotalResponse(CreateWorkstationDiscountPaymentTotalResponse value) {
        return new JAXBElement<CreateWorkstationDiscountPaymentTotalResponse>(_CreateWorkstationDiscountPaymentTotalResponse_QNAME, CreateWorkstationDiscountPaymentTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteJob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "executeJob")
    public JAXBElement<ExecuteJob> createExecuteJob(ExecuteJob value) {
        return new JAXBElement<ExecuteJob>(_ExecuteJob_QNAME, ExecuteJob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteJobResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.bonus.kasly.com/", name = "executeJobResponse")
    public JAXBElement<ExecuteJobResponse> createExecuteJobResponse(ExecuteJobResponse value) {
        return new JAXBElement<ExecuteJobResponse>(_ExecuteJobResponse_QNAME, ExecuteJobResponse.class, null, value);
    }

}

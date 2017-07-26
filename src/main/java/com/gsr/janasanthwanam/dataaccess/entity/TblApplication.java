package com.gsr.janasanthwanam.dataaccess.entity;
// Generated Jul 25, 2017 11:57:37 PM by Hibernate Tools 5.2.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblApplication generated by hbm2java
 */
@Entity
@Table(name = "tbl_application")
public class TblApplication implements java.io.Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -8187489062213068427L;
  private Integer pkApplication;
  //private TblUser tblUserByFkLastUpdatedUser;
  //private TblUser tblUserByFkCreatedUser;
  private String applicantName;
  private String district;
  private String gender;
  private String contactNumber;
  private String photo;
  private String fathersName;
  private Date dob;
  private String adhaarNumber;
  private String aadhaarImage;
  private String rationCardNumber;
  private String rationCardImage;
  private String cast;
  private String religion;
  private String address;
  private String houseNumber;
  private String village;
  private String panchayat;
  private String mobileNumber;
  private String landlineNumber;
  private String workDetails;
  private String familyDetails;
  private BigDecimal yearlyIncome;
  private String bankName;
  private String branchName;
  private String ifscCode;
  private String accountNumber;
  private String accountName;
  private String totalLandUserHas;
  private Date createdTime;
  private Date lastUpdatedTime;
  private String additionalDocuments;
  private String remarks;
  private Set<TblApplicationUserApprovalLevel> tblApplicationUserApprovalLevels = new HashSet<TblApplicationUserApprovalLevel>(
      0);

  public TblApplication() {
  }

  public TblApplication(TblUser tblUserByFkLastUpdatedUser, TblUser tblUserByFkCreatedUser,
      String applicantName, String district, String gender, String contactNumber, String photo,
      String fathersName, Date dob, String adhaarNumber, String aadhaarImage,
      String rationCardNumber, String rationCardImage, String cast, String religion, String address,
      String houseNumber, String village, String panchayat, String mobileNumber,
      String landlineNumber, String workDetails, String familyDetails, BigDecimal yearlyIncome,
      String bankName, String branchName, String ifscCode, String accountNumber, String accountName,
      String totalLandUserHas, Date createdTime, Date lastUpdatedTime, String additionalDocuments,
      String remarks) {
    //this.tblUserByFkLastUpdatedUser = tblUserByFkLastUpdatedUser;
    //this.tblUserByFkCreatedUser = tblUserByFkCreatedUser;
    this.applicantName = applicantName;
    this.district = district;
    this.gender = gender;
    this.contactNumber = contactNumber;
    this.photo = photo;
    this.fathersName = fathersName;
    this.dob = dob;
    this.adhaarNumber = adhaarNumber;
    this.aadhaarImage = aadhaarImage;
    this.rationCardNumber = rationCardNumber;
    this.rationCardImage = rationCardImage;
    this.cast = cast;
    this.religion = religion;
    this.address = address;
    this.houseNumber = houseNumber;
    this.village = village;
    this.panchayat = panchayat;
    this.mobileNumber = mobileNumber;
    this.landlineNumber = landlineNumber;
    this.workDetails = workDetails;
    this.familyDetails = familyDetails;
    this.yearlyIncome = yearlyIncome;
    this.bankName = bankName;
    this.branchName = branchName;
    this.ifscCode = ifscCode;
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    this.totalLandUserHas = totalLandUserHas;
    this.createdTime = createdTime;
    this.lastUpdatedTime = lastUpdatedTime;
    this.additionalDocuments = additionalDocuments;
    this.remarks = remarks;
  }

  public TblApplication(TblUser tblUserByFkLastUpdatedUser, TblUser tblUserByFkCreatedUser,
      String applicantName, String district, String gender, String contactNumber, String photo,
      String fathersName, Date dob, String adhaarNumber, String aadhaarImage,
      String rationCardNumber, String rationCardImage, String cast, String religion, String address,
      String houseNumber, String village, String panchayat, String mobileNumber,
      String landlineNumber, String workDetails, String familyDetails, BigDecimal yearlyIncome,
      String bankName, String branchName, String ifscCode, String accountNumber, String accountName,
      String totalLandUserHas, Date createdTime, Date lastUpdatedTime, String additionalDocuments,
      String remarks, Set<TblApplicationUserApprovalLevel> tblApplicationUserApprovalLevels) {
    //this.tblUserByFkLastUpdatedUser = tblUserByFkLastUpdatedUser;
    //this.tblUserByFkCreatedUser = tblUserByFkCreatedUser;
    this.applicantName = applicantName;
    this.district = district;
    this.gender = gender;
    this.contactNumber = contactNumber;
    this.photo = photo;
    this.fathersName = fathersName;
    this.dob = dob;
    this.adhaarNumber = adhaarNumber;
    this.aadhaarImage = aadhaarImage;
    this.rationCardNumber = rationCardNumber;
    this.rationCardImage = rationCardImage;
    this.cast = cast;
    this.religion = religion;
    this.address = address;
    this.houseNumber = houseNumber;
    this.village = village;
    this.panchayat = panchayat;
    this.mobileNumber = mobileNumber;
    this.landlineNumber = landlineNumber;
    this.workDetails = workDetails;
    this.familyDetails = familyDetails;
    this.yearlyIncome = yearlyIncome;
    this.bankName = bankName;
    this.branchName = branchName;
    this.ifscCode = ifscCode;
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    this.totalLandUserHas = totalLandUserHas;
    this.createdTime = createdTime;
    this.lastUpdatedTime = lastUpdatedTime;
    this.additionalDocuments = additionalDocuments;
    this.remarks = remarks;
    this.tblApplicationUserApprovalLevels = tblApplicationUserApprovalLevels;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)

  @Column(name = "pk_application", unique = true, nullable = false)
  public Integer getPkApplication() {
    return this.pkApplication;
  }

  public void setPkApplication(Integer pkApplication) {
    this.pkApplication = pkApplication;
  }

//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "fk_lastUpdatedUser", nullable = false)
//  public TblUser getTblUserByFkLastUpdatedUser() {
//    return this.tblUserByFkLastUpdatedUser;
//  }
//
//  public void setTblUserByFkLastUpdatedUser(TblUser tblUserByFkLastUpdatedUser) {
//    this.tblUserByFkLastUpdatedUser = tblUserByFkLastUpdatedUser;
//  }

//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "fk_createdUser", nullable = false)
//  public TblUser getTblUserByFkCreatedUser() {
//    return this.tblUserByFkCreatedUser;
//  }
//
//  public void setTblUserByFkCreatedUser(TblUser tblUserByFkCreatedUser) {
//    this.tblUserByFkCreatedUser = tblUserByFkCreatedUser;
//  }

  @Column(name = "applicantName", nullable = false, length = 256)
  public String getApplicantName() {
    return this.applicantName;
  }

  public void setApplicantName(String applicantName) {
    this.applicantName = applicantName;
  }

  @Column(name = "district", nullable = false, length = 256)
  public String getDistrict() {
    return this.district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  @Column(name = "gender", nullable = false, length = 10)
  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Column(name = "contactNumber", nullable = false, length = 50)
  public String getContactNumber() {
    return this.contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  @Column(name = "photo", nullable = false, length = 512)
  public String getPhoto() {
    return this.photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  @Column(name = "fathersName", nullable = false, length = 512)
  public String getFathersName() {
    return this.fathersName;
  }

  public void setFathersName(String fathersName) {
    this.fathersName = fathersName;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dob", nullable = false, length = 19)
  public Date getDob() {
    return this.dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  @Column(name = "adhaarNumber", nullable = false, length = 50)
  public String getAdhaarNumber() {
    return this.adhaarNumber;
  }

  public void setAdhaarNumber(String adhaarNumber) {
    this.adhaarNumber = adhaarNumber;
  }

  @Column(name = "aadhaarImage", nullable = false, length = 1024)
  public String getAadhaarImage() {
    return this.aadhaarImage;
  }

  public void setAadhaarImage(String aadhaarImage) {
    this.aadhaarImage = aadhaarImage;
  }

  @Column(name = "rationCardNumber", nullable = false, length = 100)
  public String getRationCardNumber() {
    return this.rationCardNumber;
  }

  public void setRationCardNumber(String rationCardNumber) {
    this.rationCardNumber = rationCardNumber;
  }

  @Column(name = "rationCardImage", nullable = false, length = 1024)
  public String getRationCardImage() {
    return this.rationCardImage;
  }

  public void setRationCardImage(String rationCardImage) {
    this.rationCardImage = rationCardImage;
  }

  @Column(name = "cast", nullable = false, length = 128)
  public String getCast() {
    return this.cast;
  }

  public void setCast(String cast) {
    this.cast = cast;
  }

  @Column(name = "religion", nullable = false, length = 128)
  public String getReligion() {
    return this.religion;
  }

  public void setReligion(String religion) {
    this.religion = religion;
  }

  @Column(name = "address", nullable = false, length = 1024)
  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Column(name = "houseNumber", nullable = false, length = 256)
  public String getHouseNumber() {
    return this.houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  @Column(name = "village", nullable = false, length = 256)
  public String getVillage() {
    return this.village;
  }

  public void setVillage(String village) {
    this.village = village;
  }

  @Column(name = "panchayat", nullable = false, length = 256)
  public String getPanchayat() {
    return this.panchayat;
  }

  public void setPanchayat(String panchayat) {
    this.panchayat = panchayat;
  }

  @Column(name = "mobileNumber", nullable = false, length = 50)
  public String getMobileNumber() {
    return this.mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  @Column(name = "landlineNumber", nullable = false, length = 50)
  public String getLandlineNumber() {
    return this.landlineNumber;
  }

  public void setLandlineNumber(String landlineNumber) {
    this.landlineNumber = landlineNumber;
  }

  @Column(name = "workDetails", nullable = false, length = 512)
  public String getWorkDetails() {
    return this.workDetails;
  }

  public void setWorkDetails(String workDetails) {
    this.workDetails = workDetails;
  }

  @Column(name = "familyDetails", nullable = false, length = 512)
  public String getFamilyDetails() {
    return this.familyDetails;
  }

  public void setFamilyDetails(String familyDetails) {
    this.familyDetails = familyDetails;
  }

  @Column(name = "yearlyIncome", nullable = false, precision = 20, scale = 0)
  public BigDecimal getYearlyIncome() {
    return this.yearlyIncome;
  }

  public void setYearlyIncome(BigDecimal yearlyIncome) {
    this.yearlyIncome = yearlyIncome;
  }

  @Column(name = " bankName", nullable = false, length = 512)
  public String getBankName() {
    return this.bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  @Column(name = "branchName", nullable = false, length = 512)
  public String getBranchName() {
    return this.branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  @Column(name = "ifscCode", nullable = false, length = 256)
  public String getIfscCode() {
    return this.ifscCode;
  }

  public void setIfscCode(String ifscCode) {
    this.ifscCode = ifscCode;
  }

  @Column(name = "accountNumber", nullable = false, length = 256)
  public String getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  @Column(name = "accountName", nullable = false, length = 256)
  public String getAccountName() {
    return this.accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  @Column(name = "totalLandUserHas", nullable = false, length = 256)
  public String getTotalLandUserHas() {
    return this.totalLandUserHas;
  }

  public void setTotalLandUserHas(String totalLandUserHas) {
    this.totalLandUserHas = totalLandUserHas;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "createdTime", nullable = false, length = 19)
  public Date getCreatedTime() {
    return this.createdTime;
  }

  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "lastUpdatedTime", nullable = false, length = 19)
  public Date getLastUpdatedTime() {
    return this.lastUpdatedTime;
  }

  public void setLastUpdatedTime(Date lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  @Column(name = "additionalDocuments", nullable = false, length = 1024)
  public String getAdditionalDocuments() {
    return this.additionalDocuments;
  }

  public void setAdditionalDocuments(String additionalDocuments) {
    this.additionalDocuments = additionalDocuments;
  }

  @Column(name = "remarks", nullable = false, length = 1024)
  public String getRemarks() {
    return this.remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "tblApplication")
  public Set<TblApplicationUserApprovalLevel> getTblApplicationUserApprovalLevels() {
    return this.tblApplicationUserApprovalLevels;
  }

  public void setTblApplicationUserApprovalLevels(
      Set<TblApplicationUserApprovalLevel> tblApplicationUserApprovalLevels) {
    this.tblApplicationUserApprovalLevels = tblApplicationUserApprovalLevels;
  }

}

package com.gsr.janasanthwanam.dataaccess.entity;
// Generated Jul 25, 2017 11:57:37 PM by Hibernate Tools 5.2.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblApplicationApprovalHistory generated by hbm2java
 */
@Entity
@Table(name = "tbl_application_approval_history")
public class TblApplicationApprovalHistory implements java.io.Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -1071950867531958148L;
  private Integer pkApplicationApprovalHistory;
  private int fkApplicationUserApprovalLevel;
  private Date startDate;
  private String approved;
  private String comment;
  private Date endDate;

  public TblApplicationApprovalHistory() {
  }

  public TblApplicationApprovalHistory(int fkApplicationUserApprovalLevel, Date startDate,
      String approved, String comment, Date endDate) {
    this.fkApplicationUserApprovalLevel = fkApplicationUserApprovalLevel;
    this.startDate = startDate;
    this.approved = approved;
    this.comment = comment;
    this.endDate = endDate;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)

  @Column(name = "pk_application_approval_history", unique = true, nullable = false)
  public Integer getPkApplicationApprovalHistory() {
    return this.pkApplicationApprovalHistory;
  }

  public void setPkApplicationApprovalHistory(Integer pkApplicationApprovalHistory) {
    this.pkApplicationApprovalHistory = pkApplicationApprovalHistory;
  }

  @Column(name = "fk_application_user_approval_level", nullable = false)
  public int getFkApplicationUserApprovalLevel() {
    return this.fkApplicationUserApprovalLevel;
  }

  public void setFkApplicationUserApprovalLevel(int fkApplicationUserApprovalLevel) {
    this.fkApplicationUserApprovalLevel = fkApplicationUserApprovalLevel;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "start_date", nullable = false, length = 19)
  public Date getStartDate() {
    return this.startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  @Column(name = "approved", nullable = false, length = 25)
  public String getApproved() {
    return this.approved;
  }

  public void setApproved(String approved) {
    this.approved = approved;
  }

  @Column(name = "comment", nullable = false, length = 512)
  public String getComment() {
    return this.comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "end_date", nullable = false, length = 19)
  public Date getEndDate() {
    return this.endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

}
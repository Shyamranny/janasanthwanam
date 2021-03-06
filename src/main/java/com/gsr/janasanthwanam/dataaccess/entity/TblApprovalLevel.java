package com.gsr.janasanthwanam.dataaccess.entity;
// Generated Jul 25, 2017 11:57:37 PM by Hibernate Tools 5.2.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TblApprovalLevel generated by hbm2java
 */
@Entity
@Table(name = "tbl_approval_level")
public class TblApprovalLevel implements java.io.Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 781821861405724130L;
  private Integer pkApprovalLevel;
  private String approvalLevelName;
  private Set<TblUserApprovalLevel> tblUserApprovalLevels = new HashSet<TblUserApprovalLevel>(0);

  public TblApprovalLevel() {
  }

  public TblApprovalLevel(String approvalLevelName) {
    this.approvalLevelName = approvalLevelName;
  }

  public TblApprovalLevel(String approvalLevelName,
      Set<TblUserApprovalLevel> tblUserApprovalLevels) {
    this.approvalLevelName = approvalLevelName;
    this.tblUserApprovalLevels = tblUserApprovalLevels;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)

  @Column(name = "pk_approval_level", unique = true, nullable = false)
  public Integer getPkApprovalLevel() {
    return this.pkApprovalLevel;
  }

  public void setPkApprovalLevel(Integer pkApprovalLevel) {
    this.pkApprovalLevel = pkApprovalLevel;
  }

  @Column(name = "approval_level_name", nullable = false, length = 50)
  public String getApprovalLevelName() {
    return this.approvalLevelName;
  }

  public void setApprovalLevelName(String approvalLevelName) {
    this.approvalLevelName = approvalLevelName;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "tblApprovalLevel")
  public Set<TblUserApprovalLevel> getTblUserApprovalLevels() {
    return this.tblUserApprovalLevels;
  }

  public void setTblUserApprovalLevels(Set<TblUserApprovalLevel> tblUserApprovalLevels) {
    this.tblUserApprovalLevels = tblUserApprovalLevels;
  }

}

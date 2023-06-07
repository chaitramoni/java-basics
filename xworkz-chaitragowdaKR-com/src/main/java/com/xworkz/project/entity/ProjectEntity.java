package com.xworkz.project.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "bekary.signup_table")

@NamedQuery(name = "findByCount" , query = "select count(*) from ProjectEntity ct where ct.userId = :d	 or ct.email = :e or ct.mobile = :p")
@NamedQuery(name = "emailId",query = "select count(*) from  ProjectEntity ent where ent.email=:emailBy")
@NamedQuery(name = "userId",query = "select count(*) from  ProjectEntity ent where ent.userId=:userBy")
@NamedQuery(name = "mobileId",query = "select count(*) from  ProjectEntity ent where ent.mobile=:mobileBy")
@NamedQuery(name="userANDpassword",query = "select ent from ProjectEntity ent where ent.userId=:ui")
@NamedQuery(name = "lockCount",query = "update  ProjectEntity ent set ent.lockcount=:c where ent.userId=:d ")
@NamedQuery(name = "email",query = "select ent from ProjectEntity ent where ent.email=:ei")
@NamedQuery(name = "updatePassword", query = "update ProjectEntity ent set ent.password=:up, ent.resetPassword=:urp, ent.passwordChangedTime=:pct where ent.userId=:uu")

public class ProjectEntity implements Serializable {
	@Id
	@Column(name = "s_signupId")
	private int signupId;
	
	@Column(name = "s_userId")
	private String userId;
	
	@Column(name = "s_email")
	private String email;
	
	@Column(name = "s_mobile")
	private long mobile;
	
	@Column(name = "s_password")
	private String password;
	
	@Column(name = "s_createdBy")
	private String createdBy;
	
	@Column(name = "s_createdDate")
	private LocalDateTime createdDate;
	
	@Column(name = "s_updateBy")
	private String updateBy;
	
	@Column(name = "s_updateDate")
	private LocalDateTime updateDate;
	
	
	@Column(name = "s_lockCount")
	private int lockcount;
	
	@Column(name = "s_resetPassword")
	private Boolean resetPassword;
	
	
	@Column(name = "s_s_passwordChangedTime")
	private LocalTime passwordChangedTime;
	
	
	@Column(name = "s_picName")
	private String picName;
	
	@OneToMany(mappedBy = "projectEntity",fetch = FetchType.EAGER,cascade = CascadeType.ALL )
	private List<TechnologyEntity>technology;
	
	
	

}

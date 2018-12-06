package com.demo.graphql.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "userrole")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id()
    @Column(name = "id")
    private String id;
    
    @Column(name = "user_id")
    private String userId;

    private String scope;
    
    @ManyToOne
    @JoinColumn(name = "user_id", insertable=false, updatable=false)
    private User user;

}

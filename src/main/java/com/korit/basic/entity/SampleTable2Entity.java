package com.korit.basic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sample_table_2")
public class SampleTable2Entity {

  @Id
  // @GeneratedValue:
  // - PRIMARY KEY에 값을 자동 생성하는 전략을 지정해주는 어노테이션
  // - strategy 속성 : 자동 생성 전략을 지정
  // - GenerationType.AUTO: JPA가 적절한 생성 전략을 지정
  // - GeneratonType.IDENTITY: auto increment 전략
  private Integer aiPk;

  private String sampleColumn;
  
}

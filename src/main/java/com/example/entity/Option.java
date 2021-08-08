package com.example.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Option {

  @Id @GeneratedValue private Integer id;
  private String a;
  private String b;
  private String c;
  private String d;
}

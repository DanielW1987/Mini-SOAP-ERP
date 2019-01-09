package com.lucanet.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Getter
@Setter
public class PostingRequest {

  @XmlElement(required = true) private String accountingAreaNumber;
  @XmlElement(required = true) private int    fiscalYear;

}
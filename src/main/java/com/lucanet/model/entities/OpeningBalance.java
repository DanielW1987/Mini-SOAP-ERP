package com.lucanet.model.entities;

import com.lucanet.model.core.Identifiable;
import com.lucanet.model.core.ObjectID;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Getter
public class OpeningBalance implements Identifiable {

  @XmlAttribute private long   id;
  @XmlElement   private String accountingAreaNumber;
  @XmlElement   private int    fiscalYear;
  @XmlElement   private String accountNumber;
  @XmlElement   private long   value;
  @XmlElement   private int    decimalDigits;

  public OpeningBalance(String accountingAreaNumber, int fiscalYear, String accountNumber, long value, int decimalDigits) {
    this.id = ObjectID.nextId();
    this.accountingAreaNumber = accountingAreaNumber;
    this.fiscalYear = fiscalYear;
    this.accountNumber = accountNumber;
    this.value = value;
    this.decimalDigits = decimalDigits;
  }
}
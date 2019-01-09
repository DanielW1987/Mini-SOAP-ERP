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
public class PostingLine implements Identifiable {

  @XmlAttribute private long   id;
  @XmlElement   private int    lineNumber;
  @XmlElement   private String accountNumber;
  @XmlElement   private String costCenterNumber;
  @XmlElement   private long   value;
  @XmlElement   private int    decimalDigits;
  @XmlElement   private String postingLineDescription;

  public PostingLine(int lineNumber, String accountNumber, String costCenterNumber, long value, int decimalDigits, String postingLineDescription) {
    this.id = ObjectID.nextId();
    this.lineNumber = lineNumber;
    this.accountNumber = accountNumber;
    this.costCenterNumber = costCenterNumber;
    this.value = value;
    this.decimalDigits = decimalDigits;
    this.postingLineDescription = postingLineDescription;
  }

}
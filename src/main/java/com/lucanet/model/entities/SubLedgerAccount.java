package com.lucanet.model.entities;

import com.lucanet.model.core.Identifiable;
import com.lucanet.model.core.ObjectID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Getter
@ToString(includeFieldNames = false, of = {"number", "name"})
public class SubLedgerAccount implements Identifiable {

  @XmlAttribute private long   id;
  @XmlElement   private String number;
  @XmlElement   private String name;
  @XmlElement   private String collectiveAccountNumber;
  @XmlElement   private String type;

  public SubLedgerAccount(String number, String name, String collectiveAccountNumber, String type) {
    this.id = ObjectID.nextId();
    this.number = number;
    this.name = name;
    this.collectiveAccountNumber = collectiveAccountNumber;
    this.type = type;
  }

}
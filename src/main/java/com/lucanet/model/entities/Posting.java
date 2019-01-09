package com.lucanet.model.entities;

import com.lucanet.model.adapter.LocalDateAdapter;
import com.lucanet.model.core.Identifiable;
import com.lucanet.model.core.ObjectID;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Getter
public class Posting implements Identifiable {

  @XmlAttribute private long   id;
  @XmlElement   private String accountingAreaNumber;
  @XmlElement   private int    fiscalYear;
  @XmlElement   private int    postingNumber;
  @XmlElement   private String creator;
  @XmlElement   private String postingDescription;
  @XmlElement   private String dmsCode;

  @XmlElement
  @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
  private LocalDate postingDate;

  @XmlElement
  @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
  private LocalDate creationDate;

  @XmlElement(name="postingLine")
  @XmlElementWrapper
  private List<PostingLine> postingLines;

  public Posting(String accountingAreaNumber, int fiscalYear, int postingNumber, LocalDate postingDate, String creator,
          LocalDate creationDate, String postingDescription, String dmsCode, List<PostingLine> postingLines) {
    this.id = ObjectID.nextId();
    this.accountingAreaNumber = accountingAreaNumber;
    this.fiscalYear = fiscalYear;
    this.postingNumber = postingNumber;
    this.postingDate = postingDate;
    this.creator = creator;
    this.creationDate = creationDate;
    this.postingDescription = postingDescription;
    this.dmsCode = dmsCode;
    this.postingLines = postingLines;
  }

}
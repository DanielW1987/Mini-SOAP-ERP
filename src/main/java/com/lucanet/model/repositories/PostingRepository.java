package com.lucanet.model.repositories;

import com.lucanet.model.core.AbstractRepository;
import com.lucanet.model.entities.Posting;
import com.lucanet.model.entities.PostingLine;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;

@Component
@SuppressWarnings("unused") // Spring bean
public class PostingRepository extends AbstractRepository<Posting> {

  @PostConstruct
  @SuppressWarnings("unused") // invoked by Spring Container
  private void init() {
    put(new Posting("1000", 2012, 1, LocalDate.of(2012, 1, 1), "Jane Doe",
                    LocalDate.of(2012, 1, 8), "Revenue", "10000",
                    Arrays.asList(new PostingLine(1, "10002", "" , 1190_00, 2, ""),
                                  new PostingLine(2, "8000", "2" , -1000_00, 2, "Project payoff"),
                                  new PostingLine(3, "1410", "" , -190_00, 2, ""))));

    put( new Posting("1000", 2012, 2, LocalDate.of(2012, 1, 1), "Jane Doe",
                     LocalDate.of(2012, 1, 8), "Hello expense", "10001",
                     Arrays.asList(new PostingLine(1, "4000", "1", 300_00, 2, "Wages NN1"),
                                   new PostingLine(2, "4000", "2", 300_00, 2, "Wages NN2"),
                                   new PostingLine(3, "4000", "3", 300_00, 2, "Wages NN3"),
                                   new PostingLine(4, "1000", "", -900_00, 2, ""))));

    put( new Posting("1000", 2012, 3, LocalDate.of(2012, 2, 1), "Joe Sample",
                     LocalDate.of(2012, 2, 8), "Purchase machine", "10002",
                     Arrays.asList(new PostingLine(1, "0400", "", 5000_00, 2, "Purchase machine"),
                                   new PostingLine(2, "1000", "", -5000_00, 2, "Purchase machine"))));

    put( new Posting("1000", 2012, 4, LocalDate.of(2012, 2, 1), "Joe Sample",
                     LocalDate.of(2012, 2, 1), "Depreciation machine", "10003",
                     Arrays.asList(new PostingLine(1, "4100", "", 500_00, 2, "Depreciation machine"),
                                   new PostingLine(2, "0400", "", -500_00, 2, "Depreciation machine"))));

    put( new Posting("1000", 2012, 5, LocalDate.of(2012, 1, 31), "Joe Sample",
                     LocalDate.of(2012, 2, 2), "Rent January 2012", "10004",
                     Arrays.asList(new PostingLine(1, "4200", "", 5000_00, 2, "Payment rent"),
                                   new PostingLine(2, "1000", "", -5950_00, 2, "Payment rent"),
                                   new PostingLine(3, "1401", "", 950_00, 2, "Input Tax rent"))));

    put( new Posting("1000", 2012, 6, LocalDate.of(2012, 2, 28), "Joe Sample",
                     LocalDate.of(2012, 3, 3), "Rent February 2012", "10005",
                     Arrays.asList(new PostingLine(1, "4200", "", 5000_00, 2, "Payment rent"),
                                   new PostingLine(2, "1000", "", -5950_00, 2, "Payment rent"),
                                   new PostingLine(3, "1401", "", 950_00, 2, "Input Tax rent"))));

    put( new Posting("1000", 2012, 7, LocalDate.of(2012, 3, 31), "Joe Sample",
                     LocalDate.of(2012, 4, 4), "Rent  March 2012", "10006",
                     Arrays.asList(new PostingLine(1, "4200", "", 5000_00, 2, "Payment rent"),
                                   new PostingLine(2, "1000", "", -5950_00, 2, "Payment rent"),
                                   new PostingLine(3, "1401", "", 950_00, 2, "Input Tax rent"))));

    put( new Posting("1000", 2012, 8, LocalDate.of(2012, 4, 30), "Joe Sample",
                     LocalDate.of(2012, 5, 5), "Rent  April 2012", "10007",
                     Arrays.asList(new PostingLine(1, "4200", "", 5000_00, 2, "Payment rent"),
                                   new PostingLine(2, "1000", "", -5950_00, 2, "Payment rent"),
                                   new PostingLine(3, "1401", "", 950_00, 2, "Input Tax rent"))));

    put( new Posting("1000", 2012, 9, LocalDate.of(2012, 5, 30), "Joe Sample",
                     LocalDate.of(2012, 6, 6), "Rent  May 2012", "10008",
                     Arrays.asList(new PostingLine(1, "4200", "", 5000_00, 2, "Payment rent"),
                                   new PostingLine(2, "1000", "", -5950_00, 2, "Payment rent"),
                                   new PostingLine(3, "1401", "", 950_00, 2, "Input Tax rent"))));

    put( new Posting("1000", 2012, 10, LocalDate.of(2012, 6, 30), "Joe Sample",
                     LocalDate.of(2012, 7, 7), "Rent  June 2012", "10009",
                     Arrays.asList(new PostingLine(1, "4200", "", 5000_00, 2, "Payment rent"),
                                   new PostingLine(2, "1000", "", -5950_00, 2, "Payment rent"),
                                   new PostingLine(3, "1401", "", 950_00, 2, "Input Tax rent"))));

    put( new Posting("1000", 2012, 11, LocalDate.of(2012, 7, 30), "Joe Sample",
                     LocalDate.of(2012, 8, 8), "Rent  July 2012", "10010",
                     Arrays.asList(new PostingLine(1, "4200", "", 5000_00, 2, "Payment rent"),
                                   new PostingLine(2, "1000", "", -5950_00, 2, "Payment rent"),
                                   new PostingLine(3, "1401", "", 950_00, 2, "Input Tax rent"))));

    put( new Posting("1000", 2012, 12, LocalDate.of(2012, 8, 30), "Joe Sample",
                     LocalDate.of(2012, 9, 9), "Rent  August 2012", "10011",
                     Arrays.asList(new PostingLine(1, "4200", "", 5000_00, 2, "Payment rent"),
                                   new PostingLine(2, "1000", "", -5950_00, 2, "Payment rent"),
                                   new PostingLine(3, "1401", "", 950_00, 2, "Input Tax rent"))));

    put( new Posting("1000", 2012, 13, LocalDate.of(2012, 9, 30), "Joe Sample",
                     LocalDate.of(2012, 10, 10), "Rent  September 2012", "10012",
                     Arrays.asList(new PostingLine(1, "4200", "", 5000_00, 2, "Payment rent"),
                                   new PostingLine(2, "1000", "", -5950_00, 2, "Payment rent"),
                                   new PostingLine(3, "1401", "", 950_00, 2, "Input Tax rent"))));

    put( new Posting("1000", 2012, 14, LocalDate.of(2012, 10, 30), "Joe Sample",
                     LocalDate.of(2012, 11, 11), "Rent  October 2012", "10013",
                     Arrays.asList(new PostingLine(1, "4200", "", 5000_00, 2, "Payment rent"),
                                   new PostingLine(2, "1000", "", -5950_00, 2, "Payment rent"),
                                   new PostingLine(3, "1401", "", 950_00, 2, "Input Tax rent"))));

    put( new Posting("1000", 2012, 15, LocalDate.of(2012, 11, 30), "Joe Sample",
                     LocalDate.of(2012, 12, 12), "Rent  November 2012", "10014",
                     Arrays.asList(new PostingLine(1, "4200", "", 5000_00, 2, "Payment rent"),
                                   new PostingLine(2, "1000", "", -5950_00, 2, "Payment rent"),
                                   new PostingLine(3, "1401", "", 950_00, 2, "Input Tax rent"))));

    put( new Posting("1000", 2012, 16, LocalDate.of(2012, 12, 30), "Joe Sample",
                     LocalDate.of(2012, 12, 31), "Rent  December 2012", "10015",
                     Arrays.asList(new PostingLine(1, "4200", "", 5000_00, 2, "Payment rent"),
                                   new PostingLine(2, "1000", "", -5950_00, 2, "Payment rent"),
                                   new PostingLine(3, "1401", "", 950_00, 2, "Input Tax rent"))));

    put( new Posting("2000", 2012, 1, LocalDate.of(2012, 1, 1), "Bill Smith",
                     LocalDate.of(2012, 1, 8), "Hello sales", "10016",
                     Arrays.asList(new PostingLine(1, "1000", "", 2380_00, 2, ""),
                                   new PostingLine(2,"8000", "2", -2000_00, 2, "Project payoff"),
                                   new PostingLine(3,"1410", "", -380_00, 2, ""))));

    put( new Posting("2000", 2012, 2, LocalDate.of(2012, 1, 1), "Bill Smith",
                     LocalDate.of(2012, 1, 8), "IC expense", "10017",
                     Arrays.asList(new PostingLine(1, "4000", "1", 400_00, 2, "Wages NN1"),
                                   new PostingLine(2,"4000", "2", 400_00, 2, "Wages NN2"),
                                   new PostingLine(3,"4000", "3", 200_00, 2, "Wages NN3"),
                                   new PostingLine(4,"1410", "", 190_00, 2, ""),
                                   new PostingLine(5,"70001", "", -1190_00, 2, ""))));

    put( new Posting("2000", 2012, 3, LocalDate.of(2012, 2, 1), "Bill Smith",
                     LocalDate.of(2012, 2, 8), "Purchase machine", "10018",
                     Arrays.asList(new PostingLine(1, "0400", "", 7000_00, 2, "Purchase machine"),
                                   new PostingLine(2,"1000", "", -7000_00, 2, "Purchase machine"))));

    put( new Posting("2000", 2012, 4, LocalDate.of(2012, 12, 31), "Bill Smith",
                     LocalDate.of(2012, 2, 1), "Depreciation machine", "10019",
                     Arrays.asList(new PostingLine(1, "4100", "", 700_00, 2, "Depreciation machine"),
                                   new PostingLine(2,"0400", "", -700_00, 2, "Depreciation machine"))));

  }

}
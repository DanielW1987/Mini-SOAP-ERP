package com.lucanet.soap;

import com.lucanet.model.entities.*;
import com.lucanet.model.request.PostingRequest;

import java.util.List;

@SuppressWarnings("unused") // SOAP API
public interface MiniSoapErp {

  String ENDPOINT_NAME = "MiniSoapErp";

  List<Account> getAllAccounts();

  Account getAccountById(long id);

  List<CostCenter> getAllCostCenters();

  CostCenter getCostCenterById(long id);

  List<SubLedgerAccount> getAllSubLedgerAccounts();

  SubLedgerAccount getSubLedgerAccountById(long id);

  List<AccountingArea> getAllAccountingAreas();

  AccountingArea getAccountingAreaById(long id);

  List<Posting> getAllPostings(PostingRequest request);

  List<OpeningBalance> getAllOpeningBalances(PostingRequest request);

}
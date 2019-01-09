package com.lucanet.soap;

import com.lucanet.model.core.Repository;
import com.lucanet.model.entities.*;
import com.lucanet.model.request.PostingRequest;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;
import java.util.stream.Collectors;

@WebService(name = MiniSoapErp.ENDPOINT_NAME)
public class MiniSoapErpImpl implements MiniSoapErp {

  @Autowired private Repository<Account>          accountRepository;
  @Autowired private Repository<AccountingArea>   accountingAreaRepository;
  @Autowired private Repository<CostCenter>       costCenterRepository;
  @Autowired private Repository<SubLedgerAccount> subLedgerAccountRepository;
  @Autowired private Repository<Posting>          postingRepository;
  @Autowired private Repository<OpeningBalance>   openingBalanceRepository;

  @Override
  @WebResult(name = "account")
  public List<Account> getAllAccounts() {
    return accountRepository.getAll();
  }

  @Override
  @WebResult(name = "account")
  public Account getAccountById(@WebParam(name = "accountId") long id) {
    return accountRepository.getById(id);
  }

  @Override
  @WebResult(name = "costCenter")
  public List<CostCenter> getAllCostCenters() {
    return costCenterRepository.getAll();
  }

  @Override
  @WebResult(name = "costCenter")
  public CostCenter getCostCenterById(@WebParam(name = "costCenterId") long id) {
    return costCenterRepository.getById(id);
  }

  @Override
  @WebResult(name = "subLedgerAccount")
  public List<SubLedgerAccount> getAllSubLedgerAccounts() {
    return subLedgerAccountRepository.getAll();
  }

  @Override
  @WebResult(name = "subLedgerAccount")
  public SubLedgerAccount getSubLedgerAccountById(@WebParam(name = "subLedgerAccountId") long id) {
    return subLedgerAccountRepository.getById(id);
  }

  @Override
  @WebResult(name = "accountingArea")
  public List<AccountingArea> getAllAccountingAreas() {
    return accountingAreaRepository.getAll();
  }

  @Override
  @WebResult(name = "accountingArea")
  public AccountingArea getAccountingAreaById(@WebParam(name = "accountAreaId") long id) {
    return accountingAreaRepository.getById(id);
  }

  @Override
  @WebResult(name = "posting")
  public List<Posting> getAllPostings(@WebParam(name = "postingRequest") PostingRequest request) {
    return postingRepository.getAll()
                            .stream()
                            .filter(p -> p.getAccountingAreaNumber().equals(request.getAccountingAreaNumber()))
                            .filter(p -> p.getFiscalYear() == request.getFiscalYear())
                            .collect(Collectors.toList());
  }

  @Override
  @WebResult(name = "openingBalance")
  public List<OpeningBalance> getAllOpeningBalances(@WebParam(name = "openingBalanceRequest") PostingRequest request) {
    return openingBalanceRepository.getAll()
                                   .stream()
                                   .filter(p -> p.getAccountingAreaNumber().equals(request.getAccountingAreaNumber()))
                                   .filter(p -> p.getFiscalYear() == request.getFiscalYear())
                                   .collect(Collectors.toList());
  }

}
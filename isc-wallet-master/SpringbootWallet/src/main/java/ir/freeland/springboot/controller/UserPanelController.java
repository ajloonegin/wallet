package ir.freeland.springboot.controller;

import ir.freeland.springboot.dto.inputdto.*;
import ir.freeland.springboot.model.constant.Operation;
import ir.freeland.springboot.model.entity.Transaction;
import ir.freeland.springboot.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ir.freeland.springboot.services.AccountService;

import jakarta.validation.Valid;

import java.util.List;

@Controller
@RequestMapping(value = "/home/userpanel")
public class UserPanelController {

	

	@Autowired
	private AccountService accountService;

	@Autowired
	private TransactionService transactionService;

	
	
	@GetMapping(value ="/")
	
	public String showUserPanelPage() {
		return "sample3";
	}

	
	@GetMapping(value ="/deposit")
	
	public String deposit(Model model) {
		model.addAttribute("depositInputDto", new DepositInputDto());
		return "sample13";

	}

	
	@PostMapping(value ="/deposit/result")
	
	public String depositResult(DepositInputDto depositInputDto) {
		accountService.deposit(depositInputDto);
		transactionService.createTransaction(depositInputDto, Operation.DEPOSIT);

		return "resultdepositaccount";
	}

	@GetMapping(value ="/withdraw")
	
	public String withdraw(Model model) {
		model.addAttribute("withdrawInputDto", new WithdrawInputDto());
		return "sample14";

	}

	@PostMapping(value ="/withdraw/result")
	
	public String withdrawResult(WithdrawInputDto withdrawInputDto) {
		accountService.withdraw(withdrawInputDto);
		transactionService.createTransaction(withdrawInputDto, Operation.WITHDRAW);
		return "resultwithdrawaccount";
	}

	@GetMapping(value ="/transfer")
	
	public String transfer(Model model) {
		model.addAttribute("transferInputDto", new TransferInputDto());
		return "sample15";

	}

	@PostMapping(value ="/transfer/result")
	
	public String transferResult(TransferInputDto transferInputDto) {
		accountService.transfer(transferInputDto);
		transactionService.createTransaction(transferInputDto, Operation.TRANSFER);
		return "resulttransfer";
	}

	@GetMapping(value ="/listoftransaction")
	
	public String showListOfTransaction(Model model) {
		model.addAttribute("transactionInputDto", new TransactionInputDto());
		return "sample16";
	}

	@PostMapping(value ="/listoftransaction/result")
	
	public String listOfTransactionResult(@ModelAttribute("transactionInputDto") TransactionInputDto transactionInputDto, Model model) {
		List<Transaction> transaction=accountService.showTransaction(transactionInputDto);
		model.addAttribute("transaction", transaction);
		return "resulttransactions";
	}

}

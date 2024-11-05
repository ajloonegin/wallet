package ir.freeland.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import ir.freeland.springboot.dto.inputdto.AddAccountInputDto;
import ir.freeland.springboot.dto.inputdto.AddPersonInputDto;
import ir.freeland.springboot.dto.inputdto.DeleteAccountInputDto;
import ir.freeland.springboot.dto.inputdto.DeletePersonInputDto;
import ir.freeland.springboot.dto.inputdto.FindAccountInputDto;
import ir.freeland.springboot.dto.inputdto.FindPersonInputDto;
import ir.freeland.springboot.dto.inputdto.UpdateAccountInputDto;
import ir.freeland.springboot.dto.inputdto.UpdatePersonInputDto;
import ir.freeland.springboot.model.entity.Account;
import ir.freeland.springboot.model.entity.Person;
import ir.freeland.springboot.services.AccountService;
import ir.freeland.springboot.services.PersonService;
import jakarta.validation.Valid;

@Controller
@RequestMapping(value = "/home/adminpanel")
public class AdminPanelController {

	@Autowired
	private PersonService personService;

	@Autowired
	private AccountService accountService;


	
	@GetMapping(value ="/")
	
	public String showAdminPanelPage() {
		return "sample2";
		
	}
	
	
	@GetMapping(value ="/findallperson")
	
	public List<Person> getPersons() {
		return personService.getAllPersons();
	}
	
	//check it
//	@GetMapping("/findallperson")
//	public String getPersons(Model model) {
//		List<Person> persons = personService.getAllPersons();
//		model.addAttribute("persons", persons); // Add the users to the model
//		return "persons"; // Return the name of the JSP view
//	}
	
	
	@GetMapping(value ="/findallaccount")
	
	public List<Account> getAccounts() {
		return accountService.getAllAccounts();
	}

	// page add person-admin panel if choose add person button
	
	@GetMapping(value ="/addperson")
	public String addPerson(Model model) {
		model.addAttribute("addpersoninputDto", new AddPersonInputDto());
		return "sample4";
	}

	
	@PostMapping(value ="/addperson/result")
	public String addPersonResult( AddPersonInputDto addPersonInputDto) {

		personService.createPerson(addPersonInputDto);

		return "resultaddnewperson";
	}

	// page add account-admin panel if choose add account button
	
	@GetMapping(value ="/addaccount")
	public String addAccount(Model model) {
		model.addAttribute("addAccountInputDto", new AddAccountInputDto());
		return "sample9";
	}

	
	@PostMapping(value ="/addaccount/result")
	public String addAccountResult( AddAccountInputDto addAccountInputDto) {
		accountService.createAccount(addAccountInputDto);

		return "resultaddaccount";
	}


	
	@GetMapping(value ="/findperson")
	public String findPerson(Model model) {
		model.addAttribute("findPersonInputDto", new FindPersonInputDto());
		return "sample6";
	}

	
	@PostMapping(value ="/findperson/result")
	public String findPersonResult(@ModelAttribute("findPersonInputDto") FindPersonInputDto findPersonInputDto, Model model) {

		Person person = personService.findPersonByNationalCode(findPersonInputDto.getNationalCode());
		System.out.println(person);
		model.addAttribute("person", person);
		return "resultfindperson";
	}

	
	@GetMapping(value ="/findaccount")
	public String findAccount(Model model) {
		model.addAttribute("findAccountInputDto", new FindAccountInputDto());
		return "sample10";
	}

	

	
	@PostMapping(value ="/findaccount/result")
	public String findAccountResult(@ModelAttribute("findAccountInputDto") FindAccountInputDto findAccountInputDto , Model model) {

		Account account = accountService.findAccountByAccountNumber(findAccountInputDto.getAccountNumber());
		model.addAttribute("account", account);
		System.out.println(account);
		return "resultfindaccount";
	}

	
	@GetMapping(value ="/updateperson")
	public String updatePerson(Model model) {
		model.addAttribute("updatepersoninputdto", new UpdatePersonInputDto());
		return "sample7";
	}

	
	@PostMapping(value ="/updateperson/result")
	public String updatePersonResult(@Valid @RequestBody UpdatePersonInputDto updatePersonInputDto) {
		personService.updatePerson(updatePersonInputDto.getId(), updatePersonInputDto);

		return "redirect:/home/adminpanel/findallperson";
	}

	
	@GetMapping(value ="/updateaccount")
	public String updateAccount(Model model) {
		model.addAttribute("updateAccountInputDto", new UpdateAccountInputDto());
		return "sample11";
	}

	
	@PostMapping(value ="/updateaccount/result")
	public String updateAccountResult(@Valid @RequestBody UpdateAccountInputDto updateAccountInputDto) {
		accountService.updateAccount(updateAccountInputDto.getId(), updateAccountInputDto);

		return "redirect:/home/adminpanel/findallaccount";
	}

	
	@GetMapping(value ="/deleteperson")
	public String deletePerson() {
		return "sample8";
	}

	
	@PostMapping(value ="/deleteperson/result")
	public String deletePersonResult(@Valid @RequestBody DeletePersonInputDto deletePersonInputDto) {
		personService.deletePerson(deletePersonInputDto);

		return "redirect:/home/adminpanel/findallperson";
	}

	
	@GetMapping(value ="/deleteaccount")
	public String deleteAccount(Model model) {
		model.addAttribute("deleteAccountInputDto", new DeleteAccountInputDto());
		return "sample12";
	}

	
	@PostMapping(value ="/deleteaccount/result")
	public String deleteAccountResult(@Valid @RequestBody DeleteAccountInputDto deleteAccountInputDto) {
		accountService.deleteAccount(deleteAccountInputDto);

		return "redirect:/home/adminpanel/findallaccount";
	}



}

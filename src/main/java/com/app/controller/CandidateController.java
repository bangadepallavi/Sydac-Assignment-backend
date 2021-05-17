package com.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Candidate;
@CrossOrigin(origins = "*", allowedHeaders = "*")
//@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CandidateController 
{	
	
	public CandidateController() {
		defalutCan();
	}
	static List<Candidate> c= new ArrayList<>();
	static int id=0;
	public void defalutCan()
	{
//		c.add(new Candidate("abc","abc@gmail.com","nagpur","maharashtra",857441475,25,"5/4/2021",440012));
//		c.add(new Candidate("pqr","pqr@gmail.com","pune","maharashtra",850000075,23,"1/5/2021",440015));
//		c.add(new Candidate("mno","mno@gmail.com","Dhule","maharashtra",998441475,25,"25/4/2021",440312));
	}
	
	@PostMapping("/add")
	public void addCandidate(@RequestBody Candidate newCandidate)
	{
		newCandidate.setId(++id);
//		defalutCan();
		c.add(newCandidate);		
	}
	
	@GetMapping("/get")
	public List<Candidate> getCandidate()
	{
		return c;
	}
	
	@GetMapping("/get/{id}")
	public List<Candidate> getCandidateById(@PathVariable int id)
	{
		System.out.println("");
		List<Candidate> candidate=c.stream().filter(can->can.getId()==id).collect(Collectors.toList());
		return candidate;
	}
	
	@PutMapping("/update/{id}")
	public List<Candidate> updateCan(@RequestBody Candidate newCandidate, @PathVariable int id)
	{	
		List<Candidate> candidate=c.stream().filter(can->can.getId()==id).collect(Collectors.toList());	
		for(Candidate cc:candidate)
		{
//			cc.setId(newCandidate.getId());
			cc.setAge(newCandidate.getAge());
			cc.setCity(newCandidate.getCity());
			cc.setDob(newCandidate.getDob());
			cc.setEmail(newCandidate.getEmail());
			cc.setMobile(newCandidate.getMobile());
			cc.setPostalCode(newCandidate.getPostalCode());
			cc.setState(newCandidate.getState());
		}
		return candidate;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCandidateByID(@PathVariable int id)
	{
		List<Candidate> candidate=c.stream().filter(can->can.getId()==id).collect(Collectors.toList());
		for(Candidate cc:candidate)
		{
			c.remove(cc);			
		}
	}
	
	@DeleteMapping("/bulkDelete")
	public void deleteCandidates(@RequestBody List<Candidate> candidatesList)
	{
		System.out.println(candidatesList);
//		System.out.println("kksmd");
		for(Candidate cc:candidatesList)
			{
				c.remove(cc);
			}
//		List<Candidate> candidate=c.stream().filter(can->can.getId()==candidatesList.getId()).collect(Collectors.toList());
//		for(Candidate cc: candidatesList)
//		{
//			System.out.println("====================================================");
//			System.out.println(cc);
//			c.remove(cc);			
//		}
	}
	
	
}

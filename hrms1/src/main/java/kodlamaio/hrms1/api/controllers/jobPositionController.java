package kodlamaio.hrms1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.jobPositionService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.entities.concretes.job_position;

@RestController
@RequestMapping("/api/jobPosition")
public class jobPositionController {
	private jobPositionService jobPositionservice;

	@Autowired
	public jobPositionController(jobPositionService jobPositionservice) {
		super();
		this.jobPositionservice = jobPositionservice;
	}
	
	@GetMapping("/getall")
	public DataResult<List<job_position>> getAll(){
		return this.jobPositionservice.getAll();
		
	}

}

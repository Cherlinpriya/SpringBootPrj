package main.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.webapp.domain.Plan;
import main.webapp.response.ResponseObject;
import main.webapp.service.PlanService;;

@RestController
@RequestMapping(value="/plan")
public class PlanController {
	
	@Autowired
	private PlanService planService;
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/extractplanData", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseObject> extractInventoryData(){
		
		/*Plan plan= planService.findOne(55901L);
		List<Object> planExtract= new ArrayList<Object>();
		planExtract.add(plan);*/
		
		Plan plan =new Plan();
		plan.setPlanID(55901L);
		Plan planR=planService.findByPlan(plan);
		List<Object> planExtract= new ArrayList<Object>();
		planExtract.add(planR);
		
		ResponseObject resObj = new ResponseObject();
		if(planExtract!=null){
			resObj.setCount(planExtract.size());
			resObj.setData(planExtract);	
			return new ResponseEntity<ResponseObject>(resObj, HttpStatus.OK);
		}
		else
            return new ResponseEntity<ResponseObject>(HttpStatus.NO_CONTENT);
	}
	
	 
	
}

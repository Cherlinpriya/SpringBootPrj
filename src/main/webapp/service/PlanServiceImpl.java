package main.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.webapp.domain.Plan;
import main.webapp.repository.PlanRepository;

@Service
public class PlanServiceImpl implements  PlanService {
	
	@Autowired
	private PlanRepository planRepository;

	
	public Plan findOne(long id){
		Plan plan=planRepository.findByplanID(id);
		return plan;
	}
	
	public Plan findByPlan(Plan plan){
		Plan planR=planRepository.findByPlan(plan.getPlanID());
		return planR;
	}


}

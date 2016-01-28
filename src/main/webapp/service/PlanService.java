package main.webapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import main.webapp.domain.Plan;

@Service
public interface  PlanService {
	
	public Plan findOne(long id);
	
	public Plan findByPlan(Plan plan);


}

package main.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import main.webapp.domain.Plan;

@Repository
@Transactional(readOnly = true)
public interface  PlanRepository extends JpaRepository<Plan,Long>{
	
	Plan findByplanID(Long planID);
	
	@Query("Select plan from Plan plan where plan.planID=?1")
	Plan findByPlan(Long planID);

}

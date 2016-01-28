package main.webapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(schema = "NBC_CUST", name = "NEW_PLAN")
public class Plan {
	
	//private Channel					channel;
	private Long					planID;
	private String					planName;
	/**
	 * @return the channel
	 */
	/*@ManyToOne(fetch = FetchType.LAZY)
	@Fetch(FetchMode.SELECT)
	@JoinColumn(name = "CHANNEL_ID")
	public Channel getChannel() {
		return channel;
	}*/
	/**
	 * @param channel the channel to set
	 */
	/*public void setChannel(Channel channel) {
		this.channel = channel;
	}*/
	/**
	 * @return the planID
	 */
	@Id
	@Column(name = "PLAN_ID")
	public Long getPlanID() {
		return planID;
	}
	/**
	 * @param planID the planID to set
	 */
	public void setPlanID(Long planID) {
		this.planID = planID;
	}
	/**
	 * @return the planName
	 */
	@Column(name = "PLAN_NAME")
	public String getPlanName() {
		return planName;
	}
	/**
	 * @param planName the planName to set
	 */
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	

}

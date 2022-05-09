package com.HibernateExample.ManyToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	
	@Id
	@Column(name="ans_id")
	private int ansID;
	private String ans;
	
	@ManyToOne
	@JoinColumn(name="ques_id")
	private Question ques;

	public Answer() {
		super();
		
	}

	public Answer(int ansID, String ans, Question ques) {
		super();
		this.ansID = ansID;
		this.ans = ans;
		this.ques = ques;
	}

	public int getAnsID() {
		return ansID;
	}

	public void setAnsID(int ansID) {
		this.ansID = ansID;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Question getQues() {
		return ques;
	}

	public void setQues(Question ques) {
		this.ques = ques;
	}

	@Override
	public String toString() {
		return "Answer [ansID=" + ansID + ", ans=" + ans + ", ques=" + ques + "]";
	}
		
}

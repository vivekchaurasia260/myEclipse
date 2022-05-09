package com.HibernateExample.ManyToOneMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Question {
	
	@Id
	@Column(name="ques_id")
	private int quesId;
	private String ques;
	
	@OneToMany(mappedBy="ques", cascade=CascadeType.ALL)
	private List<Answer> answer;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int quesId, String ques, List<Answer> answer) {
		super();
		this.quesId = quesId;
		this.ques = ques;
		this.answer = answer;
	}

	public int getQuesId() {
		return quesId;
	}

	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [quesId=" + quesId + ", ques=" + ques + ", answer=" + answer + "]";
	}
	
	

}

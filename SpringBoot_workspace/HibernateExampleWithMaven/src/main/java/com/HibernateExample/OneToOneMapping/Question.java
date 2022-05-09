package com.HibernateExample.OneToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@Column(name = "question_id")
	private int questionId;
	private String question;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="a_id")
	private Answer answer;
	
	
	public Question() {
		super();
	}
	
	public Question(int questionId, String question, Answer answer) {
		this.questionId = questionId;
		this.question = question;
		this.answer=answer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [question_id=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
		
}

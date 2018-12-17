package com.balceda.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import com.balceda.managedbean.ReversedBean;

/**
 * Created by jbalceda on Dec, 2018
 */
@ManagedBean(name = "reversedController", eager = true)
@RequestScoped
public class ReversedController {

    @ManagedProperty("#{reversedBean}")
    private ReversedBean reversedBean;

    public void reverse() {
	System.out.println("Reverse()");
	if (reversedBean.getWord() != null && !reversedBean.getWord().isEmpty()) {
	    reversedBean.setWordAmount(1);
	}

	for (int i = reversedBean.getWord().length() - 1; i >= 0; i--) {
		char letter = reversedBean.getWord().charAt(i);
		
		String newString = reversedBean.getReversedWord();
	    reversedBean.setReversedWord(newString += letter);

	    if (letter == ' ') {
		reversedBean.setWordAmount(reversedBean.getWordAmount() + 1);
	    }
	}
	System.out.println("Reverse Word: " + reversedBean.getReversedWord());
    }

    public ReversedBean getReversedBean() {
        return reversedBean;
    }

    public void setReversedBean(ReversedBean reversedBean) {
        this.reversedBean = reversedBean;
    }
    
    
}

package com.balceda.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

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
	String newString = "";
	for (int i = reversedBean.getWord().length() - 1; i >= 0; i--) {
	    char letter = reversedBean.getWord().charAt(i);

	    newString += letter;

	    if (letter == ' ') {
		reversedBean.setWordAmount(reversedBean.getWordAmount() + 1);
	    }
	}

	reversedBean.setReversedWord(newString);
	System.out.println("Reverse Word: " + reversedBean.getReversedWord());
    }

    public ReversedBean getReversedBean() {
	return reversedBean;
    }

    public void setReversedBean(ReversedBean reversedBean) {
	this.reversedBean = reversedBean;
    }

}

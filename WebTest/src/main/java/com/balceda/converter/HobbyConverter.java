package com.balceda.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.balceda.managedbean.Hobby;
import com.balceda.managedbean.UserBean;

@FacesConverter("hobbies")
public class HobbyConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
	if (s != null) {
	    for (Hobby h : UserBean.hobbies) {
		if (s.equals(h.getIcon())) {
		    return h;
		}
	    }
	}
	return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
	if (o != null) {
	    Hobby hobby = (Hobby) o;
	    return hobby.getIcon();
	}
	return null;
    }
}

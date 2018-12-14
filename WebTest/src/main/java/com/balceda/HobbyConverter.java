package com.balceda;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter("hobbies")
public class HobbyConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s != null) {
            for (Hobby h : UserBean.hobbies) {
                if (s.equals(h.getDesc())) {
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
            return hobby.getDesc();
        }
        return null;
    }
}

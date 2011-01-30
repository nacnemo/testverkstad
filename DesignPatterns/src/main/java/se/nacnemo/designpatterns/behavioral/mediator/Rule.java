/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nacnemo.designpatterns.behavioral.mediator;

public class Rule {

    private String text;
    private Boolean isActivated = Boolean.FALSE;

    public Boolean getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(Boolean isActivated) {
        this.isActivated = isActivated;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

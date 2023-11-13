package com.ice.designed.principle.composititionaggregation;

public class WxNotify implements Notify {

    private Parent parent;

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void wxNotify() {
        parent.messing();
    }
}

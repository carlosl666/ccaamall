package com.platzimarket.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {
    private long purchaseId;
    private long clientId;
    private LocalDateTime date;
    private String paymetMethod;
    private String commet;
    private int idState;
    private List<PurchaseItem> items;

    public long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymetMethod() {
        return paymetMethod;
    }

    public void setPaymetMethod(String paymetMethod) {
        this.paymetMethod = paymetMethod;
    }

    public String getCommet() {
        return commet;
    }

    public void setCommet(String commet) {
        this.commet = commet;
    }

    public int getIdState() {
        return idState;
    }

    public void setIdState(int idState) {
        this.idState = idState;
    }

    public List<PurchaseItem> getItems() {
        return items;
    }

    public void setItems(List<PurchaseItem> items) {
        this.items = items;
    }
}

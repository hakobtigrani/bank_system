package models;

import java.time.LocalDateTime;

public class Appointment {

    private String customerName;
    private String serviceType;
    private LocalDateTime preferredTime;
    private int priority;

    public Appointment(String customerName, String serviceType, LocalDateTime preferredTime, int priority) {
        this.customerName = customerName;
        this.serviceType = serviceType;
        this.preferredTime = preferredTime;
        this.priority = priority;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public LocalDateTime getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(LocalDateTime preferredTime) {
        this.preferredTime = preferredTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String toString() {
        return "Customer Name: " + customerName
                + "\nService Type: "
                + "\nPreferred Time: "
                + "\nPriority: ";
    }

}

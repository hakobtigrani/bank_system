package Transactions;

import Models.Appointment;
import java.util.List;

public interface AppointmentManager {

    List<Appointment> viewAllAppointments();
    Appointment getNextAppointment();
    void scheduleAppointment(Appointment appointment);

}

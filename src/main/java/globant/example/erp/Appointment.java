package globant.example.erp;

import java.time.LocalDateTime;

public class Appointment extends MedicalEvent{
    private String speciality;
    private LocalDateTime attendance;
    private boolean assisted;
}

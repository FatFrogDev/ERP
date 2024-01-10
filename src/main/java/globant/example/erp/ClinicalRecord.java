package globant.example.erp;


import java.time.LocalDateTime;
import java.util.List;

public class ClinicalRecord {
    private LocalDateTime startHour;

    private LocalDateTime finishHour;

    private List<MedicalEvent> medicalEvents;
}

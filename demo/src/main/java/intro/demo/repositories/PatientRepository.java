package intro.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import intro.demo.model.*;

import java.util.List;


public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByPatientId(Long patientId);
    List<Patient> findByDateOfBirthBetween(String startDate, String endDate);
    List<Patient> findByAdmittedBy(Employee admittedBy);
    List<Patient> findByAdmittingDoctorDepartment(String department);
    List<Patient> findByDoctorStatus(String status);
    List<Patient> findByAdmittedByDepartment(String department);
}


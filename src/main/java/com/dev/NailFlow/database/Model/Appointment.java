
package com.dev.NailFlow.database.Model;

import com.dev.NailFlow.Enum.AppointmentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_appointment")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_name",nullable = false)
    private String customerName;

    @Column(name = "phone_number",nullable = false)
    private String phoneNumber;

    @Column(name = "appointment_date",nullable = false)
    private LocalDateTime appointmentDate;

    @Column(name = "status",nullable = false)
    private AppointmentStatus status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}

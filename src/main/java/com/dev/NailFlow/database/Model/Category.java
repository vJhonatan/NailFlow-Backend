package com.dev.NailFlow.database.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tb_category")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name",nullable = false)
    private String name;

    @Column(name = "price",nullable = false)
    private BigDecimal price;

    @OneToMany(mappedBy = "category")
    private List<Appointment> appointments;

}

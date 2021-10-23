package com.example.department.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long departmentId;

    @Column(name = "departmentName")
    private String departmentName;

    @Column(name = "departmentAddress")
    private String departmentAddress;

    @Column(name = "departmentCode")
    private String departmentCode;

}

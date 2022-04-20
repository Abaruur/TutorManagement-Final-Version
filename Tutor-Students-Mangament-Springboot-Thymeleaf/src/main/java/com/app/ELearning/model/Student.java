package com.app.ELearning.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    @NotBlank
    private String studentName;
    @Column(unique = true)
    @NotBlank
    private String username;
    @NotBlank
    private String password;

    @ManyToMany(targetEntity = Class.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Class> studentBookedClasses = new ArrayList<>();


}

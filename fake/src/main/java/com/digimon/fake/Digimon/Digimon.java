package com.digimon.fake.Digimon;

//import org.hibernate.annotations.SQLInserts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "digimon")
public class Digimon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Number #")
    private int number;

    @Column(name = "digimon_name", nullable = false)
    private String digimon;

    @Column(name = "digimon_stage", nullable = false)
    private String stage;

    @Column(name = "digimon_type", nullable = false)
    private String type;

    @Column(name = "digimon_attr", nullable = false)
    private String attribute;

    @Column(name = "digimon_mem", nullable = false)
    private int memory;

    @Column(name = "digimon_es", nullable = false)
    private int equip_slots;

    @Column(name = "digimon_hp", nullable = false)
    private int hp;

    @Column(name = "digimon_sp", nullable = false)
    private int sp;

    @Column(name = "digimon_atk", nullable = false)
    private int atk;

    public Digimon(){}
}

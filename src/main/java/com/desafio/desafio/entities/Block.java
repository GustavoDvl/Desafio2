package com.desafio.desafio.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private LocalDateTime start;
    @Column
    private LocalDateTime end;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public Block() {}

    public Block(Integer id, LocalDateTime start, LocalDateTime end, Activity activity) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.activity = activity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
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
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant start;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant end_moment;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public Block() {}

    public Block(Integer id, Instant start, Instant end, Activity activity) {
        this.id = id;
        this.start = start;
        this.end_moment = end;
        this.activity = activity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getendMoment() {
        return end_moment;
    }

    public void setEnd(Instant endMoment) {
        this.end_moment = endMoment;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
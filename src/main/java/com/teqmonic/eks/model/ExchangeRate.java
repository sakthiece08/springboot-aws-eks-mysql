package com.teqmonic.eks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
@Table(name = "Exchange_rate")
@Entity
public class ExchangeRate {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGen")
    private Long id;

    @JsonProperty("source_currency")
    @Column(name="source_currency")
    private String source;

    @JsonProperty("target_currency")
    @Column(name="target_currency")
    private String target;

    @Column(name = "rate")
    private double rate;

}

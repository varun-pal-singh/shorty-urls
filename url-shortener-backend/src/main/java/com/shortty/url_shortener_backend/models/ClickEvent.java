package com.shortty.url_shortener_backend.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class ClickEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime clickedDate;

    // foreign relationships
    @ManyToOne
    @JoinColumn(name = "url_mapping_id")
    private UrlMapping urlMapping;
}


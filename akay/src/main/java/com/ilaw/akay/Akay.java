package com.ilaw.akay;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Akay {
    @Id
    @SequenceGenerator(
            name = "akay_sequence",
            sequenceName = "akay_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "akay_sequence"
    )
    private Long id;
    private String lName;
    private String fName;
    private Integer purok;

}

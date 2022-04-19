package com.firstapp.demo.dto;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
public class FirstDto {

        @Autowired
        private Long id;
        private String name;
        private String email;
        private String surname;
}

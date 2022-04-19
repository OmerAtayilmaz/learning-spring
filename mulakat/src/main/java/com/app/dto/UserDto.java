package com.app.dto;
import java.util.List;
import javax.validation.constraints.NotNull;

import com.app.entity.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String surname;
    private List<String> phoneNumberList;
}

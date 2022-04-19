package com.app.dto;
import java.util.List;
import javax.validation.constraints.NotNull;

import com.app.entity.User;
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
public class NumbersDto {
    private Long id;
    @NotNull
    private String phone;
    private boolean isActive;
    private Long user_id;
}

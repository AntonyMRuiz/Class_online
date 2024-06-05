package com.riwi.class_online.api.dtos.request.create;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MultimediaRequest {
    @NotBlank(message = "Type is required")
    private String type;

    @NotBlank(message = "URL is required")
    private String url;

}

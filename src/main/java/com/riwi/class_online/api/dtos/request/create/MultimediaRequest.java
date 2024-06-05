package com.riwi.class_online.api.dtos.request.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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

    @NotNull(message = "Active is required")
    @Pattern(regexp = "true|false")
    private boolean active;

    @NotNull(message = "Lesson ID is required")
    private Long lessonId;
}

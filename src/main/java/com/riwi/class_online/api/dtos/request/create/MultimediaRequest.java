package com.riwi.class_online.api.dtos.request.create;

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
    private String type;
    private String url;
    private boolean active;
    private Long lessonId;
}

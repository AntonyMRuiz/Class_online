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
public class LessonRequest {
    private String title;
    private String content;
    private boolean active;
    private Long classId;
}

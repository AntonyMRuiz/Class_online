package com.riwi.class_online.api.dtos.response;

import java.time.LocalDateTime;

import com.riwi.class_online.util.enums.MultimediaType;

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
public class MultimediaResponse {
    private Long id;
    private MultimediaType type;
    private String url;
    private LocalDateTime createdAt;
    private boolean active;
    private LessonResponse lessonId;
}

package com.riwi.class_online.api.dtos.error;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
public class ListErrorsResponse implements Serializable {
    private String status;
    private Integer code;
    private List<Map<String,String>> errors;
}


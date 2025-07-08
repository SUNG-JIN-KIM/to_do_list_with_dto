package com.k02.to_do_list_with_dto.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Todo {
    private Integer id;
    private String title;
    private boolean completed;
    private Integer userId;
}

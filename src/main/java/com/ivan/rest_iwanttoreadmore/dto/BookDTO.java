package com.ivan.rest_iwanttoreadmore.dto;

import jakarta.validation.constraints.NotBlank;

public class BookDTO {
    @NotBlank(message = "Title is mandatory")
    public String title;
}

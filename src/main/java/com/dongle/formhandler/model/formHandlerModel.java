package com.dongle.formhandler.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class formHandlerModel {
    private String firstName;
    private String lastName;
    private String email;
}

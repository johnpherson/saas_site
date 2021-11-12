package com.dongle.homePage.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class homePageModel {
    private String fistName;
    private String lastName;
    private String email;
}

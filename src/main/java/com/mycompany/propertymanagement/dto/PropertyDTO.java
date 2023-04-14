package com.mycompany.propertymanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyDTO {
    private Long ID;
    private String title;
    private String description;
    private String ownerName;
    private String ownerEmail;
    private double price;
    private String address;



}

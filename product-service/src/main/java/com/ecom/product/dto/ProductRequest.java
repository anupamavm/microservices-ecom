package com.ecom.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


public record ProductRequest( String name , String description , BigDecimal price) {
}

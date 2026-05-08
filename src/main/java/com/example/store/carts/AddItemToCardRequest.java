package com.example.store.carts;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddItemToCardRequest {

    @NotNull
    private Long productId;

}

package com.example.nutrisend.platform.order.rest.transform;

import com.example.nutrisend.platform.order.domain.model.commands.CreateOrderCommand;
import com.example.nutrisend.platform.order.domain.model.commands.CreateOrderItemCommand;
import com.example.nutrisend.platform.order.rest.resources.CreateOrderResource;

public class CreateOrderCommandFromResourceAssembler {
    public static CreateOrderCommand toCommandFromResource(CreateOrderResource resource) {
        return new CreateOrderCommand(
                resource.userId(),
                resource.items().stream()
                        .map(item -> new CreateOrderItemCommand(
                                item.name(),
                                item.price(),
                                item.category(),
                                item.quantity()
                        ))
                        .toList()
        );
    }
}

package vn.hieu4tuoi.dto.respone;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder()
public class FoodDetailResponse extends FoodResponse{
    private String description;
}

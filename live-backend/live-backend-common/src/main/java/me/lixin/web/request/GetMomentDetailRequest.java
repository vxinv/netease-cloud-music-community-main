package me.lixin.web.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class GetMomentDetailRequest {

    @NotNull
    private Long momentId;
}

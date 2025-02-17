package com.kinancity.core.captcha.captchaai.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kinancity.core.captcha.captchaai.dto.PtcReCaptchaV2TaskSolution;
import lombok.Data;

@Data
public class GetTaskResulResponseDto extends BaseResponseDto {
    @JsonProperty("status")
    private String status;
    @JsonProperty("solution")
    private PtcReCaptchaV2TaskSolution solution;
}

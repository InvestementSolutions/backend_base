package com.example.corebase.core.admin.developer.model.request;

import com.example.corebase.core.base.model.PageableRequest;
import com.example.corebase.infrastructure.constant.Constants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdMenuFilterRequest extends PageableRequest {

    private String name;

    private String module;

    private String url;

    private String delYn = Constants.STATE_N;
}

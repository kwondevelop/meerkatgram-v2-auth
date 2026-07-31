package com.meerkatgramv2auth.global.errors.custom.business;

import com.meerkatgramv2auth.global.errors.custom.BusinessException;
import com.meerkatgramv2auth.global.response.constant.CustomResponseCode;

public class DuplicatedResourceException extends BusinessException {
    public DuplicatedResourceException(String message) {
        super(CustomResponseCode.DUPLICATED_RESOURCE_ERROR, message);
    }
}

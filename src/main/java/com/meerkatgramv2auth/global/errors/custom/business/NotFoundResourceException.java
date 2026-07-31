package com.meerkatgramv2auth.global.errors.custom.business;

import com.meerkatgramv2auth.global.errors.custom.BusinessException;
import com.meerkatgramv2auth.global.response.constant.CustomResponseCode;

public class NotFoundResourceException extends BusinessException {
    public NotFoundResourceException(String message) {
        super(CustomResponseCode.NOT_FOUND_RESOURCE_ERROR, message);
    }
}

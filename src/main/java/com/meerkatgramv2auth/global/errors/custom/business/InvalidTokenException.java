package com.meerkatgramv2auth.global.errors.custom.business;

import com.meerkatgramv2auth.global.errors.custom.BusinessException;
import com.meerkatgramv2auth.global.response.constant.CustomResponseCode;

public class InvalidTokenException extends BusinessException {
    public InvalidTokenException(String message) {
        super(CustomResponseCode.INVALID_TOKEN_ERROR, message);
    }
}

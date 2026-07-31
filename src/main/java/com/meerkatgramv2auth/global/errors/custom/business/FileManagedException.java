package com.meerkatgramv2auth.global.errors.custom.business;

import com.meerkatgramv2auth.global.errors.custom.BusinessException;
import com.meerkatgramv2auth.global.response.constant.CustomResponseCode;

public class FileManagedException extends BusinessException {
    public FileManagedException(String message) {
        super(CustomResponseCode.FILE_MANAGED_ERROR, message);
    }
}

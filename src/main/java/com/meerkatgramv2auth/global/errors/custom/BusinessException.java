package com.meerkatgramv2auth.global.errors.custom;

import com.meerkatgramv2auth.global.response.constant.CustomResponseCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class BusinessException extends RuntimeException {
  private final CustomResponseCode customResponseCode;

  public BusinessException(CustomResponseCode customResponseCode ,String message) {
    super(message);
    this.customResponseCode = customResponseCode;
  }
}

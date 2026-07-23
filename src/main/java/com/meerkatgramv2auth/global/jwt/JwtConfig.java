package com.meerkatgramv2auth.global.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jwt")
public record JwtConfig(
  boolean secure,
  String issuer,
  String type,
  long accessTokenExpiry,
  long refreshTokenExpiry,
  String refreshTokenCookieName,
  int refreshTokenCookieExpiry,
  String secret,
  String headerKey,
  String scheme,
  String reissueUri
  ) {
}

package com.github.rkumsher.tostringverifier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ToStringVerifierTest {

  private ToStringVerifier verifier = new ToStringVerifier();

  @Test
  void verify() {
    Throwable exception = assertThrows(IllegalStateException.class, () -> verifier.verify());
    assertThat(exception.getMessage()).isEqualTo("Not implemented yet");
  }
}

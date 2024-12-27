package net.skybert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import net.skybert.proto.SecretFoo;

public class SecretFooTest {

  @Test
  void canUseProtoGeneratedJavaTestClass() throws Exception {
    SecretFoo actual = SecretFoo.newBuilder().setCreationDate(1000L).build();
    Assertions.assertNotNull(actual);
  }
}
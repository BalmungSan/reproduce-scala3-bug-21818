package org.example

import org.scalatest.Assertion
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

final class TestSpec extends AnyFlatSpec with Matchers:
  behavior of "Scala 3.3.4"

  it should "not warm about unused Assertions" in {
    (1 + 2) shouldBe 3
    (10 / 2) shouldBe 5
  }
end TestSpec

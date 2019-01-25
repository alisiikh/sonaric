package com.example

import org.scalatest.{FreeSpec, Matchers}

class AliceSpec extends FreeSpec with Matchers {
  "Alice" - {
    "says ping" in {
      Alice.say shouldBe "ping"
    }
  }
}

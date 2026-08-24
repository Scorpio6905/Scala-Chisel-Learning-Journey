package Gates

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class Countertest extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Counter(5.U)) { dut =>

    dut.clock.step(50)
    }
  }
}

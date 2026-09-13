package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec

class Jalrtest extends FreeSpec with ChiselScalatestTester {
  "preserves an even target address" in {
    test(new Jalr) { dut =>
      dut.io.in1.poke(10.S)
      dut.io.in2.poke(4.S)
      dut.io.out.expect(14.S)
    }
  }

  "clears the least significant bit of an odd target address" in {
    test(new Jalr) { dut =>
      dut.io.in1.poke(10.S)
      dut.io.in2.poke(5.S)
      dut.io.out.expect(14.S)
    }
  }

  "handles negative target addresses" in {
    test(new Jalr) { dut =>
      dut.io.in1.poke((-7).S)
      dut.io.in2.poke(2.S)
      dut.io.out.expect((-6).S)
    }
  }
}

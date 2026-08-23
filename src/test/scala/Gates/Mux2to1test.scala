package Gates

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Mux2to1test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Mux2to1) { dut =>
    dut.io.a.poke(0.B)
    dut.io.b.poke(1.B)
    dut.io.s1.poke(0.B)
    dut.io.out.expect(0.B)  
    dut.clock.step(1)
   
    }
  }
}
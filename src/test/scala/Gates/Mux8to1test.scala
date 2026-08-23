package Gates

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Mux8to1test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Mux8to1) { dut =>
    dut.io.a.poke(1.B)
    dut.io.b.poke(0.B)
    dut.io.c.poke(0.B)
    dut.io.d.poke(0.B)
    dut.io.e.poke(0.B)
    dut.io.f.poke(0.B)
    dut.io.g.poke(0.B)
    dut.io.h.poke(0.B)
    dut.io.s1.poke(0.B)
    dut.io.s2.poke(0.B)
    dut.io.s3.poke(0.B)
    dut.io.out.expect(1.B)
    dut.clock.step(1)
   
    }
  }
}

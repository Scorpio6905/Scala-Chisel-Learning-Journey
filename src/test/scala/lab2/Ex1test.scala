package lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Ex1test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Mux_2to1) { dut =>
      val a = 1234.U
      val b = 9876.U

      dut.io.in_A.poke(a)   
      dut.io.in_B.poke(b)

      dut.io.select.poke(false.B)
      dut.io.out.expect(a)
      dut.clock.step(1)

      dut.io.select.poke(true.B)
      dut.io.out.expect(b)
      dut.clock.step(1)
    }
  }
}
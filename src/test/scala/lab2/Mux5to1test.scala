package lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec

class Mux5to1test extends FreeSpec with ChiselScalatestTester {
  "Mux_5to1 test" in {
    test(new Mux_5to1) { dut =>
      dut.io.s0.poke(0.B)
      dut.io.s1.poke(0.B)
      dut.io.s2.poke(0.B)
      dut.io.out.expect(0.U)
      dut.clock.step()

      dut.io.s0.poke(1.B)
      dut.io.s1.poke(0.B)
      dut.io.s2.poke(0.B)
      dut.io.out.expect(8.U)
      dut.clock.step()

      dut.io.s0.poke(0.B)
      dut.io.s1.poke(1.B)
      dut.io.s2.poke(0.B)
      dut.io.out.expect(16.U)
      dut.clock.step()

      dut.io.s0.poke(1.B)
      dut.io.s1.poke(1.B)
      dut.io.s2.poke(0.B)
      dut.io.out.expect(24.U)
      dut.clock.step()

      dut.io.s0.poke(0.B)
      dut.io.s1.poke(0.B)
      dut.io.s2.poke(1.B)
      dut.io.out.expect(32.U)
      dut.clock.step()

      dut.io.s0.poke(1.B)
      dut.io.s1.poke(0.B)
      dut.io.s2.poke(1.B)
      dut.io.out.expect(32.U)
      dut.clock.step()

      dut.io.s0.poke(0.B)
      dut.io.s1.poke(1.B)
      dut.io.s2.poke(1.B)
      dut.io.out.expect(32.U)
      dut.clock.step()

      dut.io.s0.poke(1.B)
      dut.io.s1.poke(1.B)
      dut.io.s2.poke(1.B)
      dut.io.out.expect(32.U)
      dut.clock.step()
    }
  }
}

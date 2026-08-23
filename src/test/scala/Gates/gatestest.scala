package Gates
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class tb_dut extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new gates) { dut =>
    dut.io.a.poke(1.B)
    dut.io.b.poke(1.B)
    dut.io.and_output.expect(1.B)    
    dut.clock.step(1)
    dut.io.a.poke(1.B)
    dut.io.b.poke(1.B)
    dut.io.and_output.expect(0.B)    
    dut.clock.step(1)
    }
  }
}
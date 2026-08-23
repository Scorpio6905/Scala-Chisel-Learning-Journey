package Gates
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class fulladdertest extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Full_Adder) { dut =>
    dut.io.a.poke(1.B)
    dut.io.b.poke(1.B)
    dut.io.c.poke(1.B)
    dut.io.sum.expect(1.B)  
    dut.io.cout.expect(1.B)  
    dut.clock.step(1)
   
    }
  }
}
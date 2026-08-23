package Gates
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class halfaddertest extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Half_Adder) { dut =>
    dut.io.a.poke(1.B)
    dut.io.b.poke(1.B)
    dut.io.sum_output.expect(0.B)
    dut.io.carry_output.expect(1.B)    
    dut.clock.step(1)
    dut.io.a.poke(1.B)
    dut.io.b.poke(1.B)
    dut.io.sum_output.expect(1.B)
    dut.io.carry_output.expect(1.B) 
   
    }
  }
}

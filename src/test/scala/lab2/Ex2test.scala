package lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Ex2test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Ex2) { dut =>
 

      dut.io.in0.poke(0.B)   
      dut.io.in1.poke(1.B)
      dut.io.in2.poke(0.B)   
      dut.io.in3.poke(1.B)
      dut.io.in4.poke(0.B)   
      dut.io.in5.poke(1.B)
      dut.io.in6.poke(0.B)   
      dut.io.in7.poke(1.B)

      dut.io.sel0.poke(true.B)
      dut.io.sel1.poke(true.B)
      dut.io.sel2.poke(false.B)
      dut.io.out.expect(1.B)
   

    }
  }
}
package lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Mux5to1test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Mux5to1) { dut =>
 
     dut.io.s0.poke(1.B)
     dut.io.s1.poke(0.B)
     dut.io.s2.poke(1.B)
    
     dut.io.out.expect(32.U)
   

    }
  }
}
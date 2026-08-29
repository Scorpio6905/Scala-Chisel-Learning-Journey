package lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Ex1test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Mux_2to1) { dut =>
 

      dut.io.in_A.poke(10.U)   
      dut.io.in_B.poke(20.U)

      dut.io.select.poke(false.B)
      dut.io.out.expect(10.U)
   

    }
  }
}
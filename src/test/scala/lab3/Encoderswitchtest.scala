package lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._



class Encoderswitchtest extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Encoderswitch) { dut =>
 
     dut.io.in.poke("b0000".U)  

     dut.io.out.expect("b01".U)

    }
  }
}
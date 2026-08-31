package lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._



class Valid_Interfacetest extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Decoder2to4){ dut =>
 
     dut.io.in.poke("b00".U)  
   

     dut.io.out.bits.expect("b0001".U)
     dut.io.out.valid.expect(true.B)

    }
  }
}
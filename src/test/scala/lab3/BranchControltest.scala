package lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._



class BranchControltest extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new BranchControl) { dut =>
 
     dut.io.branch.poke(1.B)  
     dut.io.funct3.poke("b100".U)
      
     dut.io.arg_x.poke(15.U)
     dut.io.arg_y.poke(16.U)

     dut.io.br_taken.expect(1.B)

    }
  }
}
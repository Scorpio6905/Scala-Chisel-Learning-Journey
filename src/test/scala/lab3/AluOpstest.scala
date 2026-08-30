package lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._



class AluOpstest extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new ALU){ dut =>
 
     dut.io.in_A.poke(10.U)  
     dut.io.in_B.poke(10.U)
      
     dut.io.alu_Op.poke(0.U)
     dut.io.out.expect(20.U)

     dut.io.sum.expect(20.U)

    }
  }
}
package regfile

import chisel3._
import chisel3.util._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class InstructionDecodetest extends FreeSpec with ChiselScalatestTester {
  "" in {
    test(new InstructionDecode) { dut =>

        
      dut.io.opcode.poke(51.U)
      dut.io.R_Type.expect(true.B)
  

    }
  }
}
package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec

class Controltest extends FreeSpec with ChiselScalatestTester {
  "R-type opcode" in {
    test(new Control) { dut =>
      dut.io.opcode.poke(51.U)
      dut.io.RegWrite.expect(true.B)
      dut.io.ALUOP.expect(0.U)
    }
  }

  "Load opcode" in {
    test(new Control) { dut =>
      dut.io.opcode.poke(3.U)
      dut.io.MemRead.expect(true.B)
      dut.io.RegWrite.expect(true.B)
      dut.io.MemtoReg.expect(true.B)
      dut.io.ALUOP.expect("b100".U)
    }
  }

  "Branch opcode" in {
    test(new Control) { dut =>
      dut.io.opcode.poke(99.U)
      dut.io.BranchOut.expect(true.B)
      dut.io.ALUOP.expect(2.U)
      dut.io.next_PC_sel.expect(1.U)                       
    }
  }
}

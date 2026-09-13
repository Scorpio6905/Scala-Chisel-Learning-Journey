package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec

class ControlDecodetest extends FreeSpec with ChiselScalatestTester {
  "R-type decode" in {
    test(new ControlDecode) { dut =>
      dut.io.Rformat.poke(true.B)
      dut.io.load.poke(false.B)
      dut.io.Store.poke(false.B)
      dut.io.Branch.poke(false.B)
      dut.io.Itype.poke(false.B)
      dut.io.JALR.poke(false.B)
      dut.io.JAL.poke(false.B)
      dut.io.Lui.poke(false.B)

      dut.io.RegWrite.expect(true.B)
      dut.io.ALUOP.expect(0.U(3.W))
    }
  }

  "Load decode" in {
    test(new ControlDecode) { dut =>
      dut.io.Rformat.poke(false.B)
      dut.io.load.poke(true.B)
      dut.io.Store.poke(false.B)
      dut.io.Branch.poke(false.B)
      dut.io.Itype.poke(false.B)
      dut.io.JALR.poke(false.B)
      dut.io.JAL.poke(false.B)
      dut.io.Lui.poke(false.B)

      dut.io.MemRead.expect(true.B)
      dut.io.RegWrite.expect(true.B)
      dut.io.MemtoReg.expect(true.B)
      dut.io.ALUOP.expect(4.U(3.W))
      dut.io.operandBsel.expect(true.B)
    }
  }

  "Branch decode" in {
    test(new ControlDecode) { dut =>
      dut.io.Rformat.poke(false.B)
      dut.io.load.poke(false.B)
      dut.io.Store.poke(false.B)
      dut.io.Branch.poke(true.B)
      dut.io.Itype.poke(false.B)
      dut.io.JALR.poke(false.B)
      dut.io.JAL.poke(false.B)
      dut.io.Lui.poke(false.B)

      dut.io.BranchOut.expect(true.B)
      dut.io.ALUOP.expect(2.U(3.W))
      dut.io.next_PC_sel.expect(1.U(2.W))
    }
  }

  "JAL decode" in {
    test(new ControlDecode) { dut =>
      dut.io.Rformat.poke(false.B)
      dut.io.load.poke(false.B)
      dut.io.Store.poke(false.B)
      dut.io.Branch.poke(false.B)
      dut.io.Itype.poke(false.B)
      dut.io.JALR.poke(false.B)
      dut.io.JAL.poke(true.B)
      dut.io.Lui.poke(false.B)

      dut.io.RegWrite.expect(true.B)
      dut.io.ALUOP.expect(3.U(3.W))
      dut.io.operandAsel.expect(2.U(2.W))
      dut.io.next_PC_sel.expect(2.U(2.W))
    }
  }

  "Default decode" in {
    test(new ControlDecode) { dut =>
      dut.io.Rformat.poke(false.B)
      dut.io.load.poke(false.B)
      dut.io.Store.poke(false.B)
      dut.io.Branch.poke(false.B)
      dut.io.Itype.poke(false.B)
      dut.io.JALR.poke(false.B)
      dut.io.JAL.poke(false.B)
      dut.io.Lui.poke(false.B)

      dut.io.RegWrite.expect(false.B)
      dut.io.ALUOP.expect(7.U(3.W))
      dut.io.BranchOut.expect(false.B)
      dut.io.MemWrite.expect(true.B)
      dut.io.MemRead.expect(false.B)
      dut.io.MemtoReg.expect(false.B)
      dut.io.operandAsel.expect(0.U(2.W))
      dut.io.operandBsel.expect(false.B)
      dut.io.extend_sel.expect(0.U(2.W))
      dut.io.next_PC_sel.expect(0.U(2.W))
    }
  }
}

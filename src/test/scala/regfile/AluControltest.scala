package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec

class AluControltest extends FreeSpec with ChiselScalatestTester {
  "Add" in {
    test(new AluControl) { dut =>
      dut.io.aluOp.poke("b000".U)
      dut.io.funct3.poke("b000".U)
      dut.io.funct7.poke(false.B)
      dut.io.out.expect("b00000".U)
    }
  }

  "Add immediate" in {
    test(new AluControl) { dut =>
      dut.io.aluOp.poke("b001".U)
      dut.io.funct3.poke("b000".U)
      dut.io.funct7.poke(false.B)
      dut.io.out.expect("b00000".U)
    }
  }

  "Shift left logical" in {
    test(new AluControl) { dut =>
      dut.io.aluOp.poke("b000".U)
      dut.io.funct3.poke("b001".U)
      dut.io.funct7.poke(false.B)
      dut.io.out.expect("b00001".U)
    }
  }

  "Subtract" in {
    test(new AluControl) { dut =>
      dut.io.aluOp.poke("b000".U)
      dut.io.funct3.poke("b000".U)
      dut.io.funct7.poke(true.B)
      dut.io.out.expect("b01000".U)
    }
  }

  "JAL" in {
    test(new AluControl) { dut =>
      dut.io.aluOp.poke("b011".U)
      dut.io.funct3.poke("b011".U)
      dut.io.funct7.poke(false.B)
      dut.io.out.expect("b11111".U)
    }
  }
}

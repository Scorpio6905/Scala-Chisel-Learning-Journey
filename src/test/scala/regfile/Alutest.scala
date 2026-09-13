package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec

class Alutest extends FreeSpec with ChiselScalatestTester {
  "add" in {
    test(new Alu) { dut =>
      dut.io.alucontrol.poke("b00000".U)
      dut.io.InA.poke(10.S)
      dut.io.InB.poke(4.S)
      dut.io.output.expect(14.S)
      dut.io.Branch.expect(false.B)
    }
  }

  "subtract" in {
    test(new Alu) { dut =>
      dut.io.alucontrol.poke("b01000".U)
      dut.io.InA.poke(10.S)
      dut.io.InB.poke(4.S)
      dut.io.output.expect(6.S)
    }
  }

  "arithmetic right shift" in {
    test(new Alu) { dut =>
      dut.io.alucontrol.poke("b01101".U)
      dut.io.InA.poke((-8).S)
      dut.io.InB.poke(1.S)
      dut.io.output.expect((-4).S)
    }
  }

  "equal branch" in {
    test(new Alu) { dut =>
      dut.io.alucontrol.poke("b10000".U)
      dut.io.InA.poke(7.S)
      dut.io.InB.poke(7.S)
      dut.io.output.expect(1.S)
      dut.io.Branch.expect(true.B)
    }
  }
}

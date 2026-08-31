package lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class ImmGentest extends FreeSpec with ChiselScalatestTester {
  "ImmdValGen immediate extraction" in {
    test(new ImmdValGen) { dut =>

   // I-type: ADDI x1, x0, 10
  dut.io.instr.poke("b00000000101000000000000010010011".U)
  dut.io.immd_se.expect("b00000000000000000000000000001010".U)

  // BEQ x0, x0, 4
  dut.io.instr.poke("b00000000000000000000001001100011".U)
  dut.io.immd_se.expect("b00000000000000000000000000000100".U)

  // BEQ x0, x0, -8
  dut.io.instr.poke("b11111110000000000000110011100011".U)
  dut.io.immd_se.expect("b11111111111111111111111111111000".U)


    }
  }
}
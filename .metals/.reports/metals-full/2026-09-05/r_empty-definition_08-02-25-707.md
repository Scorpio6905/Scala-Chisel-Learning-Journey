error id: file://<WORKSPACE>/src/test/scala/lab3/ImmGentest.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/test/scala/lab3/ImmGentest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/Fill.
	 -chisel3/Fill#
	 -chisel3/Fill().
	 -chisel3/tester/Fill.
	 -chisel3/tester/Fill#
	 -chisel3/tester/Fill().
	 -chisel3/experimental/BundleLiterals.Fill.
	 -chisel3/experimental/BundleLiterals.Fill#
	 -chisel3/experimental/BundleLiterals.Fill().
	 -Fill.
	 -Fill#
	 -Fill().
	 -scala/Predef.Fill.
	 -scala/Predef.Fill#
	 -scala/Predef.Fill().
offset: 911
uri: file://<WORKSPACE>/src/test/scala/lab3/ImmGentest.scala
text:
```scala
package lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class ImmGentest extends FreeSpec with ChiselScalatestTester {
  "ImmdValGen immediate extraction" in {
    test(new ImmdValGen) { dut =>

   // I-type: ADDI x1, x0, 10
   val op_array = Arrray("b0010011", "b0000011", "b1100111", "b0100011", "b1100011", "b0110111", "b0010111", "b1101111")
   val opcode = op_array(Random.nextInt(9))
   
   val imm = Random.nextInt() 
   val reg = Random.nextInt()

   val instr = opcode + reg + Int(0) + imm
   val  result = opcode match{
    case "b0010011" || "b0000011" ||  "b1100111" =>   val immbits = io.instr(31,20)
                    val sign_ext = Fill(20, io.instr(31))
                    io.immd_se := Cat(sign_ext, immbits) 
    case "b1100011" =>  val immbits = Cat(io.instr(31,25), io.instr(11,7))
            val sign_ext = Fil@@l(20, io.instr(31))
            io.immd_se := Cat(sign_ext, immbits)

    case "b1100011" => 
    
   }

    


   

  dut.io.instr.poke("b00000000101000000000000010010011".U)
  dut.io.immd_se.expect("b00000000000000000000000000001010".U)

  // BEQ x0, x0, 4
  dut.io.instr.poke("b00000000000000000000001001100011".U)
  dut.io.immd_se.expect("b00000000000000000000000000000100".U)

  // BEQ x0, x0, -8
  dut.io.instr.poke("b11111110000000000000110011100011".U)
  dut.io.immd_se.expect("b11111111111111111111111111111000".U)

  // U-Type: LUI
  dut.io.instr.poke("b00000000001000000000000010110111".U)
  dut.io.immd_se.expect("b00000000001000000000000000000000".U)


  // U-Type: LUI
  dut.io.instr.poke("b10000000000000000000000010110111".U)
  dut.io.immd_se.expect("b10000000000000000000000000000000".U)

  // JAL +4
  dut.io.instr.poke("b00000000010000000000000001101111".U)
  dut.io.immd_se.expect("b00000000000000000000000000000100".U)

  // JAL +8
  dut.io.instr.poke("b00000000100000000000000001101111".U)
  dut.io.immd_se.expect("b00000000000000000000000000001000".U)

  // JAL -4
  dut.io.instr.poke("b11111111110111111111000001101111".U)
  dut.io.immd_se.expect("b11111111111111111111111111111100".U)

  // JAL -8
  dut.io.instr.poke("b11111111100111111111000001101111".U)
  dut.io.immd_se.expect("b11111111111111111111111111111000".U)
  
    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
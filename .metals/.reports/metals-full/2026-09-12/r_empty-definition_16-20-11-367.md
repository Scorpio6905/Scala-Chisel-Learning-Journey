error id: file://<WORKSPACE>/src/test/scala/regfile/Controltest.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/test/scala/regfile/Controltest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/dut/io/RegWrite.
	 -chisel3/tester/dut/io/RegWrite.
	 -dut/io/RegWrite.
	 -scala/Predef.dut.io.RegWrite.
offset: 450
uri: file://<WORKSPACE>/src/test/scala/regfile/Controltest.scala
text:
```scala
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
      dut.io.Re@@gWrite.expect(true.B)
      dut.io.MemtoReg.expect(true.B)
      
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

```


#### Short summary: 

empty definition using pc, found symbol in pc: 
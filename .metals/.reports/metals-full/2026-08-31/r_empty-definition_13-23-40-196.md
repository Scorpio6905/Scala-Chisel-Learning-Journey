error id: file://<WORKSPACE>/src/test/scala/lab3/AluOpstest.scala:
file://<WORKSPACE>/src/test/scala/lab3/AluOpstest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/chisel3.
	 -chisel3/tester/chisel3.
	 -chisel3/experimental/BundleLiterals.chisel3.
	 -chisel3.
	 -scala/Predef.chisel3.
offset: 21
uri: file://<WORKSPACE>/src/test/scala/lab3/AluOpstest.scala
text:
```scala
package lab3

import @@chisel3._
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
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
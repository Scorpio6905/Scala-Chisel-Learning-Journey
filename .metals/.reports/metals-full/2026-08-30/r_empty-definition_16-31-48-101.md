error id: file://<WORKSPACE>/src/test/scala/lab3/BranchControltest.scala:lab3/BranchControltest#`<error: <none>>`#
file://<WORKSPACE>/src/test/scala/lab3/BranchControltest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/FreeSpec#
	 -chisel3/tester/FreeSpec#
	 -org/scalatest/FreeSpec#
	 -chisel3/experimental/BundleLiterals.FreeSpec#
	 -FreeSpec#
	 -scala/Predef.FreeSpec#
offset: 170
uri: file://<WORKSPACE>/src/test/scala/lab3/BranchControltest.scala
text:
```scala
package lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._



class BranchControltest extends FreeS@@pec with ChiselScalatestTester {
  "dut test" in {
    test(new BranchControl) { dut =>
 
     dut.io.branch.poke(1.B)  
     dut.io.funct3.poke("b100".U)
      
     dut.io.arg_x.poke(15.U)
     dut.io.arg_y.poke(16.U)

     dut.io.br_taken.expect(1.B)

    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
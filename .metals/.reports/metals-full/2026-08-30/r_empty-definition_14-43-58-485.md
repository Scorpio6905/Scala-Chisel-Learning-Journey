error id: file://<WORKSPACE>/src/test/scala/lab3/BranchControltest.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/test/scala/lab3/BranchControltest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/dut/io.
	 -chisel3/tester/dut/io.
	 -chisel3/experimental/BundleLiterals.dut.io.
	 -dut/io.
	 -scala/Predef.dut.io.
offset: 272
uri: file://<WORKSPACE>/src/test/scala/lab3/BranchControltest.scala
text:
```scala
package lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._



class BranchControltest extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new BranchControl) { dut =>
 

     dut.io@@.funct3.poke("b100".U)
      
     dut.io.in2.poke(3.U)
     dut.io.in3.poke(4.U)

     dut.io.sel.poke(4.U)
    
     dut.io.out.expect(3.U)
   

    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
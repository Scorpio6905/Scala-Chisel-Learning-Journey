error id: file://<WORKSPACE>/src/test/scala/lab2/Encoder4to2test.scala:lab2/`<error: <none>>`.
file://<WORKSPACE>/src/test/scala/lab2/Encoder4to2test.scala
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
uri: file://<WORKSPACE>/src/test/scala/lab2/Encoder4to2test.scala
text:
```scala
package lab2

import @@chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Encoder4to2test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Encoder4to2) { dut =>
 

     dut.io.in0.poke(1.U)
     dut.io.in1.poke(2.U)    
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
error id: file://<WORKSPACE>/src/test/scala/Gates/Eightbitfulladdertest.scala:local0
file://<WORKSPACE>/src/test/scala/Gates/Eightbitfulladdertest.scala
empty definition using pc, found symbol in pc: local0
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/dut/io/b1.
	 -chisel3/tester/dut/io/b1.
	 -chisel3/experimental/BundleLiterals.dut.io.b1.
	 -dut/io/b1.
	 -scala/Predef.dut.io.b1.
offset: 302
uri: file://<WORKSPACE>/src/test/scala/Gates/Eightbitfulladdertest.scala
text:
```scala
package Gates

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Eightbitfulladdertest extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Eightbitfulladder) { dut =>



   dut.io.a1.poke(1.B)
   dut.io.@@b1.poke(1.B)
 

 
   dut.io.sum.expect(1.B)  
   dut.io.cout.expect(1.B)  

   dut.clock.step(1)
   
    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: local0
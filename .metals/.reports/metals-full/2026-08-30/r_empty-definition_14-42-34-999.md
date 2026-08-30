error id: file://<WORKSPACE>/src/test/scala/lab2/Encoder4to2test.scala:lab2/Encoder4to2#
file://<WORKSPACE>/src/test/scala/lab2/Encoder4to2test.scala
empty definition using pc, found symbol in pc: lab2/Encoder4to2#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/Encoder4to2#
	 -chisel3/tester/Encoder4to2#
	 -chisel3/experimental/BundleLiterals.Encoder4to2#
	 -Encoder4to2#
	 -scala/Predef.Encoder4to2#
offset: 231
uri: file://<WORKSPACE>/src/test/scala/lab2/Encoder4to2test.scala
text:
```scala
package lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Encoder4to2test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new @@Encoder4to2) { dut =>
 

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

empty definition using pc, found symbol in pc: lab2/Encoder4to2#
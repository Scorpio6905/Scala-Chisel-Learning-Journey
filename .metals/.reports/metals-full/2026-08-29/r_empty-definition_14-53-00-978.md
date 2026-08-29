error id: file://<WORKSPACE>/src/test/scala/lab2/Mux5to1test.scala:lab2/`<error: <none>>`.
file://<WORKSPACE>/src/test/scala/lab2/Mux5to1test.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/chisel3.
	 -chisel3/tester/chisel3.
	 -chisel3/experimental/BundleLiterals.chisel3.
	 -chisel3.
	 -scala/Predef.chisel3.
offset: 92
uri: file://<WORKSPACE>/src/test/scala/lab2/Mux5to1test.scala
text:
```scala
package lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import @@chisel3.experimental.BundleLiterals._


class Mux5to1test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Mux5to1) { dut =>
 
     dut.io.s0.poke(1.B)
     dut.io.s1.poke(0.B)
     dut.io.s2.poke(1.B)
    
     dut.io.out.expect(32.U)
   

    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
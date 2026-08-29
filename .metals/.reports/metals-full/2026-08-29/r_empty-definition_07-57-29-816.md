error id: file://<WORKSPACE>/src/test/scala/lab2/Ex2test.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/test/scala/lab2/Ex2test.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/dut/io.
	 -chisel3/tester/dut/io.
	 -chisel3/experimental/BundleLiterals.dut.io.
	 -dut/io.
	 -scala/Predef.dut.io.
offset: 283
uri: file://<WORKSPACE>/src/test/scala/lab2/Ex2test.scala
text:
```scala
package lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Ex2test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Ex2) { dut =>
 

      dut.io.in0.poke(10.U)   
      dut.io@@.in1.poke(20.U)

      dut.io.select.poke(false.B)
      dut.io.out.expect(10.U)
   

    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
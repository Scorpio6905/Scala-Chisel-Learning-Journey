error id: file://<WORKSPACE>/src/test/scala/lab2/Ex1test.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/test/scala/lab2/Ex1test.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/test.
	 -chisel3/test#
	 -chisel3/test().
	 -chisel3/tester/test.
	 -chisel3/tester/test#
	 -chisel3/tester/test().
	 -chisel3/experimental/BundleLiterals.test.
	 -chisel3/experimental/BundleLiterals.test#
	 -chisel3/experimental/BundleLiterals.test().
	 -test.
	 -test#
	 -test().
	 -scala/Predef.test.
	 -scala/Predef.test#
	 -scala/Predef.test().
offset: 214
uri: file://<WORKSPACE>/src/test/scala/lab2/Ex1test.scala
text:
```scala
package lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Ex1test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    @@test(new Mux_2to1) { dut =>
 

      dut.io.in_A.poke(10.U)   
      dut.io.in_B.poke(20.U)

      dut.io.select.poke(false.B)
      dut.io.out.expect(10.U)
   

    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
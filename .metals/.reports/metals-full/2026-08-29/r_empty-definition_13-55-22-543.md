error id: file://<WORKSPACE>/src/test/scala/lab2/Mux5to1test.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/test/scala/lab2/Mux5to1test.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/dut/io/s0/poke.
	 -chisel3/dut/io/s0/poke#
	 -chisel3/dut/io/s0/poke().
	 -chisel3/tester/dut/io/s0/poke.
	 -chisel3/tester/dut/io/s0/poke#
	 -chisel3/tester/dut/io/s0/poke().
	 -chisel3/experimental/BundleLiterals.dut.io.s0.poke.
	 -chisel3/experimental/BundleLiterals.dut.io.s0.poke#
	 -chisel3/experimental/BundleLiterals.dut.io.s0.poke().
	 -dut/io/s0/poke.
	 -dut/io/s0/poke#
	 -dut/io/s0/poke().
	 -scala/Predef.dut.io.s0.poke.
	 -scala/Predef.dut.io.s0.poke#
	 -scala/Predef.dut.io.s0.poke().
offset: 264
uri: file://<WORKSPACE>/src/test/scala/lab2/Mux5to1test.scala
text:
```scala
package lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Mux5to1test extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Mux5to1) { dut =>
 
     dut.io.s0.po@@ke(0)
    
     dut.io.out.expect(3.U)
   

    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
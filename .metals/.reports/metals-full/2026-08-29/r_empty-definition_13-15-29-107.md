error id: file://<WORKSPACE>/src/test/scala/lab2/Ex2test.scala:lab2/Ex2test#`<error: <none>>`#
file://<WORKSPACE>/src/test/scala/lab2/Ex2test.scala
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
offset: 154
uri: file://<WORKSPACE>/src/test/scala/lab2/Ex2test.scala
text:
```scala
package lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class Ex2test extends @@FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Ex2) { dut =>
 

      dut.io.in0.poke(0.B)   
      dut.io.in1.poke(1.B)
      dut.io.in2.poke(0.B)   
      dut.io.in3.poke(1.B)
      dut.io.in4.poke(0.B)   
      dut.io.in5.poke(1.B)
      dut.io.in6.poke(0.B)   
      dut.io.in7.poke(1.B)

      dut.io.sel0.poke(true.B)
      dut.io.sel1.poke(true.B)
      dut.io.sel2.poke(false.B)
      dut.io.out.expect(1.B)
   

    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
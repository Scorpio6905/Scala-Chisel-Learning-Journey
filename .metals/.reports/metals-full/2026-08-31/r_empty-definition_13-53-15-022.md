error id: file://<WORKSPACE>/src/test/scala/lab3/Valid_Interfacetest.scala:
file://<WORKSPACE>/src/test/scala/lab3/Valid_Interfacetest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/dut/io/out.
	 -chisel3/tester/dut/io/out.
	 -chisel3/experimental/BundleLiterals.dut.io.out.
	 -dut/io/out.
	 -scala/Predef.dut.io.out.
offset: 307
uri: file://<WORKSPACE>/src/test/scala/lab3/Valid_Interfacetest.scala
text:
```scala
package lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._



class Valid_Interfacetest extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new Decoder2to4){ dut =>
 
     dut.io.in.poke("b00".U)  
   

     dut.io.@@out.bits.expect("b0001")

    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
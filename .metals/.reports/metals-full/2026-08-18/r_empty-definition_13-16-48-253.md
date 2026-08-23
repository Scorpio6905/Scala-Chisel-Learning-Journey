error id: file://<WORKSPACE>/src/test/Test_Gates/andtest.scala:
file://<WORKSPACE>/src/test/Test_Gates/andtest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb

found definition using fallback; symbol U
offset: 284
uri: file://<WORKSPACE>/src/test/Test_Gates/andtest.scala
text:
```scala
package Gates
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class tb_dut extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new gate) { dut =>
    dut.io.a.poke(0.U)
    dut.io.out.expect(0.@@U)    
    dut.clock.step(1)
    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
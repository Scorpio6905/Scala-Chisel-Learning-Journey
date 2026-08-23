error id: file://<WORKSPACE>/src/test/Test_Gates/andtest.scala:package_name/`<error: <none>>`.
file://<WORKSPACE>/src/test/Test_Gates/andtest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/chisel3.
	 -chisel3/tester/chisel3.
	 -chisel3/experimental/BundleLiterals.chisel3.
	 -chisel3.
	 -scala/Predef.chisel3.
offset: 101
uri: file://<WORKSPACE>/src/test/Test_Gates/andtest.scala
text:
```scala
package package_name
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import ch@@isel3.experimental.BundleLiterals._


class tb_dut extends FreeSpec with ChiselScalatestTester {
  "dut test" in {
    test(new gate) { dut =>
    dut.io.in1.poke(0.U)
    dut.io.out.expect(0.U)    
    dut.clock.step(1)
    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
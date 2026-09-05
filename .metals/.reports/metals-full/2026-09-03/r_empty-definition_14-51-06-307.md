error id: file://<WORKSPACE>/src/test/scala/regfile/regfiletest.scala:
file://<WORKSPACE>/src/test/scala/regfile/regfiletest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/FreeSpec.
	 -chisel3/FreeSpec#
	 -chisel3/FreeSpec().
	 -chisel3/tester/FreeSpec.
	 -chisel3/tester/FreeSpec#
	 -chisel3/tester/FreeSpec().
	 -org/scalatest/FreeSpec.
	 -org/scalatest/FreeSpec#
	 -org/scalatest/FreeSpec().
	 -chisel3/experimental/BundleLiterals.FreeSpec.
	 -chisel3/experimental/BundleLiterals.FreeSpec#
	 -chisel3/experimental/BundleLiterals.FreeSpec().
	 -FreeSpec.
	 -FreeSpec#
	 -FreeSpec().
	 -scala/Predef.FreeSpec.
	 -scala/Predef.FreeSpec#
	 -scala/Predef.FreeSpec().
offset: 83
uri: file://<WORKSPACE>/src/test/scala/regfile/regfiletest.scala
text:
```scala
package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.Free@@Spec
import chisel3.experimental.BundleLiterals._
import scala.util.Random


class regfiletest extends FreeSpec with ChiselScalatestTester{
    "Register Test" in {
        test(new RegFile){ dut =>

            dut.io.raddr1.poke(6.U)
            dut.io.raddr2.poke(7.U)

            dut.io.wen.poke(1.B)
            dut.io.waddr(8.U)
            dut.io.wdata(80.U)

            dut.io.rdata1.expect(0.U)
            dut.io.rdata2.expect(0.U)
        }
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
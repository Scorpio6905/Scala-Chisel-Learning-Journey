error id: file://<WORKSPACE>/src/test/scala/regfile/regfiletest.scala:regfile/`<error: <none>>`.
file://<WORKSPACE>/src/test/scala/regfile/regfiletest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/chisel3.
	 -chisel3/tester/chisel3.
	 -chisel3.
	 -scala/Predef.chisel3.
offset: 26
uri: file://<WORKSPACE>/src/test/scala/regfile/regfiletest.scala
text:
```scala
package regfile

import ch@@isel3._
import chisel3.tester._
import org.scalatest.FreeSpec



class regfiletest extends FreeSpec with ChiselScalatestTester{
    "Register Test" in {
        test(new RegFile){ dut =>

            dut.io.raddr1.poke(6.U)
            dut.io.raddr2.poke(8.U)

            dut.io.wen.poke(1.B)
            dut.io.waddr.poke(8.U)
            dut.io.wdata.poke(90.U)

            dut.io.rdata1.expect(0.U)
            dut.io.rdata2.expect(80.U)
        
        }

    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
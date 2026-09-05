error id: file://<WORKSPACE>/src/test/scala/regfile/regfiletest.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/test/scala/regfile/regfiletest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/dut/io/rdata1.
	 -chisel3/tester/dut/io/rdata1.
	 -dut/io/rdata1.
	 -scala/Predef.dut.io.rdata1.
offset: 427
uri: file://<WORKSPACE>/src/test/scala/regfile/regfiletest.scala
text:
```scala
package regfile

import chisel3._
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

          

            dut.io.rdat@@a1.expect(0.U)
            dut.io.rdata2.expect(80.U)

            dut.clock.step(1)        
        }

    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
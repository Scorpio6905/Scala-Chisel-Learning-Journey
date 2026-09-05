error id: file://<WORKSPACE>/src/test/scala/regfile/SyncMemorytest.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/test/scala/regfile/SyncMemorytest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/dut/io/wr_enable.
	 -chisel3/tester/dut/io/wr_enable.
	 -dut/io/wr_enable.
	 -scala/Predef.dut.io.wr_enable.
offset: 393
uri: file://<WORKSPACE>/src/test/scala/regfile/SyncMemorytest.scala
text:
```scala
package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec


class SyncMemorytest extends FreeSpec with ChiselScalatestTester{
    " " in {
      test(new Parameterized_Mem()) { dut =>
            dut.io.dataIn.poke(32.U)
            dut.io.addr.poke(5.U)
            dut.io.rd_enable.poke(1.B)

            dut.clock.step()
            
            dut.io.wr_enab@@le.poke(1.B)
            dut.io.dataOut.expect(32.U)
      }
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
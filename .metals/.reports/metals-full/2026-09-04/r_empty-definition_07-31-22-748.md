error id: file://<WORKSPACE>/src/test/scala/regfile/Masktest.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/test/scala/regfile/Masktest.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb

found definition using fallback; symbol poke
offset: 340
uri: file://<WORKSPACE>/src/test/scala/regfile/Masktest.scala
text:
```scala
package regfile

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec


class Masktest extends FreeSpec with ChiselScalatestTester{
    "" in {
        test(new MaskedReadWriteSmem){ dut=>
            dut.io.enable.poke(1.B)
            dut.io.write.poke(1.B)
            dut.io.addr.poke(10.U)
            dut.io.mask(0).@@poke(1.B)
            
        }
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
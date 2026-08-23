error id: file://<WORKSPACE>/src/test/scala/gcd/lab1test.scala:
file://<WORKSPACE>/src/test/scala/gcd/lab1test.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -DecoupledGcd.
	 -DecoupledGcd#
	 -DecoupledGcd().
	 -scala/Predef.DecoupledGcd.
	 -scala/Predef.DecoupledGcd#
	 -scala/Predef.DecoupledGcd().
offset: 224
uri: file://<WORKSPACE>/src/test/scala/gcd/lab1test.scala
text:
```scala
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class GCDSpec extends FreeSpec with ChiselScalatestTester {

  "Glab 1 verify" in {
    test(new Decoupled@@Gcd(16)) { dut =>
      dut.input.initSource()
      dut.input.setSourceClock(dut.clock)
      dut.output.initSink()
      dut.output.setSinkClock(dut.clock)
      dut.io.result.expect(1.B)

    }
    
}


```


#### Short summary: 

empty definition using pc, found symbol in pc: 
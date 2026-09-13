error id: file://<WORKSPACE>/src/main/scala/regfile/Jalr.scala:local4
file://<WORKSPACE>/src/main/scala/regfile/Jalr.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/Bundle#
	 -Bundle#
	 -scala/Predef.Bundle#
offset: 83
uri: file://<WORKSPACE>/src/main/scala/regfile/Jalr.scala
text:
```scala
package regfile

import chisel3._


class Jalr extends Module {
  val io = IO (new @@Bundle {
	val in1 = Input(SInt(32.W))
	val in2 = Input(SInt(32.W))
	val out = Output(SInt(32.W))
  })
	val a = io.in1 + io.in2
	io.out := a & (-2).S(32.W)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
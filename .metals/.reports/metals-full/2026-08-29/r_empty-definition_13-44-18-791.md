error id: file://<WORKSPACE>/src/main/scala/lab2/Mux5to1.scala:
file://<WORKSPACE>/src/main/scala/lab2/Mux5to1.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/in1.
	 -chisel3/in1#
	 -chisel3/in1().
	 -in1.
	 -in1#
	 -in1().
	 -scala/Predef.in1.
	 -scala/Predef.in1#
	 -scala/Predef.in1().
offset: 357
uri: file://<WORKSPACE>/src/main/scala/lab2/Mux5to1.scala
text:
```scala
package Lab2
import chisel3._
class LM_IO_Interface extends Bundle {

    val s0 = Input(Bool())
    val s1 = Input(Bool())
    val s2 = Input(Bool())
    val out = Output(UInt(32.W))
}

class Mux5to1 extends Module {
    val io = IO(new LM_IO_Interface)
    // Start coding here
    io.out := MuxLookup(io.sel , false.B, Array(
(0.U)-> io.in0,
(1.U)->io.in@@1,
(2.U)->
(3.U)->
(4.U)->
(5.U)->
(6.U)->
(7.U)->
)
}


io.in3,
io.in4,
io.in5,
io.in6,
io.in7)

    // End your code here
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 
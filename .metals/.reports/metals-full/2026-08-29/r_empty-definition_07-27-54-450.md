error id: file://<WORKSPACE>/src/main/scala/lab2/Ex2.scala:
file://<WORKSPACE>/src/main/scala/lab2/Ex2.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -U.
	 -U#
	 -U().
	 -scala/Predef.U.
	 -scala/Predef.U#
	 -scala/Predef.U().
offset: 543
uri: file://<WORKSPACE>/src/main/scala/lab2/Ex2.scala
text:
```scala
package lab2
import chisel3._
import chisel3.util._


class Ex2 extends Module {
    val io = IO(new Bundle{
        val in0 = Input(Bool())
        val in1 = Input(Bool())
        val in2 = Input(Bool())
        val in3 = Input(Bool())
        val in4 = Input(Bool())
        val in5 = Input(Bool())
        val in6 = Input(Bool())
        val in7 = Input(Bool())
        val sel = Input(UInt(3.W))
        val out = Output(Bool())
    })
    io.out := MuxLookup(io.sel , false.B, Array(
   (0.U)->
io.in0,
(1.U)->
(2.U)->
(3.U)->
(4.U)->
(5.@@U)->
(6.U)->
(7.U)->
)
}
io.in1,
io.in2,
io.in3,
io.in4,
io.in5,
io.in6,
io.in7)
))
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 
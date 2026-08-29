error id: file://<WORKSPACE>/src/main/scala/lab2/Ex2.scala:lab2/`<error: <none>>`.
file://<WORKSPACE>/src/main/scala/lab2/Ex2.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/chisel3.
	 -chisel3/util/chisel3.
	 -chisel3.
	 -scala/Predef.chisel3.
offset: 38
uri: file://<WORKSPACE>/src/main/scala/lab2/Ex2.scala
text:
```scala
package lab2

import chisel3._
import @@chisel3.util._


class Ex2 extends Module {
    val io = IO(new Bundle {
        val in0 = Input(Bool())
        val in1 = Input(Bool())
        val in2 = Input(Bool())
        val in3 = Input(Bool())
        val in4 = Input(Bool())
        val in5 = Input(Bool())
        val in6 = Input(Bool())
        val in7 = Input(Bool())
        val sel2 = Input(Bool())
        val sel1 = Input(Bool())
        val sel0 = Input(Bool())
        val out = Output(Bool())
    })

    io.out := MuxLookup(io.sel2, false.B, Array(

        (0.B) -> MuxLookup(io.sel1, false.B, Array(
            (0.B) -> MuxLookup(io.sel0, false.B, Array(
                (0.B) -> io.in0,
                (1.B) -> io.in1
            )),
            (1.B) -> MuxLookup(io.sel0, false.B, Array(
                (0.B) -> io.in2,
                (1.B) -> io.in3
            ))
        )),

        (1.B) -> MuxLookup(io.sel1, false.B, Array(
            (0.B) -> MuxLookup(io.sel0, false.B, Array(
                (0.B) -> io.in4,
                (1.B) -> io.in5
            )),
            (1.B) -> MuxLookup(io.sel0, false.B, Array(
                (0.B) -> io.in6,
                (1.B) -> io.in7
            ))
        ))

    ))
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 
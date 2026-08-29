error id: file://<WORKSPACE>/src/main/scala/lab2/barrel_shifter.scala:
file://<WORKSPACE>/src/main/scala/lab2/barrel_shifter.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb

found definition using fallback; symbol U
offset: 323
uri: file://<WORKSPACE>/src/main/scala/lab2/barrel_shifter.scala
text:
```scala
package lab2
import chisel3._
import chisel3.util._

class barrel_shift extends Module{
    val io = IO(new Bundle{
    val in = Vec(4, Input(Bool()))
    val sel = Vec(2, Input(Bool()))
    val shift_type = Input(Bool())
    val out = Vec(4, Output(Bool()))
})

    io.out(0) := MuxCase(false.B, Array(
    (io.sel(0)===0.@@U && io.sel(1)===0.U)-> in(0)
    (io.sel===1.U)->
    (io.sel===2.U)->
    (io.sel===3.U)->
    (io.sel===4.U)->
    (io.sel===5.U)->
    (io.sel===6.U)->
    (io.sel===7.U)->

    ))
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 
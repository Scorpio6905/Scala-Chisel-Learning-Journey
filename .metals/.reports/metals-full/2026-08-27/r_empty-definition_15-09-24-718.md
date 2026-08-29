error id: file://<WORKSPACE>/src/main/scala/Gates/counter_up_down.scala:when.
file://<WORKSPACE>/src/main/scala/Gates/counter_up_down.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/when.
	 -chisel3/when#
	 -chisel3/when().
	 -chisel3/util/when.
	 -chisel3/util/when#
	 -chisel3/util/when().
	 -when.
	 -when#
	 -when().
	 -scala/Predef.when.
	 -scala/Predef.when#
	 -scala/Predef.when().
offset: 493
uri: file://<WORKSPACE>/src/main/scala/Gates/counter_up_down.scala
text:
```scala
package Gates
import chisel3._
import chisel3.util._
import java.io.File

class counter_up_down(n: Int) extends Module {
    val io = IO ( new Bundle {

        val data_in = Input(UInt(n.W))
        val reload = Input(Bool())
        val out = Output(Bool())
})

    val counter = RegInit(0.U(n.W))
    val max_count = RegInit(6.U(n.W))
    val down = false.B

    when ( counter === max_count ) {
        down = true.B
        
        io.out := data_in
    }.otherwise{
        
    }

    @@when (down === true.B) {

    }
 
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
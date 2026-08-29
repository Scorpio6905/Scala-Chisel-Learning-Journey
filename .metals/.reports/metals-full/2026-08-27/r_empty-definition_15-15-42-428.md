error id: file://<WORKSPACE>/src/main/scala/Gates/counter_up_down.scala:
file://<WORKSPACE>/src/main/scala/Gates/counter_up_down.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/counter.
	 -chisel3/counter#
	 -chisel3/counter().
	 -chisel3/util/counter.
	 -chisel3/util/counter#
	 -chisel3/util/counter().
	 -counter.
	 -counter#
	 -counter().
	 -scala/Predef.counter.
	 -scala/Predef.counter#
	 -scala/Predef.counter().
offset: 589
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
        //val reload = Input(Bool())
        val out = Output(Bool())
})

    val counter = RegInit(0.U(n.W))
    val max_count = RegInit(6.U(n.W))
    val down = false.B

    when ( counter === max_count ) {
        down = true.B
        io.out := data_in

    }.otherwise{
        when (down === true.B) {
            counter := counter - 1
            
        }.otherwise{
            when (co@@unter === 0){
                down = false.B
                io.out := data_in
         
        }.otherwise{
            counter:= counter + 1
        }

    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 
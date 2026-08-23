error id: file://<WORKSPACE>/src/main/scala/and.scala:
file://<WORKSPACE>/src/main/scala/and.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/result.
	 -chisel3/result#
	 -chisel3/result().
	 -result.
	 -result#
	 -result().
	 -scala/Predef.result.
	 -scala/Predef.result#
	 -scala/Predef.result().
offset: 422
uri: file://<WORKSPACE>/src/main/scala/and.scala
text:
```scala
import chisel3._
import javax.swing.UIManager.LookAndFeelInfo

class gates() extends Module {
    val io = IO(new Bundle{

            val a = Input(Bool())
            val b = Input(Bool())
            val and_output= Output(Bool())
            val or_output= Output(Bool())
            val not_output= Output(Bool())
            val xor_output= Output(Bool())

    })
    io.result := io.a & io.b
    println(s"Result: $@@result")


    
    }
```


#### Short summary: 

empty definition using pc, found symbol in pc: 